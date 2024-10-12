package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.model.*
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

    val generatingResultStorage = GeneratingResultStorage()

    println("Generating vectors types")
    VECTOR_DESCRIPTORS.forEach { vectorDescriptor ->
        PRIMITIVE_DESCRIPTORS.mapTo(generatingResultStorage.vectorTypes[vectorDescriptor]) { primitiveDescriptor ->
            generateTypedStructVec(primitiveDescriptor, vectorDescriptor)
        }
    }

    println("Generating vectors methods")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val factoryMethods = generateImmutableVecFactoryMethods(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.factories.putAll(vectorSpec, factoryMethods)
    }

    println("Generating vectors operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating vectors buffer operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val bufferOperations = generateVecBufferOperations(vectorSpec)
        generatingResultStorage.bufferOperations.putAll(vectorSpec, bufferOperations)
    }

    println("All generations completed! Saving data...")
    saveGeneratingResults(generatingResultStorage)
}
