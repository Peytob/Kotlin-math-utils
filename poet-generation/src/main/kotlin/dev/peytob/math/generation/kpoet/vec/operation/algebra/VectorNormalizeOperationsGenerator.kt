package dev.peytob.math.generation.kpoet.vec.operation.algebra

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.TypeName
import dev.peytob.math.generation.kpoet.model.VectorSpec
import dev.peytob.math.generation.kpoet.vec.UnaryVecFunctionGeneratorTemplate

private class MutableNormalizeFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

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
                .addStatement("this.%1L = (this.%1L / l).%2N()", name, leftVec.primitiveDescriptor.numberCastMethodName)
        }

        codeBlockBuilder.addStatement("return this")

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String = "normalize"

    override fun generateJvmMethodName(leftVec: VectorSpec): String = "normalize${leftVec.alias}"

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

fun generateVectorNormalizeOperations(vector: VectorSpec): Collection<FunSpec> {
    println("Generating normalize operations for vector type $vector")

    val normalizeFactoryGeneratorTemplate = if (vector.isImmutable)
        NormalizeFactoryGeneratorTemplate()
    else
        MutableNormalizeFactoryGeneratorTemplate()

    return listOf(
        normalizeFactoryGeneratorTemplate.generateFunSpec(vector),
    )
}