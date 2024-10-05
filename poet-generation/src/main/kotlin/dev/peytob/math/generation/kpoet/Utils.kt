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

fun saveTypeFile(typeSpec: TypeSpec) {
    println("Saving class ${typeSpec.name}")

    FileSpec.builder(typeSpec.extractPackage(), typeSpec.name!!)
        .addType(typeSpec)
        .build()
        .writeTo(BASE_DESTINATION_FOLDER)
}

fun saveExtensionsFunctionsFile(typeSpec: TypeSpec, functions: Collection<FunSpec>) {
    println("Save extensions functions for type ${typeSpec.name}")

    FileSpec.builder(typeSpec.extractPackage(), "${typeSpec.name}Operations")
        .addFunctions(functions)
        .build()
        .writeTo(BASE_DESTINATION_FOLDER)
}

fun extractPostfix(kClass: KClass<*>): Char {
    return kClass.simpleName?.first()?.lowercaseChar()!!
}

fun TypeSpec.extractPackage() = this.tag(TargetPackage::class)?.destinationPackage
    ?: throw RuntimeException("No destination package found for type ${this.name}")

fun TypeSpec.getClassName() = ClassName(this.extractPackage(), this.name!!)

fun TypeSpec.extractVectorInformation(): VectorInformation {
    val vectorDescriptor = this.tag(VectorDescriptor::class)
        ?: throw RuntimeException("No VectorDescriptor tag found in type ${this.name}. Is this type vector?")

    val primitiveDescriptor = this.tag(PrimitiveDescriptor::class)
        ?: throw RuntimeException("No PrimitiveDescriptor tag found in vector type ${this.name}. Is this type corrupted?")

    return VectorInformation(vectorDescriptor, primitiveDescriptor)
}
