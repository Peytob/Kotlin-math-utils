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

private class BiLiteralFactoryFactoryGeneratorTemplate(
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

private class UnaryPlusFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

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

private class UnaryMinusFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = true

    override fun generateReturnType(leftVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("val %1L = -this.%1L", name)
        }

        val constructorArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "$it = $it" }

        codeBlockBuilder.addStatement("return %T(%L)", leftVec.className, constructorArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "unaryMinus"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "unaryMinus${leftVec.alias}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf()
}

private class DotLiteralOperationFactoryGeneratorTemplate : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): ClassName = Float::class.asClassName()

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        val sum = leftVec.components
            .map { it.name }
            .joinToString(" + ") { "$it * r$it" }

        codeBlockBuilder.addStatement("val sum = %L", sum)
        codeBlockBuilder.addStatement("return sum.toFloat()", leftVec.className, sum)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = "dot"

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = rightVec.components.map {
        ParameterSpec("r${it.name}", rightVec.primitiveDescriptor.cls.asTypeName())
    }
}

private class DotOperationFactoryGeneratorTemplate : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): ClassName = Float::class.asClassName()

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        val dotArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "r$it = right.$it" }

        codeBlockBuilder.addStatement("return this.dot(%L)", dotArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = "dot"

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String = "dot${leftVec.alias}${rightVec.primitiveDescriptor.postfix}"

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("right", rightVec.vectorDescriptor.accessor.parameterizedBy(rightVec.primitiveDescriptor.cls))
    )
}

private class LengthFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    private companion object {
        private val SQRT = MemberName("kotlin.math", "sqrt")
    }

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec): TypeName = Double::class.asClassName()

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        codeBlockBuilder.addStatement("var s = 0.0")

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("s += this.%1L * this.%1L", name)
        }

        codeBlockBuilder.addStatement("return %M(s)", SQRT)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "length"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "length${leftVec.alias}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf()
}

private class NormalizeFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = true

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        codeBlockBuilder
            .addStatement("val l = this.length()")

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("val %1L = (this.%1L / l).%2N()", name, leftVec.primitiveDescriptor.numberCastMethodName)
        }

        val constructorArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "$it = $it" }

        codeBlockBuilder.addStatement("return %T(%L)", leftVec.className, constructorArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "normalize"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "normalize${leftVec.alias}"

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = listOf()
}

fun generateImmutableVecOperations(vec: VectorSpec, targetOperationVectors: Collection<VectorSpec>): Collection<FunSpec> {
    if (!vec.isImmutable) {
        return emptyList()
    }

    val plusFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("plus")
    val plusLiteralFactoryGeneratorTemplate = BiLiteralFactoryFactoryGeneratorTemplate("plus", "+")

    val minusFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("minus")
    val minusLiteralFactoryGeneratorTemplate = BiLiteralFactoryFactoryGeneratorTemplate("minus", "-")

    val timesFactoryGeneratorTemplate = BiVecDefaultOperatorFactoryGeneratorTemplate("times")
    val timesLiteralFactoryGeneratorTemplate = BiLiteralFactoryFactoryGeneratorTemplate("times", "*")

    val unaryPlusVecFunctionGeneratorTemplate = UnaryPlusFactoryGeneratorTemplate()
    val unaryMinusFactoryGeneratorTemplate = UnaryMinusFactoryGeneratorTemplate()

    val dotLiteralOperationFactoryGeneratorTemplate = DotLiteralOperationFactoryGeneratorTemplate()
    val dotOperationFactoryGeneratorTemplate = DotOperationFactoryGeneratorTemplate()

    val lengthFactoryGeneratorTemplate = LengthFactoryGeneratorTemplate()
    val normalizeFactoryGeneratorTemplate = NormalizeFactoryGeneratorTemplate()

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

            dotLiteralOperationFactoryGeneratorTemplate.generateFunSpec(vec, it),
            dotOperationFactoryGeneratorTemplate.generateFunSpec(vec, it)
        )
    } + listOf(
        unaryPlusVecFunctionGeneratorTemplate.generateFunSpec(vec),
        unaryMinusFactoryGeneratorTemplate.generateFunSpec(vec),
        lengthFactoryGeneratorTemplate.generateFunSpec(vec),
        normalizeFactoryGeneratorTemplate.generateFunSpec(vec)
    )
}
