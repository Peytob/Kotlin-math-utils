package dev.peytob.math.generation.kpoet.generation.vector.operation.buffer

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import java.nio.Buffer
import java.nio.ByteBuffer

fun generateByteBufferOperation(vectorAccessor: TypedVectorAccessor): FunSpec {
    val body = CodeBlock.builder()

    vectorAccessor.components.forEach {
        body.addStatement("buffer.put%L(%L)", vectorAccessor.primitive.cls.simpleName, it)
    }

    return FunSpec.builder("to")
        .generated()
        .jvmName("toByteBuffer${vectorAccessor.alias}${vectorAccessor.primitive.postfix}")
        .addModifiers(KModifier.INFIX)
        .receiver(vectorAccessor.className)
        .addParameter(ParameterSpec("buffer", ByteBuffer::class.asTypeName()))
        .addCode(body.build())
        .build()
}

fun generateTypedBufferOperation(vectorAccessor: TypedVectorAccessor): FunSpec {
    val body = CodeBlock.builder()

    vectorAccessor.components.forEach {
        body.addStatement("buffer.put(%L)", it)
    }

    val bufferType = ClassName(Buffer::class.java.packageName, "${vectorAccessor.primitive.cls.simpleName}Buffer")

    return FunSpec.builder("to")
        .generated()
        .jvmName("toBuffer${vectorAccessor.alias}${vectorAccessor.primitive.postfix}")
        .addModifiers(KModifier.INFIX)
        .receiver(vectorAccessor.className)
        .addParameter(ParameterSpec("buffer", bufferType))
        .addCode(body.build())
        .build()
}
