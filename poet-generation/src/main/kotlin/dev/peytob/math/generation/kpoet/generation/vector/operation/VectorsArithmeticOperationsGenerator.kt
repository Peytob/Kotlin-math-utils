package dev.peytob.math.generation.kpoet.generation.vector.operation

import dev.peytob.math.generation.kpoet.model.Function
import dev.peytob.math.generation.kpoet.model.GenerationContext
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("arithmetic_operations")
private const val ARITHMETIC_OPERATIONS_FILES_POSTFIX = "ArithmeticOperations"

fun generateVectorArithmeticOperations(generationContext: GenerationContext) {
    log.info("Generating vector arithmetic operations")

    generateBinaryVectorOperations(generationContext)
    generateUnaryVectorOperations(generationContext)
    generateBufferVectorOperations(generationContext)
}

fun generateBufferVectorOperations(generationContext: GenerationContext) {
    log.info("Generating unary vector buffer operations")

    generationContext.getTypedVectorAccessors().flatMap { vectorAccessor ->
        log.debug("Generating unary vector {} buffer operations", vectorAccessor.alias)

        val primitiveBufferOperations = generationContext.getPrimitives().flatMap { primitive ->
            emptyList<Function>()
        }

        val byteBufferOperations = listOf(
            Function(
                file = "Vec${vectorAccessor.components.size}BufferOperations",
                packageName = vectorAccessor.accessor.destinationPackage,
                operandsAliases = listOf("byteBuffer"),
                funSpec = generateByteBufferOperation(vectorAccessor)
            ),

            Function(
                file = "Vec${vectorAccessor.components.size}BufferOperations",
                packageName = vectorAccessor.accessor.destinationPackage,
                operandsAliases = listOf("${vectorAccessor.primitive.cls.simpleName}Buffer"),
                funSpec = generateTypedBufferOperation(vectorAccessor)
            ),
        )

        byteBufferOperations + primitiveBufferOperations
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} vector buffers functions", it.size)
    }
}

fun generateUnaryVectorOperations(generationContext: GenerationContext) {
    log.info("Generating unary vector arithmetic operations")

    generationContext.getTypedVectorBases().flatMap { leftVector ->
        log.debug("Generating {} vector unary operations", leftVector.alias)

        val constructor = generationContext.getConstructor(leftVector)
            ?: throw IllegalStateException("Constructor for class ${leftVector.alias} not found")

        listOf(
            Function(
                file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                packageName = leftVector.base.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateUnaryPlusVectorOperation(leftVector)
            ),

            Function(
                file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                packageName = leftVector.base.className.packageName,
                operandsAliases = emptyList(),
                funSpec = generateUnaryMinusVectorOperation(leftVector, constructor)
            )
        )
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} unary vector functions", it.size)
    }
}

fun generateBinaryVectorOperations(generationContext: GenerationContext) {
    log.info("Generating binary vector arithmetic operations")

    generationContext.getTypedVectorBases().flatMap { leftVector ->
        val constructor = generationContext.getConstructor(leftVector)
            ?: throw IllegalStateException("Constructor for class ${leftVector.alias} not found")

        generationContext.getTypedVectorAccessors().filter { rightAccessor ->
            rightAccessor.accessor.size == leftVector.size
        }.flatMap { rightAccessor ->
            log.debug("Generating binary arithmetic operations for vectors {} - {}", leftVector.alias, rightAccessor.alias)

            val binaryOperationComponents = listOf(leftVector.alias, rightAccessor.alias)
            val flatOperationComponents = listOf(leftVector.alias) + List(rightAccessor.size) { rightAccessor.primitive.cls.simpleName }

            listOf(
                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = binaryOperationComponents,
                    funSpec = generatePlusVectorOperation(leftVector, rightAccessor, constructor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = flatOperationComponents,
                    funSpec = generatePlusVectorOperationFlat(leftVector, rightAccessor, constructor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = binaryOperationComponents,
                    funSpec = generateTimesVectorOperation(leftVector, rightAccessor, constructor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = flatOperationComponents,
                    funSpec = generateTimesVectorOperationFlat(leftVector, rightAccessor, constructor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = binaryOperationComponents,
                    funSpec = generateDotVectorOperation(leftVector, rightAccessor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = flatOperationComponents,
                    funSpec = generateDotVectorOperationFlat(leftVector, rightAccessor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = binaryOperationComponents,
                    funSpec = generateMinusVectorOperation(leftVector, rightAccessor, constructor)
                ),

                Function(
                    file = leftVector.alias + ARITHMETIC_OPERATIONS_FILES_POSTFIX,
                    packageName = leftVector.base.className.packageName,
                    operandsAliases = flatOperationComponents,
                    funSpec = generateMinusVectorOperationFlat(leftVector, rightAccessor, constructor)
                ),
            )
        }
    }.onEach {
        generationContext.registerFunction(it)
    }.let {
        log.info("Generated {} binary vector - vector functions", it.size)
    }
}
