package dev.peytob.math.generation.kpoet.generation.vector.operation.algebra

import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.GenerationContext
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("arithmetic_operations")

fun generateVectorAlgebraicOperations(generationContext: GenerationContext) {
    log.info("Generating vector algebraic operations")

    generateBinaryVectorAlgebraicOperations(generationContext)
    generateUnaryVectorAlgebraicOperations(generationContext)
}

fun generateBinaryVectorAlgebraicOperations(generationContext: GenerationContext) {
    log.info("Generating binary vectors algebraic operations")

    generationContext.getTypedVectorAccessors().flatMap { leftVector ->
        generationContext.getTypedVectorAccessors().filter { rightAccessor ->
            rightAccessor.accessor.size == leftVector.size
        }.flatMap { rightAccessor ->
            log.debug("Generating binary algebraic operations for vectors {} - {}", leftVector.alias, rightAccessor.alias)

            val binaryOperationComponents = listOf(leftVector.alias, rightAccessor.alias)
            val flatOperationComponents =
                List(leftVector.size) { leftVector.primitive.cls.simpleName } + List(rightAccessor.size) { rightAccessor.primitive.cls.simpleName }

            listOf(
                Function(
                    file = "Vec${leftVector.components.size}Distance",
                    packageName = leftVector.accessor.destinationPackage,
                    operandsAliases = binaryOperationComponents,
                    funSpec = generateVectorDistanceOperation(leftVector, rightAccessor)
                ),

                Function(
                    file = "Vec${leftVector.components.size}Distance",
                    packageName = leftVector.accessor.destinationPackage,
                    operandsAliases = flatOperationComponents,
                    funSpec = generateVectorDistanceOperationFlat(leftVector, rightAccessor)
                )
            )
        }
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} vector algebraic operations", it.size)
    }
}

fun generateUnaryVectorAlgebraicOperations(generationContext: GenerationContext) {
    log.info("Generating unary vector algebraic operations")

    generationContext.getTypedVectorBases().filterNot { leftVector ->
        leftVector.isMutable
    }.flatMap { leftVector ->
        log.debug("Generating {} vector unary operations", leftVector.alias)

        val constructor = generationContext.getConstructor(leftVector)
            ?: throw IllegalStateException("Constructor for class ${leftVector.alias} not found")

        listOf(
            Function(
                file = leftVector.alias + "Length",
                packageName = leftVector.base.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateVectorLengthOperation(leftVector)
            ),

            Function(
                file = leftVector.alias + "Length",
                packageName = leftVector.base.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateVectorLengthOperationFlat(leftVector)
            ),

            Function(
                file = leftVector.alias + "Normalize",
                packageName = leftVector.base.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateVectorNormalizeOperation(leftVector, constructor)
            )
        )
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} unary vector algebraic functions", it.size)
    }
}
