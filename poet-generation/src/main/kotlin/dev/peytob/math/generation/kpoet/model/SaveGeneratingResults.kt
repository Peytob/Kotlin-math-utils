package dev.peytob.math.generation.kpoet.model

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.squareup.kotlinpoet.FileSpec

fun saveGeneratingResults(generatingResultStorage: GeneratingResultStorage) {
    generatingResultStorage.vectorDescriptors.forEach { vectorDescriptor ->
        val typeAliasSpecs = generatingResultStorage.vectorAliases[vectorDescriptor]

        FileSpec.builder(vectorDescriptor.immutableBase)
            .addType(vectorDescriptor.immutableBaseTypeSpec)
            .apply {
                typeAliasSpecs
                    .filter { !it.name.startsWith("Mut") }
                    .forEach(::addTypeAlias)
            }
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)

        FileSpec.builder(vectorDescriptor.mutableBase)
            .addType(vectorDescriptor.mutableBaseTypeSpec)
            .apply {
                typeAliasSpecs
                    .filter { it.name.startsWith("Mut") }
                    .forEach(::addTypeAlias)
            }
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

    generatingResultStorage.factories.asMap().forEach { (vectorType, functions) ->
        FileSpec.builder(vectorType.vectorDescriptor.destinationPackage, "${vectorType.alias}Factory")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.arithmeticOperations.asMap().forEach { (vectorType, functions) ->
        FileSpec.builder(vectorType.vectorDescriptor.destinationPackage, "${vectorType.alias}ArithmeticOperations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.bufferOperations.asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}BufferOperations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.distanceOperations.asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}DistanceOperations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    generatingResultStorage.lengthOperations.asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}LengthOperations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    groupByVectorDescriptor(generatingResultStorage.normalizeOperations).asMap().forEach { (vectorDescriptor, functions) ->
        FileSpec.builder(vectorDescriptor.destinationPackage, "Vec${vectorDescriptor.size}NormalizeOperations")
            .addFunctions(functions)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }
}

fun <T> groupByVectorDescriptor(vectorData: Multimap<VectorSpec, T>): Multimap<VectorDescriptor, T> {
    val multimap = HashMultimap.create<VectorDescriptor, T>()

    vectorData.forEach { vectorType, data ->
        multimap.put(vectorType.vectorDescriptor, data)
    }

    return multimap
}
