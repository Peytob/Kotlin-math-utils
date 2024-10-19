package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.VectorSpec

abstract class BiVecFunctionGeneratorTemplate {

    protected abstract fun isDifferentVectorsSizeSupported(): Boolean

    protected abstract fun isExtension(): Boolean

    protected abstract fun isOperator(): Boolean

    protected abstract fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName?

    protected open fun generateReceiverType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName? = null

    protected abstract fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock

    protected abstract fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String

    protected abstract fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String?

    protected abstract fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec>

    fun generateFunSpec(leftVec: VectorSpec, rightVec: VectorSpec): FunSpec {
        if (isDifferentVectorsSizeSupported() || leftVec.vectorDescriptor.size != rightVec.vectorDescriptor.size) {
            throw RuntimeException("This operation factory is not supported for different sized vectors")
        }

        val returnType = generateReturnType(leftVec, rightVec)

        val bodyCodeBlock = generateFunctionBody(leftVec, rightVec)

        val funSpecBuilder = FunSpec.builder(generateMethodName(leftVec, rightVec))
            .generated()
            .jvmName(generateJvmMethodName(leftVec, rightVec))
            .addParameters(generateParameters(leftVec, rightVec))
            .addCode(bodyCodeBlock)

        if (returnType != null) {
            funSpecBuilder.returns(returnType)
        }

        if (isExtension()) {
            val receiverType = generateReceiverType(leftVec, rightVec) ?: leftVec.baseClassName
            funSpecBuilder.receiver(receiverType)
        }

        if (isOperator()) {
            funSpecBuilder.addModifiers(KModifier.OPERATOR)
        }

        return funSpecBuilder.build()
    }
}
