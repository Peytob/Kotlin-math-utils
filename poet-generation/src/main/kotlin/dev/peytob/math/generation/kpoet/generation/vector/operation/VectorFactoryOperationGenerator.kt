package dev.peytob.math.generation.kpoet.generation.vector.operation

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import dev.peytob.math.generation.kpoet.model.Vector

fun generateStructVectorEmptyConstructor(targetVector: Vector): FunSpec {
    val body = CodeBlock.builder()

    val constructorArgs = targetVector.components
        .joinToString(", ") { "0${targetVector.primitive.literal ?: ""}" }

    body.addStatement("return %T(%L)", targetVector.className, constructorArgs)

    val name = generateConstructorName(targetVector.alias.name, targetVector.isMutable)

    return FunSpec
        .builder(name)
        .generated()
        .returns(targetVector.base.className.parameterizedBy(targetVector.primitive.cls))
        .addCode(body.build())
        .build()
}

fun generateVectorCopyConstructor(leftVector: Vector, rightAccessor: TypedVectorAccessor): FunSpec {
    if (leftVector.size != rightAccessor.size) {
        throw IllegalArgumentException("Copying constructor operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightAccessor.size}")
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("val %1L = right.%1L.%2N()", component, leftVector.primitive.numberCastMethodName)
    }

    val scalarFormArguments = leftVector.components.joinToString(", ") { "$it = $it" }
    body.addStatement("return %T(%L)", leftVector.className, scalarFormArguments)

    val name = generateConstructorName(leftVector.alias.name, leftVector.isMutable)

    return FunSpec
        .builder(name)
        .generated()
        .jvmName(name + rightAccessor.primitive.postfix)
        .returns(leftVector.base.className.parameterizedBy(leftVector.primitive.cls))
        .addParameter("right", rightAccessor.className)
        .addCode(body.build())
        .build()
}

fun generateVectorCopyConstructorFlat(leftVector: Vector, rightAccessor: TypedVectorAccessor): FunSpec {
    if (leftVector.size != rightAccessor.size) {
        throw IllegalArgumentException("Copying constructor operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightAccessor.size}")
    }

    val parameters = leftVector.components.map { component ->
        ParameterSpec
            .builder(component, rightAccessor.primitive.cls)
            .build()
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("val r%1L = %1L.%2N()", component, leftVector.primitive.numberCastMethodName)
    }

    val scalarFormArguments = leftVector.components.joinToString(", ") { "$it = r$it" }
    body.addStatement("return %T(%L)", leftVector.className, scalarFormArguments)

    val name = generateConstructorName(leftVector.alias.name, leftVector.isMutable)

    return FunSpec
        .builder(name)
        .generated()
        .jvmName(name + rightAccessor.primitive.postfix)
        .returns(leftVector.base.className.parameterizedBy(leftVector.primitive.cls))
        .addParameters(parameters)
        .addCode(body.build())
        .build()
}

fun generateConstructorName(alias: String, mutable: Boolean): String {
    val prefix = if (mutable) "mutable" else "immutable"
    return prefix + alias.removePrefix("Mut")
}