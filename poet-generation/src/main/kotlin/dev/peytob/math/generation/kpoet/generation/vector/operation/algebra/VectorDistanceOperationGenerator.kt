package dev.peytob.math.generation.kpoet.generation.vector.operation.algebra

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor

private val SQRT = MemberName("kotlin.math", "sqrt")

fun generateVectorDistanceOperation(leftVector: TypedVectorAccessor, rightVector: TypedVectorAccessor): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Minus operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()

    body.addStatement("var s = 0.0")

    leftVector.components.forEach { property ->
        body.addStatement("s += (left.%1L - right.%1L) * (left.%1L - right.%1L)", property)
    }

    body.addStatement("return %M(s).toFloat()", SQRT)

    return FunSpec.builder("distance")
        .generated()
        .jvmName("distanceVec${leftVector.size}${leftVector.primitive.postfix}Vec${rightVector.size}${rightVector.primitive.postfix}")
        .addParameter("left", leftVector.className)
        .addParameter("right", rightVector.className)
        .returns(Float::class)
        .addCode(body.build())
        .build()
}

fun generateVectorDistanceOperationFlat(leftVector: TypedVectorAccessor, rightVector: TypedVectorAccessor): FunSpec {
    val body = CodeBlock.builder()

    body.addStatement("var s = 0.0")

    leftVector.components.forEach { property ->
        body.addStatement("s += (l%1L - r%1L) * (l%1L - r%1L)", property)
    }

    body.addStatement("return %M(s).toFloat()", SQRT)

    val parameters =
        leftVector.components.map { ParameterSpec.builder("l$it", leftVector.primitive.cls).build() } +
                rightVector.components.map { ParameterSpec.builder("r$it", rightVector.primitive.cls).build() }

    return FunSpec.builder("distance")
        .generated()
        .jvmName("distanceVec${leftVector.size}${leftVector.primitive.postfix}Vec${rightVector.size}${rightVector.primitive.postfix}")
        .addParameters(parameters)
        .returns(Float::class)
        .addCode(body.build())
        .build()
}
