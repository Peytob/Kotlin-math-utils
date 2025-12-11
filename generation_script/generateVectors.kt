package org.example.generation

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import generation.addAlias
import generation.addPackage
import generation.addPrimitive
import generation.addVectorDescription
import kotlin.reflect.KClass

fun generateVectorInterfaces(context: Context) {
    generateVecInterface(context)

    generateVec2Interfaces(context)
    generateVec2Realisations(context)

    generateVec3Interfaces(context)
    generateVec3Realisations(context)
}

fun generateVecInterface(context: Context) {
    val typeVar = TypeVariableName("T", listOf(Number::class))
    val vecType = ClassName(context.pkg("vec"), "Vec").parameterizedBy(typeVar)

    context.baseInterfaces.vec = TypeSpec.interfaceBuilder("Vec")
        .generated()
        .addPackage(context.pkg("vec"))
        .addKdoc("Base type for all vectors. You should use special-cases vectors in most cases")
        .addSuperinterface(context.baseInterfaces.memorizedObject.getClassName())
        .addTypeVariable(typeVar)
        .addFunction(FunSpec.builder("get")
            .addModifiers(KModifier.OPERATOR, KModifier.ABSTRACT)
            .addParameter("i", Int::class)
            .returns(typeVar)
            .build())
        .addFunction(FunSpec.builder("set")
            .addModifiers(KModifier.OPERATOR, KModifier.ABSTRACT)
            .addParameter("i", Int::class)
            .addParameter("value", typeVar)
            .build())
        .addFunction(FunSpec.builder("copyMutable")
            .addModifiers(KModifier.ABSTRACT)
            .addKdoc("Creates mutable copy of this vector. Copy will be saved in separated structure")
            .returns(vecType)
            .build())
        .addFunction(FunSpec.builder("copyImmutable")
            .addKdoc("Creates immutable copy of this vector. Copy will be saved in separated structure")
            .addCode(CodeBlock.of("TODO(\"Immutable vectors are not implemented yet\")"))
            .returns(ClassName(context.pkg("vec"), "Vec").parameterizedBy(typeVar))
            .build())
        .addProperty("mutable", Boolean::class)
        .build()
}

fun generateVec2Interfaces(context: Context) {
    val typeVar = TypeVariableName("T", listOf(Number::class))

    context.vec2.baseInterface = TypeSpec.interfaceBuilder("Vec2")
        .generated()
        .addPackage(context.pkg("vec"))
        .addVectorDescription(context.vec2)
        .addSuperinterface(context.baseInterfaces.vec.getClassName(typeVar))
        .addKdoc("Base type for all two-components vectors. You should use interfaces in your code")
        .addTypeVariable(typeVar)
        .addProperty(PropertySpec.builder("x", typeVar)
            .mutable(true)
            .build())
        .addProperty(PropertySpec.builder("y", typeVar)
            .mutable(true)
            .build())
        .build()

    context.vec2.interfaces = listOf(
        generateVecInterface(context, context.vec2,"Vec2f", Float::class),
        generateVecInterface(context, context.vec2, "Vec2d", Double::class),
        generateVecInterface(context, context.vec2, "Vec2i", Int::class),
        generateVecInterface(context, context.vec2,"Vec2l", Long::class)
    )
}

fun generateVec3Interfaces(context: Context) {
    val typeVar = TypeVariableName("T", listOf(Number::class))

    context.vec3.baseInterface = TypeSpec.interfaceBuilder("Vec3")
        .generated()
        .addPackage(context.pkg("vec"))
        .addVectorDescription(context.vec3)
        .addSuperinterface(context.baseInterfaces.vec.getClassName(typeVar))
        .addKdoc("Base type for all three-components vectors. You can use aliases in your code")
        .addTypeVariable(typeVar)
        .addProperty(PropertySpec.builder("x", typeVar)
            .mutable(true)
            .build())
        .addProperty(PropertySpec.builder("y", typeVar)
            .mutable(true)
            .build())
        .addProperty(PropertySpec.builder("z", typeVar)
            .mutable(true)
            .build())
        .build()

    context.vec3.interfaces = listOf(
        generateVecInterface(context, context.vec3,"Vec3f", Float::class),
        generateVecInterface(context, context.vec3,"Vec3d", Double::class),
        generateVecInterface(context, context.vec3,"Vec3i", Int::class),
        generateVecInterface(context, context.vec3,"Vec3l", Long::class)
    )
}

fun generateVec2Realisations(context: Context) {
    context.vec2.realisations = listOf(
        generateVecRealisation(context, context.vec2, "ArrayVec2f", Primitive.FLOAT),
        generateVecRealisation(context, context.vec2, "ArrayVec2d", Primitive.DOUBLE),
        generateVecRealisation(context, context.vec2, "ArrayVec2i", Primitive.INT),
        generateVecRealisation(context, context.vec2,"ArrayVec2l", Primitive.LONG)
    )
}

fun generateVec3Realisations(context: Context) {
    context.vec3.realisations = listOf(
        generateVecRealisation(context, context.vec3, "ArrayVec3f", Primitive.FLOAT),
        generateVecRealisation(context, context.vec3, "ArrayVec3d", Primitive.DOUBLE),
        generateVecRealisation(context, context.vec3, "ArrayVec3i", Primitive.INT),
        generateVecRealisation(context, context.vec3,"ArrayVec3l", Primitive.LONG)
    )
}

fun generateVecRealisation(context: Context, vector: Vector, name: String, primitive: Primitive): TypeSpec {
    val primitiveCls = primitive.primitive
    val array = primitive.array
    val sizeBytes = primitive.sizeBytes
    val components = vector.components
    val superInterface = vector.getAliasClassName(primitive)

    val componentProperties = components.mapIndexed { index, component ->
        PropertySpec.builder(component, primitiveCls)
            .addModifiers(KModifier.OVERRIDE)
            .mutable(true)
            .getter(FunSpec.getterBuilder()
                .addCode("return arr[arrIndex + $index]")
                .build())
            .setter(FunSpec.setterBuilder()
                .addParameter("value", primitiveCls)
                .addCode("arr[arrIndex + $index] = value")
                .build())
            .build()
    }

    val getFunction = FunSpec.builder("get")
        .addModifiers(KModifier.OVERRIDE, KModifier.OPERATOR)
        .addParameter("i", Int::class)
        .returns(primitiveCls)
        .addCode(CodeBlock.builder()
            .beginControlFlow("return when (i)")
            .also { components.forEachIndexed { index, component -> it.addStatement("$index -> $component") } }
            .addStatement("else -> throw ArrayIndexOutOfBoundsException()")
            .endControlFlow()
            .build())
        .build()

    val setFunction = FunSpec.builder("set")
        .addModifiers(KModifier.OVERRIDE, KModifier.OPERATOR)
        .addParameter("i", Int::class)
        .addParameter("value", primitiveCls)
        .addCode(CodeBlock.builder()
            .beginControlFlow("when (i)")
            .also { components.forEachIndexed { index, component -> it.addStatement("$index -> $component") } }
            .addStatement("else -> throw ArrayIndexOutOfBoundsException()")
            .endControlFlow()
            .build())
        .build()

    val toStringFunction = FunSpec.builder("toString")
        .returns(String::class)
        .addModifiers(KModifier.OVERRIDE)
        .addCode($"return \"Vec${components.size}[${components.joinToString(", $", prefix = "$")}]\"")
        .build()

    return TypeSpec.classBuilder(name)
        .generated()
        .addPackage(context.pkg("vec"))
        .addPrimitive(primitive)
        .addVectorDescription(vector)
        .addModifiers(KModifier.INTERNAL)
        .addSuperinterface(superInterface)
        .primaryConstructor(FunSpec.constructorBuilder()
            .addModifiers(KModifier.INTERNAL)
            .addParameter("arr", array)
            .addParameter("arrIndex", Int::class)
            .build())
        .addProperty(PropertySpec.builder("arr", array)
            .initializer("arr")
            .build())
        .addProperty(PropertySpec.builder("arrIndex", Int::class)
            .initializer("arrIndex")
            .build())
        .addProperty(PropertySpec.builder("mutable", Boolean::class)
            .addModifiers(KModifier.OVERRIDE)
            .initializer("true")
            .build())
        .addProperty(PropertySpec.builder("elementSize", Int::class)
            .addModifiers(KModifier.OVERRIDE)
            .getter(FunSpec.getterBuilder()
                .addCode("return $sizeBytes")
                .build())
            .build())
        .addProperty(PropertySpec.builder("elementCount", Int::class)
            .addModifiers(KModifier.OVERRIDE)
            .getter(FunSpec.getterBuilder()
                .addCode("return ${components.size}")
                .build())
            .build())
        .addProperty(PropertySpec.builder("objectSize", Int::class)
            .addModifiers(KModifier.OVERRIDE)
            .getter(FunSpec.getterBuilder()
                .addCode("return ${sizeBytes * components.size}")
                .build())
            .build())
        .addProperties(componentProperties)
        .addFunction(getFunction)
        .addFunction(setFunction)
        .addFunction(toStringFunction)
        .build()
}

private fun generateVecInterface(context: Context, vector: Vector, name: String, primitive: KClass<*>): TypeSpec {
    return TypeSpec.interfaceBuilder(name)
        .addPackage(context.pkg("vec"))
        .addAlias(primitive)
        .addVectorDescription(vector)
        .addSuperinterface(vector.baseInterface.getClassName(primitive))
        .addFunction(FunSpec.builder("copyMutable")
            .addModifiers(KModifier.OVERRIDE)
            .returns(ClassName(context.pkg("vec"), name))
            .addCode("return ${name.lowercase()}(this)")
            .build())
        .build()
}

