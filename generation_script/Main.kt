package org.example.generation

import com.squareup.kotlinpoet.FileSpec
import generation.generateVectorOperations
//import generation.generateVectorBufferOperations
import generation.generateVectorConstructors
import generation.getPackage
import kotlin.io.path.Path

fun main() {
    val context = Context(
        generatingSettings = GeneratingSettings(
            targetPackage = "dev.peytob.math",
            targetPath = Path("./src/main/kotlin")
        )
    )

    // Generating base
    generateBaseInterfaces(context)

    // Generating interfaces for math objects
    generateVectorInterfaces(context)

    // Generating operations
    generateVectorConstructors(context)
    generateVectorOperations(context)
//    generateVectorBufferOperations(context)

    // Saving all...
    writeContext(context)
}

fun writeContext(context: Context) {
    val targetPath = context.generatingSettings.targetPath

    FileSpec.builder(context.baseInterfaces.memorizedObject.getClassName())
        .addType(context.baseInterfaces.memorizedObject)
        .build()
        .writeTo(targetPath)

    FileSpec.builder(context.baseInterfaces.vec.getClassName())
        .addType(context.baseInterfaces.vec)
        .build()
        .writeTo(targetPath)

    saveVector(context, context.vec2)
    saveVector(context, context.vec3)
}

fun saveVector(context: Context, vector: Vector) {
    val targetPath = context.generatingSettings.targetPath

    FileSpec.builder(vector.baseInterface.getClassName())
        .addType(vector.baseInterface)
        .also { vector.interfaces.forEach(it::addType) }
        .build()
        .writeTo(targetPath)

    vector.realisations.forEach { vector ->
        FileSpec.builder(vector.getClassName())
            .addType(vector)
            .build()
            .writeTo(targetPath)
    }

    FileSpec.builder(vector.baseInterface.getPackage(), "Vec${vector.components.size}Constructors")
        .addFunctions(vector.constructors)
        .build()
        .writeTo(targetPath)

    FileSpec.builder(vector.baseInterface.getPackage(), "Vec${vector.components.size}Methods")
        .addFunctions(vector.outerMethods)
        .build()
        .writeTo(targetPath)
}
