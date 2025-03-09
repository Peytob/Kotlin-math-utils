package dev.peytob.math.generation.kpoet.generation.vector.operation.arithmetic

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

fun generateUnaryPlusVectorOperation(leftVector: TypedVectorBase): FunSpec {
    val body = CodeBlock
        .builder()
        .addStatement("return this")

    return FunSpec
        .builder("unaryPlus")
        .generated()
        .jvmName("unaryPlus${leftVector.alias}")
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .build()
}
