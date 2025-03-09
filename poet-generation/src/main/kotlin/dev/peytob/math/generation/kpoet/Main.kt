package dev.peytob.math.generation.kpoet

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generation.vector.instance.generateVectorRealisations
import dev.peytob.math.generation.kpoet.generation.vector.instance.*
import dev.peytob.math.generation.kpoet.generation.vector.operation.algebra.generateVectorAlgebraicOperations
import dev.peytob.math.generation.kpoet.generation.vector.operation.arithmetic.generateVectorArithmeticOperations
import dev.peytob.math.generation.kpoet.generation.vector.operation.arithmetic.generateVectorFactoryMethods
import dev.peytob.math.generation.kpoet.model.*
import dev.peytob.math.generation.kpoet.model.Function
import org.slf4j.LoggerFactory
import java.time.Duration
import java.time.Instant

private val log = LoggerFactory.getLogger("main")

fun main() {
    val generationStartedAt = Instant.now()

    log.info("Starting vectors and matrix types generation")

    val generationContext = initializeGenerationContext()

    log.info("Generation context data:")
    log.info("Destination folder: {}", BASE_DESTINATION_FOLDER)
    log.info("Target generation primitives: ${generationContext.getPrimitives().joinToString(", ") { it.cls.simpleName }}")
    generationContext.getVectorAccessors()
        .joinToString(", ") { it.components.joinToString(",", prefix = "[", postfix = "]") }
        .let { log.info("Target vector accessors: {}", it) }

    generateVectorRealisations(generationContext)
    generateVectorFactoryMethods(generationContext)
    generateVectorArithmeticOperations(generationContext)
    generateVectorAlgebraicOperations(generationContext)

    saveGenerationResults(generationContext)

    val generationTime = Duration.between(generationStartedAt, Instant.now())
    log.info("Generation time: {}.{}s", generationTime.toSeconds(), generationTime.toMillis())
}

fun saveGenerationResults(generationContext: GenerationContext) {
    log.info("Saving generation results")

    log.info("Saving vector accessors")
    generationContext.getVectorAccessors().forEach { accessor ->
        FileSpec.builder(accessor.className)
            .addType(accessor.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    log.info("Saving vector bases")
    generationContext.getVectorBases().forEach { base ->
        FileSpec.builder(base.className)
            .addType(base.typeSpec)
            .apply {
                generationContext.getVectors()
                    .filter { vector -> vector.base == base }
                    .map(Vector::alias)
                    .forEach(this::addTypeAlias)
            }
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    log.info("Saving vector realisations")
    generationContext.getVectors().forEach { vector ->
        FileSpec.builder(vector.className)
            .addType(vector.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    log.info("Saving functions")
    generationContext.getFunctions().groupBy {
        ClassName(it.packageName, it.file)
    }.mapValues {
        it.value.map(Function::funSpec)
    }.forEach { (className, functions) ->
        FileSpec.builder(className)
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }
}

private fun initializeGenerationContext(): GenerationContext {
    log.info("Initializing generation context")

    val generationContext = GenerationContext(
        primitives = listOf(
            Primitive(
                cls = Double::class.asClassName(),
                sizeBytes = Double.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toDouble"),
                literal = ".0",
                postfix = "d"
            ),

            Primitive(
                cls = Float::class.asClassName(),
                sizeBytes = Float.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toFloat"),
                literal = "f",
                postfix = "f"
            ),

            Primitive(
                cls = Int::class.asClassName(),
                sizeBytes = Int.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toInt"),
                literal = null,
                postfix = "i"
            ),

            Primitive(
                cls = Long::class.asClassName(),
                sizeBytes = Long.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toLong"),
                literal = "L",
                postfix = "l"
            )
        ),

        vectorAccessors = listOf(
            VectorAccessor(
                components = listOf("x", "y"),
                destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec2"
            ),

            VectorAccessor(
                components = listOf("x", "y", "z"),
                destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec3"
            )
        )
    )

    log.info("Generating type specs for vector accessors")
    generationContext.getVectorAccessors().forEach {
        log.debug("Generating vector accessor class for {}-vector", it.size)
        it.typeSpec = generateVectorAccessor(it)
        it.className = ClassName(it.destinationPackage, it.typeSpec.name!!)
    }

    return generationContext
}
