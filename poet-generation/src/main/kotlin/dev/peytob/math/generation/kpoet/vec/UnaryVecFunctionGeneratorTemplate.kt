package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.VectorSpec

abstract class UnaryVecFunctionGeneratorTemplate {

    abstract fun isExtension(): Boolean

    abstract fun isOperator(): Boolean

    abstract fun generateReturnType(leftVec: VectorSpec): ClassName

    abstract fun generateFunctionBody(leftVec: VectorSpec): CodeBlock

    abstract fun generateMethodName(leftVec: VectorSpec): String

    abstract fun generateJvmMethodName(leftVec: VectorSpec): String?

    abstract fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec>

    fun generateFunSpec(leftVec: VectorSpec): FunSpec {
        val returnType = generateReturnType(leftVec)

        val bodyCodeBlock = generateFunctionBody(leftVec)

        val funSpecBuilder = FunSpec.builder(generateMethodName(leftVec))
            .returns(returnType)
            .addParameters(generateParameters(leftVec))
            .addCode(bodyCodeBlock)

        generateJvmMethodName(leftVec)?.let {
            val annotation = AnnotationSpec.builder(JvmName::class)
                .addMember("name = %S", it)
                .build()

            funSpecBuilder.addAnnotation(annotation)
        }

        if (isExtension()) {
            funSpecBuilder.receiver(leftVec.className)
        }

        if (isOperator()) {
            funSpecBuilder.addModifiers(KModifier.OPERATOR)
        }

        return funSpecBuilder.build()
    }
}
