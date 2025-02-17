package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.model.*
import dev.peytob.math.generation.kpoet.vec.*
import dev.peytob.math.generation.kpoet.vec.operation.arithmetic.generateImmutableVecOperations
import dev.peytob.math.generation.kpoet.vec.operation.arithmetic.generateImmutableVecScalarOperations
import dev.peytob.math.generation.kpoet.vec.operation.arithmetic.generateMutableVecOperations
import dev.peytob.math.generation.kpoet.vec.operation.arithmetic.generateMutableVecScalarOperations
import dev.peytob.math.generation.kpoet.vec.operation.buffer.generateVecBufferOperations
import dev.peytob.math.generation.kpoet.vec.operation.algebra.generateVectorDistanceOperations
import dev.peytob.math.generation.kpoet.vec.operation.algebra.generateVectorLengthOperations
import dev.peytob.math.generation.kpoet.vec.operation.algebra.generateVectorNormalizeOperations

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
        generatingResultStorage.arithmeticOperations.putAll(vectorSpec, operationsException)
    }

    println("Generating immutable vectors-vector operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateMutableVecOperations(vectorSpec, generatingResultStorage.vectorTypes.values())
        generatingResultStorage.arithmeticOperations.putAll(vectorSpec, operationsException)
    }

    println("Generating immutable vectors-scalar operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateImmutableVecScalarOperations(vectorSpec, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.arithmeticOperations.putAll(vectorSpec, operationsException)
    }

    println("Generating mutable vectors-scalar operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val operationsException = generateMutableVecScalarOperations(vectorSpec, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.arithmeticOperations.putAll(vectorSpec, operationsException)
    }

    println("Generating vectors buffer operations")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        PRIMITIVE_DESCRIPTORS.forEach { primitiveDescriptor ->
            val bufferOperations = generateVecBufferOperations(vectorDescriptor, primitiveDescriptor)
            generatingResultStorage.bufferOperations.putAll(vectorDescriptor, bufferOperations)
        }
    }

    println("Generating vectors distance operations")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        val vectorAccessorOperations = generateVectorDistanceOperations(vectorDescriptor, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.distanceOperations.putAll(vectorDescriptor, vectorAccessorOperations)
    }

    println("Generating vectors length operations")
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        val vectorAccessorOperations = generateVectorLengthOperations(vectorDescriptor, PRIMITIVE_DESCRIPTORS)
        generatingResultStorage.lengthOperations.putAll(vectorDescriptor, vectorAccessorOperations)
    }

    println("Generating vectors normalize operations")
    generatingResultStorage.vectorTypes.forEach { _, vectorSpec ->
        val vectorAccessorOperations = generateVectorNormalizeOperations(vectorSpec)
        generatingResultStorage.normalizeOperations.putAll(vectorSpec, vectorAccessorOperations)
    }

    println("All generations completed! Saving data...")
    saveGeneratingResults(generatingResultStorage)
}
