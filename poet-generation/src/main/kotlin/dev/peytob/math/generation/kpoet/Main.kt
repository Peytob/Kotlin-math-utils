package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.model.*
import dev.peytob.math.generation.kpoet.vec.*

fun main() {
    println("Starting vectors and matrix types generation")
    println("Configuration:")
    println("-> Destination folder: $BASE_DESTINATION_FOLDER")
    println("-> Target generation primitives: ${PRIMITIVE_DESCRIPTORS.joinToString(", ") { it.cls.simpleName }}")
    VECTOR_ORDERS
        .joinToString(", ") { it.components.joinToString(",", prefix = "[", postfix = "]") }
        .let { println("-> Target generation vectors: $it") }
    println()

    println("Generating vector descriptors")
    val generateVector = generateVectorDescriptors(VECTOR_ORDERS)
    val generatingResultStorage = GeneratingResultStorage(
        vectorDescriptors = generateVector
    )

    println("Generating immutable struct vectors types")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        PRIMITIVE_DESCRIPTORS.mapTo(generatingResultStorage.vectorTypes[vectorDescriptor]) { primitiveDescriptor ->
            generateTypedImmutableStructVec(primitiveDescriptor, vectorDescriptor)
        }
    }

    println("Generating mutable struct vectors types")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        PRIMITIVE_DESCRIPTORS.mapTo(generatingResultStorage.vectorTypes[vectorDescriptor]) { primitiveDescriptor ->
            generateTypedMutableStructVec(primitiveDescriptor, vectorDescriptor)
        }
    }

    println("Generating vectors methods")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val factoryMethods = generateVecFactoryMethods(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.factories.putAll(vectorSpec, factoryMethods)
    }

    println("Generating immutable vectors operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateImmutableVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating immutable vectors operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateMutableVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating vectors buffer operations")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        PRIMITIVE_DESCRIPTORS.forEach { primitiveDescriptor ->
            val bufferOperations = generateVecBufferOperations(vectorDescriptor, primitiveDescriptor)
            generatingResultStorage.bufferOperations.putAll(vectorDescriptor, bufferOperations)
        }
    }

    println("All generations completed! Saving data...")
    saveGeneratingResults(generatingResultStorage)
}
