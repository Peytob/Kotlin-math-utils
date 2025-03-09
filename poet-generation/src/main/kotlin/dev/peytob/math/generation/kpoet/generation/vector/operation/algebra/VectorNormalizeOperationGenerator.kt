package dev.peytob.math.generation.kpoet.generation.vector.operation.algebra

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

fun generateMutableVectorNormalizeOperation(leftVector: TypedVectorBase): FunSpec {
    val body = CodeBlock.builder()

    body.addStatement("var l = this.length()")

    leftVector.components.forEach { property ->
        body.addStatement("this.%1L /= l", property)
    }

    body.addStatement("return this")

    return FunSpec.builder("normalize")
        .generated()
        .jvmName("normalize${leftVector.alias}")
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .build()
}

fun generateImmutableVectorNormalizeOperation(leftVector: TypedVectorBase, constructor: Function): FunSpec {
    val body = CodeBlock.builder()

    body.addStatement("var l = this.length()")

    leftVector.components.forEach { property ->
        body.addStatement("val %1L = this.%1L / l", property)
    }

    val scalarFormArguments = leftVector.components.joinToString(", ") { "$it = $it" }
    body.addStatement("return %T(%L)", constructor.className, scalarFormArguments)

    return FunSpec.builder("normalize")
        .generated()
        .jvmName("normalize${leftVector.alias}")
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .build()
}

fun generateVectorNormalizeOperation(leftVector: TypedVectorBase, constructor: Function): FunSpec {
    return if (leftVector.isMutable)
        generateMutableVectorNormalizeOperation(leftVector)
    else
        generateImmutableVectorNormalizeOperation(leftVector, constructor)
}
