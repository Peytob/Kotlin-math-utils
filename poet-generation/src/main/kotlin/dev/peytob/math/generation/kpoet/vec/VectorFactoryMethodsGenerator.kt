package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.model.VectorSpec

private class BiVecCopyingFactoryGeneratorTemplate : BiVecFunctionGeneratorTemplate() {

    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = false

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        leftVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("val r%1L = right.%1N", name)
        }

        val literalFunctionArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "r$it = r$it" }

        codeBlockBuilder.addStatement("return %N(%L)", generateMethodName(leftVec, rightVec), literalFunctionArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String =
        (if (leftVec.isImmutable) "immutable" else "mutable") + "Vec${leftVec.components.size}${leftVec.primitiveDescriptor.postfix}"

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String =
        (if (leftVec.isImmutable) "immutable" else "mutable") + "Vec${leftVec.components.size}${leftVec.primitiveDescriptor.postfix}${rightVec.primitiveDescriptor.postfix}"

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = listOf(
        ParameterSpec("right", rightVec.parameterizedAccessor)
    )
}

private class BiVecLiteralFactoryGeneratorTemplate : BiVecFunctionGeneratorTemplate() {
    override fun isDifferentVectorsSizeSupported(): Boolean = false

    override fun isExtension(): Boolean = false

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec, rightVec: VectorSpec): TypeName = leftVec.baseClassName

    override fun generateFunctionBody(leftVec: VectorSpec, rightVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        rightVec.components.forEach { property ->
            val name = property.name
            codeBlockBuilder
                .addStatement("val %1L = r%1L.%2N()", name, leftVec.primitiveDescriptor.numberCastMethodName)
        }
        val constructorArgs = rightVec.components
            .map { it.name }
            .joinToString(", ") { "$it = $it" }

        codeBlockBuilder.addStatement("return %T(%L)", leftVec.className, constructorArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String =
        (if (leftVec.isImmutable) "immutable" else "mutable") + "Vec${leftVec.components.size}${leftVec.primitiveDescriptor.postfix}"

    override fun generateJvmMethodName(leftVec: VectorSpec, rightVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec, rightVec: VectorSpec): Collection<ParameterSpec> = rightVec.components.map {
        ParameterSpec("r${it.name}", rightVec.primitiveDescriptor.cls.asTypeName())
    }
}

private class UnaryVecZeroFactoryGeneratorTemplate : UnaryVecFunctionGeneratorTemplate() {

    override fun isExtension(): Boolean = false

    override fun isOperator(): Boolean = false

    override fun generateReturnType(leftVec: VectorSpec): TypeName = leftVec.baseClassName

    // TODO Add memorization
    override fun generateFunctionBody(leftVec: VectorSpec): CodeBlock {
        val codeBlockBuilder = CodeBlock.builder()

        val constructorArgs = leftVec.components
            .map { it.name }
            .joinToString(", ") { "0${leftVec.primitiveDescriptor.literal ?: ""}" }

        codeBlockBuilder.addStatement("return %T(%L)", leftVec.className, constructorArgs)

        return codeBlockBuilder.build()
    }

    override fun generateMethodName(leftVec: VectorSpec): String =
        (if (leftVec.isImmutable) "immutable" else "mutable") + "Vec${leftVec.components.size}${leftVec.primitiveDescriptor.postfix}"

    override fun generateJvmMethodName(leftVec: VectorSpec): String? = null

    override fun generateParameters(leftVec: VectorSpec): Collection<ParameterSpec> = emptyList()
}

fun generateVecFactoryMethods(vec: VectorSpec, targetOperationVectors: Collection<VectorSpec>): Collection<FunSpec> {
    val biVecCopyingFactoryGeneratorTemplate = BiVecCopyingFactoryGeneratorTemplate()
    val biVecLiteralFactoryGeneratorTemplate = BiVecLiteralFactoryGeneratorTemplate()
    val unaryVecZeroFactoryGeneratorTemplate = UnaryVecZeroFactoryGeneratorTemplate()

    return targetOperationVectors.flatMap {
        if (vec.vectorDescriptor.size != it.vectorDescriptor.size) {
            return@flatMap emptyList()
        }

        println("Generating factory methods for ${vec.baseClassName} from ${it.baseClassName}")

        listOf(
            biVecLiteralFactoryGeneratorTemplate.generateFunSpec(vec, it),
            biVecCopyingFactoryGeneratorTemplate.generateFunSpec(vec, it),
        )
    } + unaryVecZeroFactoryGeneratorTemplate.generateFunSpec(vec)
}
