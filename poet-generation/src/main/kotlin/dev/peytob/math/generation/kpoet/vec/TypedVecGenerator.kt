package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generatedAnnotation
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.VectorDescriptor
import dev.peytob.math.generation.kpoet.model.VectorSpec
import kotlin.RuntimeException

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

fun generateTypedStructVecTemplate(primitive: PrimitiveDescriptor, vector: VectorDescriptor, typeSpecGenerator: () -> TypeSpec): TypeSpec {
    println("Generating ${vector.size}-component vector structure class for ${primitive.cls.simpleName}")

    if (primitive.cls.javaPrimitiveType == null) {
        throw RuntimeException("Vectors cant be generated from non-primitive class ${primitive.cls.simpleName}")
    }

    return typeSpecGenerator()
}
