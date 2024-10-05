package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generatedAnnotation
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.TargetPackage
import dev.peytob.math.generation.kpoet.model.VectorDescriptor
import java.lang.RuntimeException

fun generateTypedVec(primitiveDescriptor: PrimitiveDescriptor, vectorDescriptor: VectorDescriptor): TypeSpec {
    val primitiveCls = primitiveDescriptor.cls
    val primitiveSizeBytes = primitiveDescriptor.sizeBytes
    val postfix = primitiveDescriptor.postfix

    println("Generating ${vectorDescriptor.size}-component vector class for ${primitiveCls.simpleName}")

    if (primitiveCls.javaPrimitiveType == null) {
        throw RuntimeException("Vec2 cant be generated from non-primitive class ${primitiveCls.simpleName}")
    }

    val elementsCount = vectorDescriptor.size
    val vectorSizeBytes = primitiveSizeBytes * elementsCount

    val primaryConstructor = run {
        val builder = FunSpec.constructorBuilder()

        vectorDescriptor.components.forEach {
            builder.addParameter(it, primitiveCls)
        }

        builder.build()
    }

    val componentProperties = vectorDescriptor.components.map {
        PropertySpec.builder(it, primitiveCls, KModifier.OVERRIDE)
            .initializer(it)
            .build()
    }

    return TypeSpec.classBuilder("Vec$elementsCount$postfix")
        .addSuperinterface(vectorDescriptor.base.parameterizedBy(primitiveCls))
        .addModifiers(KModifier.DATA)
        .addAnnotation(generatedAnnotation())
        .tag(vectorDescriptor)
        .tag(primitiveDescriptor)
        .tag(TargetPackage(vectorDescriptor.destinationPackage))
        .primaryConstructor(primaryConstructor)
        .addProperties(componentProperties)
        .addProperty(PropertySpec.builder("elementSizeBytes", Int::class, KModifier.OVERRIDE)
            .initializer(primitiveSizeBytes.toString())
            .build())
        .addProperty(PropertySpec.builder("vectorSizeBytes", Int::class, KModifier.OVERRIDE)
            .initializer(vectorSizeBytes.toString())
            .build())
        .build()
}
