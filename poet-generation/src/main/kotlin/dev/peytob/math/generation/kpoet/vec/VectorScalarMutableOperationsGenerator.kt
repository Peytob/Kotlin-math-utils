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
        codeBlockBuilder.addStatement("this.%1L = (this.%1L * scalar).%2N()", property.name, vector.primitiveDescriptor.numberCastMethodName)
    }

    codeBlockBuilder.addStatement("return this")

    return FunSpec.builder("times")
        .generated()
        .jvmName("timesMut${vector.components.size}${vector.primitiveDescriptor.postfix}${primitive.postfix}")
        .addParameter("scalar", primitive.cls)
        .returns(vector.baseClassName)
        .receiver(vector.baseClassName)
        .addModifiers(KModifier.OPERATOR)
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateMutableVecScalarOperations(vector: VectorSpec, targetOperationScalars: Collection<PrimitiveDescriptor>): Collection<FunSpec> {
    if (vector.isImmutable) {
        return emptyList()
    }

    return targetOperationScalars.map { primitiveDescriptor ->
        generateScalarTimesOperation(vector, primitiveDescriptor)
    }
}
