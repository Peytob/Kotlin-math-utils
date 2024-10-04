package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import dev.peytob.math.generation.kpoet.extractPostfix
import dev.peytob.math.generation.kpoet.generatedAnnotation
import dev.peytob.math.vector.vec2.Vec2Accessor
import java.lang.RuntimeException
import kotlin.reflect.KClass

fun generateTypedVec2(kClass: KClass<*>, elementSizeBytes: Int): TypeSpec {
    println("Generating Vec2 class for ${kClass.simpleName}")

    if (kClass.javaPrimitiveType == null) {
        throw RuntimeException("Vec2 cant be generated from non-primitive class ${kClass.simpleName}")
    }

    val postfix = extractPostfix(kClass)
    val vectorSizeBytes = elementSizeBytes * 2

    return TypeSpec.classBuilder("Vec2$postfix")
        .addSuperinterface(Vec2Accessor::class.parameterizedBy(kClass))
        .addModifiers(KModifier.DATA)
        .addAnnotation(generatedAnnotation())
        .primaryConstructor(FunSpec.constructorBuilder()
            .addParameter("x", kClass)
            .addParameter("y", kClass)
            .build())
        .addProperty(PropertySpec.builder("x", kClass, KModifier.OVERRIDE)
            .initializer("x")
            .build())
        .addProperty(PropertySpec.builder("y", kClass, KModifier.OVERRIDE)
            .initializer("y")
            .build())
        .addProperty(PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
            .initializer(elementSizeBytes.toString())
            .build())
        .addProperty(PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
            .initializer(vectorSizeBytes.toString())
            .build())
        .build()
}
