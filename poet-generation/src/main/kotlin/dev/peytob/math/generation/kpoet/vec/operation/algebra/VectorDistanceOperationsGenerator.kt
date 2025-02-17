package dev.peytob.math.generation.kpoet.vec.operation.algebra

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.VectorDescriptor

private val SQRT = MemberName("kotlin.math", "sqrt")

private fun generateDistanceFunction(
    vector: VectorDescriptor,
    leftPrimitive: PrimitiveDescriptor,
    rightPrimitive: PrimitiveDescriptor
): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    codeBlockBuilder.addStatement("var s = 0.0")

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("s += (left.%1L - right.%1L) * (left.%1L - right.%1L)", property)
    }

    codeBlockBuilder.addStatement("return %M(s).toFloat()", SQRT)

    return FunSpec.builder("distance")
        .generated()
        .jvmName("distance${vector.components.size}${leftPrimitive.postfix}${rightPrimitive.postfix}")
        .addParameter("left", vector.accessor.parameterizedBy(leftPrimitive.cls))
        .addParameter("right", vector.accessor.parameterizedBy(rightPrimitive.cls))
        .returns(Float::class)
        .addCode(codeBlockBuilder.build())
        .build()
}

private fun generateScalarDistanceFunction(
    vector: VectorDescriptor,
    leftPrimitive: PrimitiveDescriptor,
    rightPrimitive: PrimitiveDescriptor
): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    codeBlockBuilder.addStatement("var s = 0.0")

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("s += (l%1L - r%1L) * (l%1L - r%1L)", property)
    }

    codeBlockBuilder.addStatement("return %M(s).toFloat()", SQRT)

    val parameters =
        vector.components.map { ParameterSpec.builder("l$it", leftPrimitive.cls).build() } +
                vector.components.map { ParameterSpec.builder("r$it", rightPrimitive.cls).build() }

    return FunSpec.builder("distance")
        .generated()
        .jvmName("distance${vector.components.size}${leftPrimitive.postfix}${rightPrimitive.postfix}")
        .addParameters(parameters)
        .returns(Float::class)
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateVectorDistanceOperations(vector: VectorDescriptor, primitives: Collection<PrimitiveDescriptor>): Collection<FunSpec> {
    println("Generating distance operations for vector accessor ${vector.accessorTypeSpec.name}")

    return primitives.flatMap { leftPrimitive ->
        primitives.flatMap { rightPrimitive ->
            listOf(
                generateDistanceFunction(vector, leftPrimitive, rightPrimitive),
                generateScalarDistanceFunction(vector, leftPrimitive, rightPrimitive)
            )
        }
    }
}
