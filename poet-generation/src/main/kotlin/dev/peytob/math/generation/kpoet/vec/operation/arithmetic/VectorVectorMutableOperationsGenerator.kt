package dev.peytob.math.generation.kpoet.vec.operation.arithmetic

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.VectorSpec
import dev.peytob.math.generation.kpoet.vec.BiVecFunctionGeneratorTemplate
import dev.peytob.math.generation.kpoet.vec.UnaryVecFunctionGeneratorTemplate

private class BiMutableVecDefaultOperatorFactoryGeneratorTemplate(
    private val operationName: String
) : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = true

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName = leftVec.baseClassName

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
        "${operationName}Vec${leftVec.alias}${rightVec.primitiveDescriptor.postfix}"

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("right", rightVec.parameterizedAccessor)
    )
}

private class BiMutableLiteralFactoryFactoryGeneratorTemplate(
    private val operationName: String,
    private val operator: String
) : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("this.%1L = (this.%1L %2L r%1L).%3N()", name, operator, leftVec.primitiveDescriptor.numberCastMethodName)
        }

        codeBlockBuilder.addStatement("return this")

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = operationName

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = rightVec.components.map {
        ParameterSpec("r${it.name}", rightVec.primitiveDescriptor.cls)
    }
}

private class MutableUnaryPlusFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = true

    override fun generateReturnType(leftVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        codeBlockBuilder.addStatement("return this")

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "unaryPlus"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "unaryPlus${leftVec.alias}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf()
}

private class MutableUnaryMinusFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = true

    override fun generateReturnType(leftVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("this.%1L = -this.%1L", name)
        }

        codeBlockBuilder.addStatement("return this")

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "unaryMinus"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "unaryMinus${leftVec.alias}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf()
}

fun generateMutableVecOperations(vec: VectorSpec, targetOperationVectors: Collection<VectorSpec>): Collection<FunSpec> {
    if (vec.isImmutable) {
        return emptyList()
    }

    val plusFactoryGeneratorTemplate = BiMutableVecDefaultOperatorFactoryGeneratorTemplate("plus")
    val plusLiteralFactoryGeneratorTemplate = BiMutableLiteralFactoryFactoryGeneratorTemplate("plus", "+")

    val minusFactoryGeneratorTemplate = BiMutableVecDefaultOperatorFactoryGeneratorTemplate("minus")
    val minusLiteralFactoryGeneratorTemplate = BiMutableLiteralFactoryFactoryGeneratorTemplate("minus", "-")

    val timesFactoryGeneratorTemplate = BiMutableVecDefaultOperatorFactoryGeneratorTemplate("times")
    val timesLiteralFactoryGeneratorTemplate = BiMutableLiteralFactoryFactoryGeneratorTemplate("times", "*")

    val unaryPlusVecFunctionGeneratorTemplate = MutableUnaryPlusFactoryGeneratorTemplate()
    val unaryMinusFactoryGeneratorTemplate = MutableUnaryMinusFactoryGeneratorTemplate()

    return targetOperationVectors.flatMap {
        if (vec.vectorDescriptor.size != it.vectorDescriptor.size) {
            return@flatMap emptyList()
        }

        println("Generating operations between ${vec.baseClassName} and ${it.baseClassName} vector types")

        listOf(
            plusLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            plusFactoryGeneratorTemplate.generateFunSpec(vec, it),

            minusLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            minusFactoryGeneratorTemplate.generateFunSpec(vec, it),

            timesLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            timesFactoryGeneratorTemplate.generateFunSpec(vec, it),
        )
    } + listOf(
        unaryPlusVecFunctionGeneratorTemplate.generateFunSpec(vec),
        unaryMinusFactoryGeneratorTemplate.generateFunSpec(vec),
    )
}
