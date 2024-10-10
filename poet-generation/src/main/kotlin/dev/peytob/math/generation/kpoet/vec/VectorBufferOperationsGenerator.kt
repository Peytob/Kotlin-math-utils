package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.VectorSpec
import java.nio.Buffer
import java.nio.ByteBuffer

private class UnaryTypedVecBufferInsertFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec): TypeName? = null

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach {
            codeBlockBuilder.addStatement("buffer.put(%L)", it.name)
        }

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "to"

    override fun generateJvmMethodName(leftVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("buffer", ClassName(Buffer::class.java.packageName, "${leftVec.primitiveDescriptor.cls.simpleName}Buffer"))
    )
}

private class UnaryByteVecBufferInsertFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec): TypeName? = null

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        val primitiveName = leftVec.primitiveDescriptor.cls.simpleName!!

        leftVec.components.forEach {
            codeBlockBuilder.addStatement("buffer.put%L(%L)", primitiveName, it.name)
        }

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "to"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "toByteBufferVec${leftVec.components.size}${leftVec.primitiveDescriptor.postfix}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("buffer", ByteBuffer::class.asTypeName())
    )
}

fun generateVecBufferOperations(vec: VectorSpec): Collection<FunSpec> {
    val unaryByteVecBufferInsertFactoryGeneratorTemplate = UnaryByteVecBufferInsertFactoryGeneratorTemplate()
    val unaryTypedVecBufferInsertFactoryGeneratorTemplate = UnaryTypedVecBufferInsertFactoryGeneratorTemplate()

    return listOf(
        unaryTypedVecBufferInsertFactoryGeneratorTemplate.generateFunSpec(vec),
        unaryByteVecBufferInsertFactoryGeneratorTemplate.generateFunSpec(vec)
    )
}
