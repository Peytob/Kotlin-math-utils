package dev.peytob.math.generation.kpoet

import com.squareup.kotlinpoet.*
import dev.peytob.math.generation.kpoet.generation.vector.instance.*
import dev.peytob.math.generation.kpoet.generation.vector.operation.generateStructVectorEmptyConstructor
import dev.peytob.math.generation.kpoet.generation.vector.operation.generateVectorCopyConstructor
import dev.peytob.math.generation.kpoet.generation.vector.operation.generateVectorCopyConstructorFlat
import dev.peytob.math.generation.kpoet.model.*
import dev.peytob.math.generation.kpoet.model.Function

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

    val typedVectorBases = vectorBases.flatMap { vectorBase ->
        generationContext.getPrimitives().map { primitive ->
            TypedVectorBase(
                base = vectorBase,
                primitive = primitive
            )
        }
    }

    val typedVectorAccessors = generationContext.getVectorAccessors().flatMap { vectorAccessor ->
        generationContext.getPrimitives().map { primitive ->
            TypedVectorAccessor(
                accessor = vectorAccessor,
                primitive = primitive
            )
        }
    }

    println("Generating typed struct vector realisations")
    typedVectorBases
        .map {
            val (base, primitive) = it
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
        .forEach(generationContext::registerVector)
    println()

    println("Generating struct vectors factory methods")
    generationContext.getVectors()
        .filter { leftVector -> leftVector.className.simpleName.contains("Struct") }
        .flatMap { vector ->
            val funSpec = generateStructVectorEmptyConstructor(vector)
            val filePostfix = "Factory"

            listOf(
                Function(
                    file = vector.alias.name + filePostfix,
                    packageName = vector.className.packageName,
                    operandsAliases = emptyList(),
                    funSpec = funSpec
                )
            )
        }
        .forEach(generationContext::registerFunction)

    generationContext.getVectors()
        .flatMap { leftVector ->
            typedVectorAccessors
                .filter { rightAccessor -> rightAccessor.accessor.size == leftVector.base.size }
                .flatMap { rightAccessor ->
                    val factoryVectorized = generateVectorCopyConstructor(leftVector, rightAccessor)
                    val factoryFlat = generateVectorCopyConstructorFlat(leftVector, rightAccessor)
                    val filePostfix = "Factory"

                    listOf(
                        Function(
                            file = leftVector.alias.name + filePostfix,
                            packageName = leftVector.base.className.packageName,
                            operandsAliases = listOf(leftVector.alias.name, rightAccessor.alias),
                            funSpec = factoryVectorized
                        ),

                        Function(
                            file = leftVector.alias.name + filePostfix,
                            packageName = leftVector.base.className.packageName,
                            operandsAliases = rightAccessor.components.toList(),
                            funSpec = factoryFlat,
                        ),
                    )
                }
        }
        .forEach { generationContext.registerFunction(it) }

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

    println("Saving ${generationContext.getVectors().size} vectors realisations")
    generationContext.getVectors().forEach { vector ->
        FileSpec.builder(vector.className)
            .addType(vector.typeSpec)
            .build()
            .writeTo(BASE_DESTINATION_FOLDER)
    }

    println("Saving ${generationContext.getFunctions().size} functions")
    generationContext.getFunctions()
        .groupBy { Pair(it.file, it.packageName) }
        .mapValues { it.value.map(Function::funSpec) }
        .forEach { (file, functions) ->
            println("-> Saving ${functions.size} functions to file ${file.first}")
            FileSpec.builder(file.second, file.first)
                .addFunctions(functions)
                .build()
                .writeTo(BASE_DESTINATION_FOLDER)
        }
}
