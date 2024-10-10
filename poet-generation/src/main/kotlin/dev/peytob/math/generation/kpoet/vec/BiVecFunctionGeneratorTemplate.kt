package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generatedAnnotation
import dev.peytob.math.generation.kpoet.model.VectorSpec

abstract class BiVecFunctionGeneratorTemplate {

    protected abstract fun isDifferentVectorsSizeSupported(): Boolean

    protected abstract fun isExtension(): Boolean

    protected abstract fun isOperator(): Boolean

    protected abstract fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName?

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
            .addAnnotation(generatedAnnotation())
            .addParameters(generateParameters(leftVec, rightVec))
            .addCode(bodyCodeBlock)

        generateJvmMethodName(leftVec, rightVec)?.let {
            val annotation = AnnotationSpec.builder(JvmName::class)
                .addMember("name = %S", it)
                .build()

            funSpecBuilder.addAnnotation(annotation)
        }

        if (returnType != null) {
            funSpecBuilder.returns(returnType)
        }

        if (isExtension()) {
            funSpecBuilder.receiver(leftVec.baseClassName)
        }

        if (isOperator()) {
            funSpecBuilder.addModifiers(KModifier.OPERATOR)
        }

        return funSpecBuilder.build()
    }
}
