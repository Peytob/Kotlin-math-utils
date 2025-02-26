package dev.peytob.math.generation.kpoet

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName
import dev.peytob.math.generation.kpoet.generation.vector.*
import dev.peytob.math.generation.kpoet.model.*

fun main() {
    val generationContext = GenerationContext(
        primitives = listOf(
            Primitive(
                cls = Double::class.asClassName(),
                sizeBytes = Double.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toDouble"),
                literal = ".0",
                postfix = "d"
            ),

            Primitive(
                cls = Float::class.asClassName(),
                sizeBytes = Float.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toFloat"),
                literal = "f",
                postfix = "f"
            ),

            Primitive(
                cls = Int::class.asClassName(),
                sizeBytes = Int.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toInt"),
                literal = null,
                postfix = "i"
            ),

            Primitive(
                cls = Long::class.asClassName(),
                sizeBytes = Long.SIZE_BYTES,
                numberCastMethodName = MemberName(Number::class.asClassName(), "toLong"),
                literal = "L",
                postfix = "l"
            )
        ),

        vectorAccessors = listOf(
            VectorAccessor(
                components = listOf("x", "y"),
                destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec2"
            ),

            VectorAccessor(
                components = listOf("x", "y", "z"),
                destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec3"
            )
        )
    )

    println("Starting vectors and matrix types generation")
    println("Configuration:")
    println("-> Destination folder: $BASE_DESTINATION_FOLDER")
    println("-> Target generation primitives: ${generationContext.getPrimitives().joinToString(", ") { it.cls.simpleName }}")
    generationContext.getVectorAccessors()
        .joinToString(", ") { it.components.joinToString(",", prefix = "[", postfix = "]") }
        .let { println("-> Target vector accessors: $it") }
    println()

    // Vectors

    println("Generation type specs for vector accessors")
    generationContext.getVectorAccessors().forEach {
        println("-> Generation vector accessor class for ${it.size}-vector")
        it.typeSpec = generateVectorAccessor(it)
        it.className = ClassName(it.destinationPackage, it.typeSpec.name!!)
    }
    println()

    println("Generation vectors bases for vector accessors")
    val vectorBases = generationContext.getVectorAccessors().flatMap { accessor ->
        println("-> Generation vector bases for accessor ${accessor.className.simpleName}")

        listOf(
            VectorBase(
                accessor = accessor,
                isMutable = false,
                typeSpec = generateVectorImmutableBase(accessor)
            ),

            VectorBase(
                accessor = accessor,
                isMutable = true,
                typeSpec = generateVectorMutableBase(accessor)
            )
        )
    }
    println()

    println("Generating typed struct vector realisations")
    vectorBases
        .flatMap { base ->
            generationContext.getPrimitives().map { primitive ->
                println("-> Generation vector ${base.className.simpleName} struct realisation for primitive ${primitive.cls.simpleName}")

                val typeSpec = if (base.isMutable)
                    generateVectorStructMutableRealisation(base, primitive)
                else
                    generateVectorStructImmutableRealisation(base, primitive)

                Vector(
                    base = base,
                    primitive = primitive,
                    typeSpec = typeSpec
                )
            }
        }
        .forEach(generationContext::registerVector)

    // Saving

    println("Saving ${generationContext.getVectorAccessors().size} vector accessors")
    generationContext.getVectorAccessors().forEach { accessor ->
        FileSpec.builder(accessor.className)
            .addType(accessor.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    println("Saving ${vectorBases.size} vector bases with vectors aliases")
    vectorBases.forEach { base ->
        FileSpec.builder(base.className)
            .addType(base.typeSpec)
            .apply {
                generationContext.getVectors()
                    .filter { vector -> vector.base == base }
                    .map(Vector::alias)
                    .forEach(this::addTypeAlias)
            }
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    println("Saving vectors realisations")
    generationContext.getVectors().forEach { vector ->
        FileSpec.builder(vector.className)
            .addType(vector.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }
}
