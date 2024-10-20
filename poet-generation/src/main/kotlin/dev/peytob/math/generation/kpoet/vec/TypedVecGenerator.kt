package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.generatedAnnotation
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.VectorDescriptor
import dev.peytob.math.generation.kpoet.model.VectorOrder
import dev.peytob.math.generation.kpoet.model.VectorSpec

fun generateTypedImmutableStructVec(primitive: PrimitiveDescriptor, vector: VectorDescriptor): VectorSpec {
    val typeSpec = generateTypedStructVecTemplate(primitive, vector) {
        val primaryConstructor = run {
            val builder = FunSpec.constructorBuilder()

            vector.components.forEach {
                builder.addParameter(it, primitive.cls)
            }

            builder.build()
        }

        val componentProperties = vector.components.map {
            PropertySpec.builder(it, primitive.cls, KModifier.OVERRIDE)
                .initializer(it)
                .build()
        }

        TypeSpec.classBuilder("StructVec${vector.size}${primitive.postfix}")
            .addSuperinterface(vector.immutableBase.parameterizedBy(primitive.cls))
            .addModifiers(KModifier.DATA, KModifier.INTERNAL)
            .addAnnotation(generatedAnnotation())
            .primaryConstructor(primaryConstructor)
            .addProperties(componentProperties)
            .addProperty(
                PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
                    .initializer(primitive.sizeBytes.toString())
                    .build()
            )
            .addProperty(
                PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
                    .initializer((primitive.sizeBytes * vector.size).toString())
                    .build()
            )
            .build()
    }

    return VectorSpec(
        vectorDescriptor = vector,
        primitiveDescriptor = primitive,
        typeSpec =  typeSpec,
        isImmutable = true
    )
}

fun generateTypedMutableStructVec(primitive: PrimitiveDescriptor, vector: VectorDescriptor): VectorSpec {
    val typeSpec = generateTypedStructVecTemplate(primitive, vector) {
        val primaryConstructor = run {
            val builder = FunSpec.constructorBuilder()

            vector.components.forEach {
                builder.addParameter(it, primitive.cls)
            }

            builder.build()
        }

        val componentProperties = vector.components.map {
            PropertySpec.builder(it, primitive.cls, KModifier.OVERRIDE)
                .mutable(true)
                .initializer(it)
                .build()
        }

        TypeSpec.classBuilder("StructMutVec${vector.size}${primitive.postfix}")
            .addSuperinterface(vector.mutableBase.parameterizedBy(primitive.cls))
            .addModifiers(KModifier.INTERNAL)
            .addAnnotation(generatedAnnotation())
            .primaryConstructor(primaryConstructor)
            .addProperties(componentProperties)
            .addProperty(
                PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
                    .initializer(primitive.sizeBytes.toString())
                    .build()
            )
            .addProperty(
                PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
                    .initializer((primitive.sizeBytes * vector.size).toString())
                    .build()
            )
            .build()
    }

    return VectorSpec(
        vectorDescriptor = vector,
        primitiveDescriptor = primitive,
        typeSpec =  typeSpec,
        isImmutable = false
    )
}

private fun generateTypedStructVecTemplate(primitive: PrimitiveDescriptor, vector: VectorDescriptor, typeSpecGenerator: () -> TypeSpec): TypeSpec {
    println("Generating ${vector.size}-component vector structure class for ${primitive.cls.simpleName}")

    return typeSpecGenerator()
}

fun generateVectorDescriptors(vectorOrders: Collection<VectorOrder>): Collection<VectorDescriptor> {
    return vectorOrders.map { vectorOrder ->
        val accessor = generateAccessor(vectorOrder)
        val accessorClassName = ClassName(vectorOrder.destinationPackage, accessor.name!!)

        val immutableBase = generateImmutableBase(vectorOrder, accessorClassName)
        val mutableBase = generateMutableBase(vectorOrder, accessorClassName)

        VectorDescriptor(
            components = vectorOrder.components,

            immutableBase = ClassName(vectorOrder.destinationPackage, immutableBase.name!!),
            immutableBaseTypeSpec = immutableBase,

            mutableBase = ClassName(vectorOrder.destinationPackage, mutableBase.name!!),
            mutableBaseTypeSpec = mutableBase,

            accessor = accessorClassName,
            accessorTypeSpec = accessor,

            destinationPackage = vectorOrder.destinationPackage
        )
    }
}

private fun generateAccessor(vectorOrder: VectorOrder): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    val typeSpecBuilder = TypeSpec.interfaceBuilder("Vec${vectorOrder.components.size}Accessor")
        .generated()
        .addTypeVariable(typeVariable)
        .addProperty("elementSizeBytes", Int::class)
        .addProperty("vectorSizeBytes", Int::class)
        .addProperty(PropertySpec.builder("elementsCount", Int::class)
            .getter(FunSpec.getterBuilder()
                .addCode("return %L", vectorOrder.components.size.toString())
                .build())
            .build())

    vectorOrder.components.forEach { component ->
        typeSpecBuilder.addProperty(component, typeVariable)
    }

    vectorOrder.components.forEachIndexed { index, component ->
        typeSpecBuilder.addFunction(FunSpec.builder("component${index}")
            .addModifiers(KModifier.OPERATOR)
            .returns(typeVariable)
            .addCode("return %L", component)
            .build())
    }

    val getCodeBlockBuilder = CodeBlock.builder()

    getCodeBlockBuilder.beginControlFlow("when (index)")
    vectorOrder.components.forEachIndexed {index, component ->
        getCodeBlockBuilder.addStatement("$index -> $component")
    }
    getCodeBlockBuilder.addStatement("else -> throw IndexOutOfBoundsException()")

    getCodeBlockBuilder.endControlFlow()

    typeSpecBuilder.addFunction(FunSpec.builder("get")
        .addModifiers(KModifier.OPERATOR)
        .addCode(getCodeBlockBuilder.build())
        .addParameter("index", Int::class)
        .build())

    return typeSpecBuilder.build()
}

private fun generateMutableBase(vectorOrder: VectorOrder, accessorClassName: ClassName): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    val typeSpecBuilder = TypeSpec.interfaceBuilder("MutVec${vectorOrder.components.size}")
        .generated()
        .addTypeVariable(typeVariable)
        .addSuperinterface(accessorClassName.parameterizedBy(typeVariable))

    vectorOrder.components.forEach { component ->
        val property = PropertySpec.builder(component, typeVariable)
            .addModifiers(KModifier.OVERRIDE)
            .mutable()
            .build()

        typeSpecBuilder.addProperty(property)
    }

    return typeSpecBuilder.build()
}

private fun generateImmutableBase(vectorOrder: VectorOrder, accessorClassName: ClassName): TypeSpec {
    val typeVariable = TypeVariableName("T", listOf(Number::class))

    return TypeSpec.interfaceBuilder("Vec${vectorOrder.components.size}")
        .generated()
        .addTypeVariable(typeVariable)
        .addSuperinterface(accessorClassName.parameterizedBy(typeVariable))
        .build()
}
