package dev.peytob.math.generation.kpoet.generation.vector.operation

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

fun generateDotVectorOperation(
    leftVector: TypedVectorBase,
    rightVector: TypedVectorAccessor
): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Dot operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()
    val factorsSum = leftVector.components.joinToString(" + ") { component -> "this.$component * right.$component"}
    body
        .addStatement("val sum = $factorsSum")
        .addStatement("return sum.toFloat()")

    return FunSpec
        .builder("dot")
        .generated()
        .jvmName("dotVecVec${leftVector.size}${leftVector.primitive.postfix}${rightVector.primitive.postfix}")
        .receiver(leftVector.className)
        .returns(Float::class)
        .addCode(body.build())
        .addParameter("right", rightVector.className)
        .build()
}

fun generateDotVectorOperationFlat(
    leftVector: TypedVectorBase,
    rightVector: TypedVectorAccessor,
): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Dot operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()
    val factorsSum = leftVector.components.joinToString(" + ") { component -> "this.$component * r$component"}
    body
        .addStatement("val sum = $factorsSum")
        .addStatement("return sum.toFloat()")

    val parameters = leftVector.components.map {
        ParameterSpec
            .builder("r$it", rightVector.primitive.cls)
            .build()
    }

    return FunSpec
        .builder("dot")
        .generated()
        .receiver(leftVector.className)
        .returns(Float::class)
        .addCode(body.build())
        .addParameters(parameters)
        .build()
}
