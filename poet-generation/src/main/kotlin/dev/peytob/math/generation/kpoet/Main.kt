package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.model.BASE_DESTINATION_FOLDER
import dev.peytob.math.generation.kpoet.model.PRIMITIVE_DESCRIPTORS
import dev.peytob.math.generation.kpoet.model.VECTOR_DESCRIPTORS
import dev.peytob.math.generation.kpoet.vec.generateTypedStructVec
import dev.peytob.math.generation.kpoet.vec.generateImmutableVecFactoryMethods
import dev.peytob.math.generation.kpoet.vec.generateVecBufferOperations
import dev.peytob.math.generation.kpoet.vec.generateVecOperations

fun main() {
    println("Starting vectors and matrix types generation")
    println("Configuration:")
    println("-> Destination folder: $BASE_DESTINATION_FOLDER")
    PRIMITIVE_DESCRIPTORS
        .mapNotNull { it.cls.simpleName }
        .joinToString(", ")
        .let { println("-> Target generation primitives: $it") }
    VECTOR_DESCRIPTORS
        .joinToString(", ") { it.components.joinToString(",", prefix = "[", postfix = "]") }
        .let { println("-> Target generation vectors: $it") }
    println()

    println("Generating vec2 types")
    val vec2Types = PRIMITIVE_DESCRIPTORS.flatMap { primitiveDescriptor ->
        VECTOR_DESCRIPTORS.map { vectorDescriptor ->
            generateTypedStructVec(primitiveDescriptor, vectorDescriptor)
        }
    }

    println("Generating vec2 factory methods")
    val vec2FactoryMethods = vec2Types
        .associateWith { generateImmutableVecFactoryMethods(it, vec2Types) }

    println("Generating vec2 operations")
    val vec2Operations = vec2Types
        .associateWith { generateVecOperations(it, vec2Types) }

    println("Generating vec2 buffer operations")
    val vec2BufferOperations = vec2Types
        .associateWith { generateVecBufferOperations(it) }

    println("All generations completed! Saving data...")
    vec2Types.forEach { saveTypeFile(it.vectorDescriptor.destinationPackage, it.typeSpec) }
    vec2Operations.forEach { saveExtensionsFunctionsFile(it.key.vectorDescriptor.destinationPackage, it.value, "Vec2${it.key.primitiveDescriptor.postfix}Operations") }
    vec2FactoryMethods.forEach { saveExtensionsFunctionsFile(it.key.vectorDescriptor.destinationPackage, it.value, "Vec2${it.key.primitiveDescriptor.postfix}Factories") }
    vec2BufferOperations
        .asSequence()
        .groupBy({Pair(it.key.vectorDescriptor.destinationPackage, it.key.components.size)}, {it.value})
        .forEach { saveExtensionsFunctionsFile(it.key.first, it.value.flatten(), "Vec${it.key.second}NioBufferUtils") }
}
