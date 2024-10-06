package dev.peytob.math.generation.kpoet.vec

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.extractPackage
import dev.peytob.math.generation.kpoet.extractVectorInformation
import dev.peytob.math.generation.kpoet.getClassName

fun generateVecFactoryMethods(vec: TypeSpec, targetOperationVectors: Collection<TypeSpec>, functionPrefix: String): Collection<FunSpec> {
    return targetOperationVectors.flatMap {
        println("Generating factory methods for ${vec.name} vector type")
        listOf(
            generateVecLiteralFactory(vec, it, functionPrefix),
            generateVecCopyingFactory(vec, it, functionPrefix),
        )
    } + generateVecZeroFactory(vec, functionPrefix)
}

fun generateVecCopyingFactory(factoryVec: TypeSpec, copyingVec: TypeSpec, functionPrefix: String): FunSpec {
    val (factoryVectorDescriptor, factoryPrimitiveDescriptor) = factoryVec.extractVectorInformation()
    val (copyingVectorDescriptor, copyingPrimitiveDescriptor) = copyingVec.extractVectorInformation()

    if (factoryVectorDescriptor.size != copyingVectorDescriptor.size) {
        throw RuntimeException("Literal copying factory method generating not supported for vectors with different sizes. Operands is ${factoryVec.name} and ${copyingVec.name}")
    }

    val vectorsSize = factoryVectorDescriptor.size
    val returnType = ClassName(factoryVec.extractPackage(), factoryVec.name!!)

    val vectorComponentProperties = factoryVec.propertySpecs
        .filter { factoryVectorDescriptor.components.contains(it.name) }

    val elementsOperationCodeBlock = CodeBlock.builder()
    vectorComponentProperties.forEach { property ->
        val name = property.name
        elementsOperationCodeBlock
            .addStatement("val r%1L = right.%1N", name)
    }

    val literalFunctionArgs = vectorComponentProperties
        .map { it.name }
        .joinToString(", ") { "r$it = r$it" }

    elementsOperationCodeBlock.addStatement("return %N(%L)", generateFactoryMethodName(functionPrefix, vectorsSize, factoryPrimitiveDescriptor.postfix), literalFunctionArgs)

    return FunSpec.builder(generateFactoryMethodName(functionPrefix, vectorsSize, factoryPrimitiveDescriptor.postfix))
        .returns(returnType)
        .addAnnotation(AnnotationSpec.builder(JvmName::class)
            .addMember("name = %S", "vec${vectorsSize}${factoryPrimitiveDescriptor.postfix}${copyingPrimitiveDescriptor.postfix}")
            .build())
        .addParameter("right", copyingVectorDescriptor.base.parameterizedBy(copyingPrimitiveDescriptor.cls))
        .addCode(elementsOperationCodeBlock.build())
        .build()
}


fun generateVecLiteralFactory(factoryVec: TypeSpec, copyingVec: TypeSpec, functionPrefix: String): FunSpec {
    val (factoryVectorDescriptor, factoryPrimitiveDescriptor) = factoryVec.extractVectorInformation()
    val (copyingVectorDescriptor, copyingPrimitiveDescriptor) = copyingVec.extractVectorInformation()

    val vectorsSize = copyingVectorDescriptor.size
    val returnType = ClassName(factoryVec.extractPackage(), factoryVec.name!!)

    if (copyingVectorDescriptor.size != factoryVectorDescriptor.size) {
        throw RuntimeException("Literal copying factory method generating not supported for vectors with different sizes. Operands is ${factoryVec.name} and ${copyingVec.name}")
    }

    val vectorComponentProperties = factoryVec.propertySpecs
        .filter { factoryVectorDescriptor.components.contains(it.name) }

    val elementsOperationCodeBlock = CodeBlock.builder()
    vectorComponentProperties.forEach { property ->
        val name = property.name
        elementsOperationCodeBlock
            .addStatement("val %1L = r%1L.%2N()", name, factoryPrimitiveDescriptor.numberCastMethodName)
    }
    val constructorArgs = vectorComponentProperties
        .map { it.name }
        .joinToString(", ") { "$it = $it" }

    elementsOperationCodeBlock.addStatement("return %T(%L)", factoryVec.getClassName(), constructorArgs)

    val parameters = vectorComponentProperties
        .map {
            ParameterSpec.builder("r${it.name}", copyingPrimitiveDescriptor.cls).build()
        }

    return FunSpec.builder(generateFactoryMethodName(functionPrefix, vectorsSize, factoryPrimitiveDescriptor.postfix))
        .returns(returnType)
        .addParameters(parameters)
        .addCode(elementsOperationCodeBlock.build())
        .build()
}

fun generateVecZeroFactory(factoryVec: TypeSpec, functionPrefix: String): FunSpec {
    val (factoryVectorDescriptor, factoryPrimitiveDescriptor) = factoryVec.extractVectorInformation()

    val vectorsSize = factoryVectorDescriptor.size
    val returnType = ClassName(factoryVec.extractPackage(), factoryVec.name!!)

    val vectorComponentProperties = factoryVec.propertySpecs
        .filter { factoryVectorDescriptor.components.contains(it.name) }

    val elementsOperationCodeBlock = CodeBlock.builder()

    val constructorArgs = vectorComponentProperties
        .map { it.name }
        .joinToString(", ") { "0${factoryPrimitiveDescriptor.literal ?: ""}" }

    elementsOperationCodeBlock.addStatement("return %T(%L)", factoryVec.getClassName(), constructorArgs)

    return FunSpec.builder(generateFactoryMethodName(functionPrefix, vectorsSize, factoryPrimitiveDescriptor.postfix))
        .returns(returnType)
        .addCode(elementsOperationCodeBlock.build())
        .build()
}

fun generateFactoryMethodName(functionPrefix: String, vectorsSize: Int, postfix: String) = "${functionPrefix}Vec${vectorsSize}${postfix}"
