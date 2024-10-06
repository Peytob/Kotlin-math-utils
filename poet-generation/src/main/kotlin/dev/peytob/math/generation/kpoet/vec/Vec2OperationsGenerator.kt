package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.model.VectorSpec

private class BiVecDefaultOperatorFactoryGeneratorTemplate(
    private val operationName: String
) : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = true

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): ClassName = leftVec.className

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder.addStatement("val r%1L = right.%1N", name)
        }

        val literalFunctionArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "r$it = r$it" }

        codeBlockBuilder.addStatement("return this.%N(%L)", operationName, literalFunctionArgs)
        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = operationName

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String =
        "${operationName}Vec${leftVec.vectorDescriptor.size}${leftVec.primitiveDescriptor.postfix}${rightVec.primitiveDescriptor.postfix}"

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("right", rightVec.vectorDescriptor.accessor.parameterizedBy(rightVec.primitiveDescriptor.cls))
    )
}

private class BiVecFactoryGeneratorTemplate(
    private val operationName: String,
    private val operator: String
) : BiVecFunctionGeneratorTemplate() {
    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): ClassName = leftVec.className

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("val %1L = (this.%1L %2L r%1L).%3N()", name, operator, leftVec.primitiveDescriptor.numberCastMethodName)
        }
        val constructorArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "$it = $it" }

        codeBlockBuilder.addStatement("return %T(%L)", leftVec.className, constructorArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = operationName

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = rightVec.components.map {
        ParameterSpec("r${it.name}", rightVec.primitiveDescriptor.cls.asTypeName())
    }
}

fun generateVecOperations(vec: VectorSpec, targetOperationVectors: Collection<VectorSpec>): Collection<FunSpec> {
    val plusFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("plus")
    val plusLiteralFactoryGeneratorTemplate = BiVecFactoryGeneratorTemplate("plus", "+")

    val minusFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("minus")
    val minusLiteralFactoryGeneratorTemplate = BiVecFactoryGeneratorTemplate("minus", "-")

    val timesFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("times")
    val timesLiteralFactoryGeneratorTemplate = BiVecFactoryGeneratorTemplate("times", "*")

    return targetOperationVectors.flatMap {
        println("Generating operations between ${vec.typeSpec.name} and ${it.typeSpec.name} vector types")
        listOf(
            plusLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            plusFactoryGeneratorTemplate.generateFunSpec(vec, it),

            minusLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            minusFactoryGeneratorTemplate.generateFunSpec(vec, it),

            timesLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            timesFactoryGeneratorTemplate.generateFunSpec(vec, it),
        )
    }
}
