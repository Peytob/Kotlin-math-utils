package org.example.generation

import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import generation.addPackage

fun generateBaseInterfaces(context: Context) {
    context.baseInterfaces.memorizedObject = generateMemorizedObjectInterface(context)
}

fun generateMemorizedObjectInterface(context: Context): TypeSpec {
    return TypeSpec.interfaceBuilder("MemorizedObject")
        .generated()
        .addPackage(context.pkg(""))
        .addKdoc("Describes flat memory object")
        .addProperty(PropertySpec
            .builder("elementSize", Int::class)
            .addKdoc("Returns size of object one element in bytes")
            .build())
        .addProperty(PropertySpec
            .builder("elementCount", Int::class)
            .addKdoc("Returns count of object elements")
            .build())
        .addProperty(PropertySpec
            .builder("objectSize", Int::class)
            .addKdoc("Returns total size of object in bytes")
            .build())
        .build()
}

