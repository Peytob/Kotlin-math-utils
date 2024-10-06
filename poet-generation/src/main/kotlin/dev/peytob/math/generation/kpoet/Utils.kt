package dev.peytob.math.generation.kpoet

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.*
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

fun saveTypeFile(targetPackage: String, typeSpec: TypeSpec) {
    FileSpec.builder(targetPackage, typeSpec.name!!)
        .addType(typeSpec)
        .build()
        .writeTo(BASE_DESTINATION_FOLDER)
}

fun saveExtensionsFunctionsFile(targetPackage: String, typeSpec: TypeSpec, functions: Collection<FunSpec>, filePostfix: String) {
    FileSpec.builder(targetPackage, "${typeSpec.name}${filePostfix}")
        .addFunctions(functions)
        .build()
        .writeTo(BASE_DESTINATION_FOLDER)
}

fun extractPostfix(kClass: KClass<*>): Char {
    return kClass.simpleName?.first()?.lowercaseChar()!!
}
