package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.PrimitiveDescriptor
import dev.peytob.math.generation.kpoet.model.VectorDescriptor
import java.nio.Buffer
import java.nio.ByteBuffer

fun generateByteVecBufferInsertFunction(vector: VectorDescriptor, primitive: PrimitiveDescriptor): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    val primitiveName = primitive.cls.simpleName!!

    vector.components.forEach {
        codeBlockBuilder.addStatement("buffer.put%L(%L)", primitiveName, it)
    }

    return FunSpec.builder("to")
        .generated()
        .jvmName("toByteBuffer${vector.components.size}${primitive.postfix}")
        .addModifiers(KModifier.INFIX)
        .receiver(vector.accessor.parameterizedBy(primitive.cls.asTypeName()))
        .addParameter(ParameterSpec("buffer", ByteBuffer::class.asTypeName()))
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateTypedVecBufferInsertFunction(vector: VectorDescriptor, primitive: PrimitiveDescriptor): FunSpec {
    val codeBlockBuilder = CodeBlock.builder()

    vector.components.forEach {
        codeBlockBuilder.addStatement("buffer.put(%L)", it)
    }

    val bufferType = ClassName(Buffer::class.java.packageName, "${primitive.cls.simpleName}Buffer")

    return FunSpec.builder("to")
        .generated()
        .jvmName("toBuffer${vector.components.size}${primitive.postfix}")
        .addModifiers(KModifier.INFIX)
        .receiver(vector.accessor.parameterizedBy(primitive.cls.asTypeName()))
        .addParameter(ParameterSpec("buffer", bufferType))
        .addCode(codeBlockBuilder.build())
        .build()
}

fun generateVecBufferOperations(vector: VectorDescriptor, primitive: PrimitiveDescriptor): Collection<FunSpec> {
    return listOf(
        generateByteVecBufferInsertFunction(vector, primitive),
        generateTypedVecBufferInsertFunction(vector, primitive)
    )
}
