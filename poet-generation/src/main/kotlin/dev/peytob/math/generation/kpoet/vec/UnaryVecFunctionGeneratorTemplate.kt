package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.VectorSpec

abstract class UnaryVecFunctionGeneratorTemplate {

    protected abstract fun isExtension(): Boolean

    protected abstract fun isOperator(): Boolean

    protected abstract fun generateReturnType(leftVec: VectorSpec): TypeName?

    protected abstract fun generateFunctionBody(leftVec: VectorSpec): CodeBlock

    protected abstract fun generateMethodName(leftVec: VectorSpec): String

    protected open fun generateReceiverType(leftVec: VectorSpec): TypeName? = null

    protected abstract fun generateJvmMethodName(leftVec: VectorSpec): String?

    protected abstract fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec>

    fun generateFunSpec(leftVec: VectorSpec): FunSpec {
        val returnType = generateReturnType(leftVec)

        val bodyCodeBlock = generateFunctionBody(leftVec)

        val funSpecBuilder = FunSpec.builder(generateMethodName(leftVec))
            .generated()
            .jvmName(generateJvmMethodName(leftVec))
            .addParameters(generateParameters(leftVec))
            .addCode(bodyCodeBlock)

        if (returnType != null) {
            funSpecBuilder.returns(returnType)
        }

        if (isExtension()) {
            val receiverType = generateReceiverType(leftVec) ?: leftVec.baseClassName
            funSpecBuilder.receiver(receiverType)
        }

        if (isOperator()) {
            funSpecBuilder.addModifiers(KModifier.OPERATOR)
        }

        return funSpecBuilder.build()
    }
}
