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

fun extractPostfix(kClass: KClass<*>): Char {
    return kClass.simpleName?.first()?.lowercaseChar()!!
}

fun TypeSpec.Builder.generated(): TypeSpec.Builder {
    return this.addAnnotation(generatedAnnotation())
}

fun FunSpec.Builder.generated(): FunSpec.Builder {
    return this.addAnnotation(generatedAnnotation())
}

fun FunSpec.Builder.jvmName(name: String?): FunSpec.Builder {
    if (name == null) {
        return this
    }

    val annotation = AnnotationSpec.builder(JvmName::class)
        .addMember("name = %S", name)
        .build()

    return this.addAnnotation(annotation)
}
