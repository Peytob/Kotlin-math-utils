package dev.peytob.math.generation.kpoet.model

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec

fun saveGeneratingResults(generatingResultStorage: GeneratingResultStorage) {
    generatingResultStorage.vectorTypes.values().forEach { vectorType ->
        FileSpec.builder(vectorType.className)
            .addType(vectorType.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.operations.asMap().forEach { (vectorType, functions) ->
        FileSpec.builder(vectorType.vectorDescriptor.destinationPackage, "${vectorType.alias}Operations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.factories.asMap().forEach { (vectorType, functions) ->
        FileSpec.builder(vectorType.vectorDescriptor.destinationPackage, "${vectorType.alias}Factory")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    groupByVectorDescriptor(generatingResultStorage.bufferOperations).asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}NioBufferUtils")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }
}

fun groupByVectorDescriptor(functions: Multimap<VectorSpec, FunSpec>): Multimap<VectorDescriptor, FunSpec> {
    val multimap = HashMultimap.create<VectorDescriptor, FunSpec>()

    functions.forEach { vectorType, function ->
        multimap.put(vectorType.vectorDescriptor, function)
    }

    return multimap
}
