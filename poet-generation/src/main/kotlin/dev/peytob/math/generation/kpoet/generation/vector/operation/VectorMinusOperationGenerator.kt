package dev.peytob.math.generation.kpoet.generation.vector.operation

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import dev.peytob.math.generation.kpoet.model.TypedVectorBase

fun generateMinusImmutableVectorOperation(
    leftVector: TypedVectorBase,
    rightVector: TypedVectorAccessor,
    constructor: Function
): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Minus operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("val r$component = (this.$component - right.$component).%N()", leftVector.primitive.numberCastMethodName)
    }
    val scalarFormArguments = leftVector.components.joinToString(", ") { component -> "$component = r$component"}

    body.addStatement("return %T(%L)", constructor.className, scalarFormArguments)

    return FunSpec
        .builder("minus")
        .generated()
        .jvmName("minusVecVec${leftVector.size}${leftVector.primitive.postfix}${rightVector.primitive.postfix}")
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .addParameter("right", rightVector.className)
        .build()
}

fun generateMinusImmutableVectorOperationFlat(
    leftVector: TypedVectorBase,
    rightVector: TypedVectorAccessor,
    constructor: Function
): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Minus operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("val $component = (this.$component - r$component).%N()", leftVector.primitive.numberCastMethodName)
    }

    val scalarFormArguments = leftVector.components.joinToString(", ") { component -> "$component = r$component" }
    val parameters = leftVector.components.map {
        ParameterSpec
            .builder("r$it", rightVector.primitive.cls)
            .build()
    }
    body.addStatement("return %T(%L)", ClassName(constructor.packageName, constructor.name), scalarFormArguments)

    return FunSpec
        .builder("minus")
        .generated()
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .addParameters(parameters)
        .build()
}

fun generateMinusMutableVectorOperation(leftVector: TypedVectorBase, rightVector: TypedVectorAccessor): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Minus operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("this.$component = (this.$component - right.$component).%N()", leftVector.primitive.numberCastMethodName)
    }

    body.addStatement("return this")

    return FunSpec
        .builder("minus")
        .generated()
        .jvmName("minusVecVec${leftVector.size}${leftVector.primitive.postfix}${rightVector.primitive.postfix}")
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .addParameter("right", rightVector.className)
        .build()
}

fun generateMinusMutableVectorOperationFlat(leftVector: TypedVectorBase, rightVector: TypedVectorAccessor): FunSpec {
    if (leftVector.size != rightVector.size) {
        throw IllegalArgumentException("Minus operation requires same size of operands. Left vector size ${leftVector.size}, right ${rightVector.size}")
    }

    val body = CodeBlock.builder()

    leftVector.components.forEach { component ->
        body.addStatement("this.$component = (this.$component - r$component).%N()", leftVector.primitive.numberCastMethodName)
    }

    val parameters = leftVector.components.map {
        ParameterSpec
            .builder("r$it", rightVector.primitive.cls)
            .build()
    }
    body.addStatement("return this")

    return FunSpec
        .builder("minus")
        .generated()
        .receiver(leftVector.className)
        .returns(leftVector.className)
        .addCode(body.build())
        .addParameters(parameters)
        .build()
}

fun generateMinusVectorOperation(leftVector: TypedVectorBase, rightVector: TypedVectorAccessor, constructor: Function): FunSpec {
    return if (leftVector.isMutable)
        generateMinusMutableVectorOperation(leftVector, rightVector)
    else
        generateMinusImmutableVectorOperation(leftVector, rightVector, constructor)
}

fun generateMinusVectorOperationFlat(
    leftVector: TypedVectorBase,
    rightVector: TypedVectorAccessor,
    constructor: Function
): FunSpec {
    return if (leftVector.isMutable)
        generateMinusMutableVectorOperationFlat(leftVector, rightVector)
    else
        generateMinusImmutableVectorOperationFlat(leftVector, rightVector, constructor)
}
