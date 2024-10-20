package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.VectorSpec

private fun generateScalarTimesOperation(vector: VectorSpec, primitive: PrimitiveDescriptor): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    vector.components.forEach { property ->
        codeBlockBuilder.addStatement("val %1L = (this.%1L * scalar).%2N()", property.name, vector.primitiveDescriptor.numberCastMethodName)
    }

    val constructorArgs = vector.components
        .map { it.name }
        .joinToString(", ") { "$it = $it" }

    codeBlockBuilder.addStatement("return %T(%L)", vector.className, constructorArgs)

    return FunSpec.builder("times")
        .generated()
        .addParameter("scalar", primitive.cls)
        .returns(vector.baseClassName)
        .receiver(vector.baseClassName)
        .jvmName("times${vector.components.size}${vector.primitiveDescriptor.postfix}${primitive.postfix}")
        .addModifiers(KModifier.OPERATOR)
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateImmutableVecScalarOperations(vector: VectorSpec, targetOperationScalars: Collection<PrimitiveDescriptor>): Collection<FunSpec> {
    if (!vector.isImmutable) {
        return emptyList()
    }

    return targetOperationScalars.map { primitiveDescriptor ->
        generateScalarTimesOperation(vector, primitiveDescriptor)
    }
}
