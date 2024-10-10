package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.VectorSpec

abstract class UnaryVecFunctionGeneratorTemplate {

    protected abstract fun isExtension(): Boolean

    protected abstract fun isOperator(): Boolean

    protected abstract fun generateReturnType(leftVec: VectorSpec): TypeName?

    protected abstract fun generateFunctionBody(leftVec: VectorSpec): CodeBlock

    protected abstract fun generateMethodName(leftVec: VectorSpec): String

    protected abstract fun generateJvmMethodName(leftVec: VectorSpec): String?

    protected abstract fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec>

    fun generateFunSpec(leftVec: VectorSpec): FunSpec {
        val returnType = generateReturnType(leftVec)

        val bodyCodeBlock = generateFunctionBody(leftVec)

        val funSpecBuilder = FunSpec.builder(generateMethodName(leftVec))
            .addParameters(generateParameters(leftVec))
            .addCode(bodyCodeBlock)

        generateJvmMethodName(leftVec)?.let {
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
