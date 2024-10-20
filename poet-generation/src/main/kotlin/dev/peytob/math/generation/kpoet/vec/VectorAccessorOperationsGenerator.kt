package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
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

private fun generateDistanceFunction(
    vector: VectorDescriptor,
    vectorPrimitive: PrimitiveDescriptor,
    parameterPrimitive: PrimitiveDescriptor
): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    codeBlockBuilder.addStatement("var s = 0.0")

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("s += (left.%1L - right.%1L) * (left.%1L - right.%1L)", property)
    }

    codeBlockBuilder.addStatement("return %M(s).toFloat()", SQRT)

    return FunSpec.builder("distance")
        .generated()
        .jvmName("distance${vector.components.size}${vectorPrimitive.postfix}${parameterPrimitive.postfix}")
        .addParameter("left", vector.accessor.parameterizedBy(vectorPrimitive.cls))
        .addParameter("right", vector.accessor.parameterizedBy(parameterPrimitive.cls))
        .returns(Float::class)
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateVectorAccessorOperations(vector: VectorDescriptor, primitives: Collection<PrimitiveDescriptor>): Collection<FunSpec> {
    println("Generating operations for vector accessor ${vector.accessorTypeSpec.name}")

    val lengthOperations = primitives.map {
        generateLengthFunction(vector, it)
    }

    val distanceOperations = primitives.flatMap { firstPrimitive ->
        primitives.map { secondPrimitive ->
            generateDistanceFunction(vector, firstPrimitive, secondPrimitive)
        }
    }

    return lengthOperations + distanceOperations
}
