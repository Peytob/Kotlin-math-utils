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
    val vectorDescriptors = generateVectorDescriptors(VECTOR_ORDERS)

    val generatingResultStorage = GeneratingResultStorage(
        vectorDescriptors = vectorDescriptors
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

    println("Generating vectors aliases")
    generatingResultStorage.vectorTypes.forEach { vectorDescriptor, vectorSpec ->
        val aliases = generateVectorAliases(vectorSpec)
        generatingResultStorage.vectorAliases[vectorDescriptor].add(aliases)
    }

    println("Generating vectors methods")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val factoryMethods = generateVecFactoryMethods(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.factories.putAll(vectorSpec, factoryMethods)
    }

    println("Generating immutable vector-vector operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateImmutableVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating immutable vectors-vector operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateMutableVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating immutable vectors-scalar operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateImmutableVecScalarOperations(vectorSpec, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating mutable vectors-scalar operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateMutableVecScalarOperations(vectorSpec, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.operations.putAll(vectorSpec, operationsException)
    }

    println("Generating vectors accessor operations")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        val vectorAccessorOperations = generateVectorAccessorOperations(vectorDescriptor, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.accessorOperations.putAll(vectorDescriptor, vectorAccessorOperations)
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
