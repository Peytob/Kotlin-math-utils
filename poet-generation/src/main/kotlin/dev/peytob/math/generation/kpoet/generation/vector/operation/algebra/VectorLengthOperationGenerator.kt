package dev.peytob.math.generation.kpoet.generation.vector.operation.algebra

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

private val SQRT = MemberName("kotlin.math", "sqrt")

fun generateVectorLengthOperation(leftVector: TypedVectorBase): FunSpec {
    val body = CodeBlock.builder()

    body.addStatement("var s = 0.0")

    leftVector.components.forEach { property ->
        body.addStatement("s += this.%1L * this.%1L", property)
    }

    body.addStatement("return %M(s).toFloat()", SQRT)

    return FunSpec.builder("length")
        .generated()
        .jvmName("length${leftVector.alias}")
        .receiver(leftVector.className)
        .returns(Float::class)
        .addCode(body.build())
        .build()
}

fun generateVectorLengthOperationFlat(leftVector: TypedVectorBase): FunSpec {
    val body = CodeBlock.builder()

    body.addStatement("var s = 0.0")

    leftVector.components.forEach { property ->
        body.addStatement("s += %1L * %1L", property)
    }

    body.addStatement("return %M(s).toFloat()", SQRT)

    val parameters = leftVector.components.map { ParameterSpec.builder(it, leftVector.primitive.cls).build() }

    return FunSpec.builder("length")
        .generated()
        .jvmName("length${leftVector.alias}")
        .addParameters(parameters)
        .returns(Float::class)
        .addCode(body.build())
        .build()
}
