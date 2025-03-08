package dev.peytob.math.generation.kpoet.generation.vector.instance

import dev.peytob.math.generation.kpoet.model.*
import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger("vector_generator")

fun generateVectorRealisations(generationContext: GenerationContext) {
    log.info("Generating vector realisations")
    generateTypedVectorBases(generationContext)
    generateVectorStructRealisations(generationContext)
}

fun generateVectorStructRealisations(generationContext: GenerationContext) {
    log.info("Generating vector struct realisations")

    generationContext.getTypedVectorBases().map {
        val (base, primitive) = it
        log.debug(
            "Generating vector {} struct realisation for primitive {}",
            base.className.simpleName,
            primitive.cls.simpleName
        )

        Vector(
            base = base,
            primitive = primitive,
            typeSpec = generateVectorStructRealisation(base, primitive)
        )
    }.onEach {
        generationContext.registerVector(it)
    }.let {
        log.info("Generated {} struct vector realisations", it.size)
    }
}

private fun generateTypedVectorBases(generationContext: GenerationContext) {
    log.info("Generating vector bases for accessors")

    val vectorBases = generationContext.getVectorAccessors().flatMap { accessor ->
        log.debug("Generating vector bases for accessor {}", accessor.className.simpleName)

        listOf(
            VectorBase(
                accessor = accessor,
                isMutable = false,
                typeSpec = generateVectorImmutableBase(accessor)
            ),

            VectorBase(
                accessor = accessor,
                isMutable = true,
                typeSpec = generateVectorMutableBase(accessor)
            )
        )
    }

    vectorBases.flatMap { vectorBase ->
        generationContext.getPrimitives().map { primitive ->
            TypedVectorBase(
                base = vectorBase,
                primitive = primitive
            )
        }
    }.forEach(generationContext::registerTypedVectorBase)

    generationContext.getVectorAccessors().flatMap { vectorAccessor ->
        generationContext.getPrimitives().map { primitive ->
            TypedVectorAccessor(
                accessor = vectorAccessor,
                primitive = primitive
            )
        }
    }.forEach(generationContext::registerTypedVectorAccessor)

    log.info("Generated {} vector bases, {} typed vector bases and {} typed accessors", vectorBases.size, generationContext.getTypedVectorBases().size, generationContext.getTypedVectorAccessors().size)
}
