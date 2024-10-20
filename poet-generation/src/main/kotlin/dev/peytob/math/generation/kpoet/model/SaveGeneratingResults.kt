package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.FileSpec

fun saveGeneratingResults(generatingResultStorage: GeneratingResultStorage) {
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        FileSpec.builder(vectorDescriptor.immutableBase)
            .addType(vectorDescriptor.immutableBaseTypeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)

        FileSpec.builder(vectorDescriptor.mutableBase)
            .addType(vectorDescriptor.mutableBaseTypeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)

        FileSpec.builder(vectorDescriptor.accessor)
            .addType(vectorDescriptor.accessorTypeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

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

    generatingResultStorage.bufferOperations.asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}NioBufferUtils")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }
}
