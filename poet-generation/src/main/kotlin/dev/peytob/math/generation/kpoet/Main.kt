package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.model.BASE_DESTINATION_FOLDER
import dev.peytob.math.generation.kpoet.model.PRIMITIVE_DESCRIPTORS
import dev.peytob.math.generation.kpoet.model.VECTOR_DESCRIPTORS
import dev.peytob.math.generation.kpoet.vec.generateTypedVec
import dev.peytob.math.generation.kpoet.vec.generateVecFactoryMethods
import dev.peytob.math.generation.kpoet.vec.generateVecOperations

fun main() {
    println("Starting vectors and matrix types generation")
    println("Configuration:")
    println("-> Destination folder: $BASE_DESTINATION_FOLDER")
    PRIMITIVE_DESCRIPTORS
        .mapNotNull { it.cls.simpleName }
        .joinToString(", ")
        .let { println("-> Target generation primitives: $it") }
    println()

    println("Generating vec2 types")
    val vec2Types = PRIMITIVE_DESCRIPTORS.flatMap { primitiveDescriptor ->
        VECTOR_DESCRIPTORS.map { vectorDescriptor ->
            generateTypedVec(primitiveDescriptor, vectorDescriptor)
        }
    }

    println("Generating vec2 factory methods")
    val vec2FactoryMethods = vec2Types
        .associateWith { generateVecFactoryMethods(it, vec2Types,  "immutable") }

    println("Generating vec2 operations")
    val vec2Operations = vec2Types
        .associateWith { generateVecOperations(it, vec2Types) }

    println("All generations completed! Saving data...")
    vec2Types.forEach(::saveTypeFile)
    vec2Operations.forEach { saveExtensionsFunctionsFile(it.key, it.value, "Operations") }
    vec2FactoryMethods.forEach { saveExtensionsFunctionsFile(it.key, it.value, "Factories") }
}
