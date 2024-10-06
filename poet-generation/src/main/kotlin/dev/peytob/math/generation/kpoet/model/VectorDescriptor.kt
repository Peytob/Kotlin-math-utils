package dev.peytob.math.generation.kpoet.model

import kotlin.reflect.KClass

data class VectorDescriptor(
    val components: Collection<String>,
    val base: KClass<*>,
    val accessor: KClass<*>,
    val destinationPackage: String
) {
    val size: Int = components.size
}
