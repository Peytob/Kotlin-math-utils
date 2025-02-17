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

private fun generateLengthFunction(vector: VectorDescriptor, primitive: PrimitiveDescriptor): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    codeBlockBuilder.addStatement("var s = 0.0")

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("s += this.%1L * this.%1L", property)
    }

    codeBlockBuilder.addStatement("return %M(s).toFloat()", SQRT)

    return FunSpec.builder("length")
        .generated()
        .jvmName("length${vector.components.size}${primitive.postfix}")
        .receiver(vector.accessor.parameterizedBy(primitive.cls))
        .returns(Float::class)
        .addCode(codeBlockBuilder.build())
        .build()
}

private fun generateScalarLengthFunction(vector: VectorDescriptor, primitive: PrimitiveDescriptor): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    codeBlockBuilder.addStatement("var s = 0.0")

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("s += %1L * %1L", property)
    }

    codeBlockBuilder.addStatement("return %M(s).toFloat()", SQRT)

    val parameters = vector.components.map { ParameterSpec.builder(it, primitive.cls).build() }

    return FunSpec.builder("length")
        .generated()
        .jvmName("length${vector.components.size}${primitive.postfix}")
        .addParameters(parameters)
        .returns(Float::class)
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateVectorLengthOperations(vector: VectorDescriptor, primitives: Collection<PrimitiveDescriptor>): Collection<FunSpec> {
    println("Generating length operations for vector accessor ${vector.accessorTypeSpec.name}")

    return primitives.flatMap {
        listOf(
            generateLengthFunction(vector, it),
            generateScalarLengthFunction(vector, it)
        )
    }
}
