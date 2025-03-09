package dev.peytob.math.generation.kpoet.generation.vector.operation.arithmetic

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.peytob.math.generation.kpoet.generated
import dev.peytob.math.generation.kpoet.jvmName
import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.GenerationContext
import dev.peytob.math.generation.kpoet.model.TypedVectorAccessor
import dev.peytob.math.generation.kpoet.model.Vector
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("factory_methods_generator")
private const val FACTORY_FILES_POSTFIX = "Factory"

fun generateVectorFactoryMethods(generationContext: GenerationContext) {
    log.info("Generating vector factory methods")

    generateStructVectorsEmptyFactoryMethods(generationContext)
    generateVectorCopyFactoryMethods(generationContext)
}

fun generateVectorCopyFactoryMethods(generationContext: GenerationContext) {
    log.info("Generating vectors copy constructors")

    generationContext.getVectors().flatMap { leftVector ->
        generationContext.getTypedVectorAccessors().filter { rightAccessor ->
            rightAccessor.accessor.size == leftVector.base.size
        }.flatMap { rightAccessor ->
            log.debug("Generating vector ${leftVector.className.simpleName} copy factories from accessor ${rightAccessor.alias}")

            listOf(
                Function(
                    file = leftVector.alias.name + FACTORY_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = listOf(leftVector.alias.name, rightAccessor.alias),
                    funSpec = generateVectorCopyConstructor(leftVector, rightAccessor)
                ),

                Function(
                    file = leftVector.alias.name + FACTORY_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = rightAccessor.components.toList(),
                    funSpec = generateVectorCopyConstructorFlat(leftVector, rightAccessor),
                ),
            )
        }
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} copy factories for struct vectors", it.size)
    }
}

fun generateStructVectorsEmptyFactoryMethods(generationContext: GenerationContext) {
    log.info("Generating struct vectors factory methods")

    generationContext.getVectors().filter { leftVector ->
        leftVector.className.simpleName.contains("Struct")
    }.flatMap { vector ->
        log.debug("Generating vector ${vector.className.simpleName} empty factory methods")

        listOf(
            Function(
                file = vector.alias.name + FACTORY_FILES_POSTFIX,
                packageName = vector.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateStructVectorEmptyConstructor(vector)
            )
        )
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} empty factory methods for struct vectors", it.size)
    }
}

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