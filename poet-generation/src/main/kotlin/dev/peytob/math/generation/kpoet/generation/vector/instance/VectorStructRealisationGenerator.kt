package dev.peytob.math.generation.kpoet.generation.vector.instance

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.model.Primitive
import dev.peytob.math.generation.kpoet.model.VectorBase

fun generateVectorStructImmutableRealisation(base: VectorBase, primitive: Primitive): TypeSpec {
    val primaryConstructor = run {
        val builder = FunSpec.constructorBuilder()

        base.components.forEach {
            builder.addParameter(it, primitive.cls)
        }

        builder.build()
    }

    val componentProperties = base.components.map {
        PropertySpec.builder(it, primitive.cls, KModifier.OVERRIDE)
            .initializer(it)
            .build()
    }

    val vectorName = "StructVec${base.size}${primitive.postfix}"

    return TypeSpec.classBuilder(vectorName)
        .generated()
        .addSuperinterface(base.className.parameterizedBy(primitive.cls))
        .addModifiers(KModifier.DATA, KModifier.INTERNAL)
        .primaryConstructor(primaryConstructor)
        .addProperties(componentProperties)
        .addProperty(
            PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
                .initializer(primitive.sizeBytes.toString())
                .build()
        )
        .addProperty(
            PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
                .initializer((primitive.sizeBytes * base.size).toString())
                .build()
        )
        .addFunction(generateToString(vectorName, base))
        .build()
}

fun generateVectorStructMutableRealisation(base: VectorBase, primitive: Primitive): TypeSpec {
    val primaryConstructor = run {
        val builder = FunSpec.constructorBuilder()

        base.components.forEach {
            builder.addParameter(it, primitive.cls)
        }

        builder.build()
    }

    val componentProperties = base.components.map {
        PropertySpec.builder(it, primitive.cls, KModifier.OVERRIDE)
            .mutable(true)
            .initializer(it)
            .build()
    }

    val vectorName = "StructMutVec${base.size}${primitive.postfix}"

    return TypeSpec.classBuilder(vectorName)
        .generated()
        .addSuperinterface(base.className.parameterizedBy(primitive.cls))
        .addModifiers(KModifier.DATA, KModifier.INTERNAL)
        .primaryConstructor(primaryConstructor)
        .addProperties(componentProperties)
        .addProperty(
            PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
                .initializer(primitive.sizeBytes.toString())
                .build()
        )
        .addProperty(
            PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
                .initializer((primitive.sizeBytes * base.size).toString())
                .build()
        )
        .addFunction(generateToString(vectorName, base))
        .build()
}

fun generateVectorStructRealisation(base: VectorBase, primitive: Primitive): TypeSpec {
    return if (base.isMutable)
        generateVectorStructMutableRealisation(base, primitive)
    else
        generateVectorStructImmutableRealisation(base, primitive)
}

private fun generateToString(vectorName: String, base: VectorBase): FunSpec {
    val vectorStringPattern = base.components
        .joinToString(prefix = "$vectorName[", postfix = "]", separator = ", ") { "$it=\$$it" }

    return FunSpec.builder("toString")
        .addModifiers(KModifier.OVERRIDE)
        .returns(String::class)
        .addCode("return \"%L\"", vectorStringPattern)
        .build()
}