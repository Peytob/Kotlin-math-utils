package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.extractPackage
import dev.peytob.math.generation.kpoet.extractVectorInformation
import dev.peytob.math.generation.kpoet.getClassName

fun generateVecOperations(vec: TypeSpec, targetOperationVectors: Collection<TypeSpec>): Collection<FunSpec> {
    return targetOperationVectors.flatMap {
        println("Generating operations between ${vec.name} and ${it.name} vector types")
        listOf(
            generateVecLiteralOperation(vec, it,"plus", "+"),
            generateVecOperation(vec, it, "plus"),

            generateVecLiteralOperation(vec, it,"minus", "-"),
            generateVecOperation(vec, it, "minus"),

            generateVecLiteralOperation(vec, it,"times", "*"),
            generateVecOperation(vec, it, "times"),
        )
    }
}

// TODO Find way to get functionName and operator from KOperator enum
fun generateVecOperation(leftVec: TypeSpec, rightVec: TypeSpec, operationName: String): FunSpec {
    val (leftVectorDescriptor, leftPrimitiveDescriptor) = leftVec.extractVectorInformation()
    val (rightVectorDescriptor, rightPrimitiveDescriptor) = rightVec.extractVectorInformation()

    if (leftVectorDescriptor.size != rightVectorDescriptor.size) {
        throw RuntimeException("Vector operation generating not supported for vectors with different sizes. Operands is ${leftVec.name} and ${rightVec.name}")
    }

    val vectorsSize = leftVectorDescriptor.size
    val returnType = ClassName(leftVec.extractPackage(), leftVec.name!!)

    val vectorComponentProperties = leftVec.propertySpecs
        .filter { leftVectorDescriptor.components.contains(it.name) }

    val elementsOperationCodeBlock = CodeBlock.builder()
    vectorComponentProperties.forEach { property ->
        val name = property.name
        elementsOperationCodeBlock
            .addStatement("val r%1L = right.%1N", name)
    }

    val literalFunctionArgs = vectorComponentProperties
        .map { it.name }
        .joinToString(", ") { "r$it = r$it" }

    elementsOperationCodeBlock.addStatement("return this.%N(%L)", operationName, literalFunctionArgs)

    return FunSpec.builder(operationName)
        .addModifiers(KModifier.OPERATOR)
        .receiver(leftVec.getClassName())
        .returns(returnType)
        .addAnnotation(AnnotationSpec.builder(JvmName::class)
            .addMember("name = %S", "${operationName}Vec${vectorsSize}${leftPrimitiveDescriptor.postfix}${rightPrimitiveDescriptor.postfix}")
            .build())
        .addParameter("right", rightVectorDescriptor.base.parameterizedBy(rightPrimitiveDescriptor.cls))
        .addCode(elementsOperationCodeBlock.build())
        .build()
}

fun generateVecLiteralOperation(leftVec: TypeSpec, rightVec: TypeSpec, operationName: String, operator: String): FunSpec {
    val (rightVectorDescriptor, rightPrimitiveDescriptor) = rightVec.extractVectorInformation()
    val (leftVectorDescriptor, leftPrimitiveDescriptor) = leftVec.extractVectorInformation()

    val vectorsSize = leftVectorDescriptor.size
    val returnType = ClassName(leftVec.extractPackage(), leftVec.name!!)

    if (leftVectorDescriptor.size != rightVectorDescriptor.size) {
        throw RuntimeException("Literals operation generating not supported for vectors with different sizes. Operands is ${leftVec.name} and ${rightVec.name}")
    }

    val vectorComponentProperties = leftVec.propertySpecs
        .filter { leftVectorDescriptor.components.contains(it.name) }

    val elementsOperationCodeBlock = CodeBlock.builder()
    vectorComponentProperties.forEach { property ->
        val name = property.name
        elementsOperationCodeBlock
            .addStatement("val %1L = (this.%1L %2L r%1L).%3N()", name, operator, leftPrimitiveDescriptor.numberCastMethodName)
    }
    val constructorArgs = vectorComponentProperties
        .map { it.name }
        .joinToString(", ") { "$it = $it" }

    elementsOperationCodeBlock.addStatement("return %T(%L)", leftVec.getClassName(), constructorArgs)

    val parameters = vectorComponentProperties
        .map { ParameterSpec.builder("r${it.name}", rightPrimitiveDescriptor.cls).build() }

    return FunSpec.builder(operationName)
        .receiver(leftVec.getClassName())
        .returns(returnType)
        .addAnnotation(AnnotationSpec.builder(JvmName::class)
            .addMember("name = %S", "${operationName}Vec${vectorsSize}${leftPrimitiveDescriptor.postfix}${rightPrimitiveDescriptor.postfix}")
            .build())
        .addParameters(parameters)
        .addCode(elementsOperationCodeBlock.build())
        .build()
}
