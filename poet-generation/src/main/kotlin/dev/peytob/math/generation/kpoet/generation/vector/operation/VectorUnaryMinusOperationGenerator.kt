package dev.peytob.math.generation.kpoet.generation.vector.operation

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

fun generateUnaryMinusImmutableOperation(leftVector: TypedVectorBase, constructor: Function): FunSpec {
    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("val %1L = -this.%1L", component)
    }

    val scalarFormArguments = leftVector.components.joinToString(", ") { "$it = $it" }
    body.addStatement("return %T(%L)", constructor.className, scalarFormArguments)

    return FunSpec
        .builder("unaryMinus")
        .generated()
        .jvmName("unaryMinus${leftVector.alias}")
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .build()
}

fun generateUnaryMinusMutableOperation(leftVector: TypedVectorBase): FunSpec {
    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("this.%1L = -this.%1L", component)
    }

    body.addStatement("return this")

    return FunSpec
        .builder("unaryMinus")
        .generated()
        .jvmName("unaryMinus${leftVector.alias}")
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .build()
}

fun generateUnaryMinusVectorOperation(
    leftVector: TypedVectorBase,
    constructor: Function
): FunSpec {
    return if (leftVector.isMutable)
        generateUnaryMinusMutableOperation(leftVector)
    else
        generateUnaryMinusImmutableOperation(leftVector, constructor)
}
