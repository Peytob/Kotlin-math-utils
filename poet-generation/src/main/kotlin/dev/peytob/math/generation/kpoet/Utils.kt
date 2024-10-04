package dev.peytob.math.generation.kpoet

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeSpec
import javax.annotation.processing.Generated
import kotlin.reflect.KClass

fun generatedAnnotation(comment: String? = null): AnnotationSpec {
    val annotationSpec = AnnotationSpec.builder(Generated::class)
        .addMember("value = [\"poet\", \"kmu\"]")
        .addMember("date = %S", GENERATED_DATE)

    if (!comment.isNullOrBlank()) {
        annotationSpec.addMember("comments = %S", comment)
    }

    return annotationSpec.build()
}

fun saveTypeFile(typeSpec: TypeSpec) {
    println("Saving class ${typeSpec.name}")

    FileSpec.builder(DESTINATION_PACKAGE_VEC2, typeSpec.name!!)
        .addType(typeSpec)
        .build()
        .writeTo(BASE_DESTINATION_FOLDER)
}

fun extractPostfix(kClass: KClass<*>): Char {
    return kClass.simpleName?.first()?.lowercaseChar()!!
}
