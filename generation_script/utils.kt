package org.example.generation

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import generation.getPackage
import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
import javax.annotation.processing.Generated
import kotlin.reflect.KClass

private val generatedDate = LocalDate.now().format(ISO_LOCAL_DATE)

enum class Primitive(
    val primitive: KClass<*>,
    val array: KClass<*>,
    val sizeBytes: Int,
    val postfix: String,
    val cast: String
) {
    FLOAT(Float::class, FloatArray::class, Float.SIZE_BYTES, "f", "toFloat"),
    DOUBLE(Double::class, DoubleArray::class, Double.SIZE_BYTES, "d", "toDouble"),
    INT(Int::class, IntArray::class, Int.SIZE_BYTES, "i", "toInt"),
    LONG(Long::class, LongArray::class, Long.SIZE_BYTES, "l", "toLong");
}

fun TypeSpec.Builder.generated(): TypeSpec.Builder {
    return addAnnotation(AnnotationSpec.builder(Generated::class)
        .addMember("date = \"$generatedDate\"")
        .build())
}

fun FunSpec.Builder.generated(): FunSpec.Builder {
    return addAnnotation(AnnotationSpec.builder(Generated::class)
        .addMember("date = \"$generatedDate\"")
        .build())
}

fun FunSpec.Builder.jvmName(name: String): FunSpec.Builder {
    return addAnnotation(AnnotationSpec.builder(JvmName::class)
        .addMember("name = \"$name\"")
        .build())
}

fun TypeSpec.getClassName(): ClassName {
    return ClassName(getPackage(), name!!)
}

fun TypeSpec.getClassName(cls: KClass<*>): ParameterizedTypeName {
    return ClassName(getPackage(), name!!).parameterizedBy(cls.asClassName())
}

fun TypeSpec.getClassName(primitive: Primitive): ParameterizedTypeName {
    return getClassName(primitive.primitive)
}

fun TypeSpec.getClassName(cls: TypeVariableName): ParameterizedTypeName {
    return ClassName(getPackage(), name!!).parameterizedBy(cls)
}

fun TypeAliasSpec.getClassName(): ClassName {
    return ClassName(getPackage(), name)
}

