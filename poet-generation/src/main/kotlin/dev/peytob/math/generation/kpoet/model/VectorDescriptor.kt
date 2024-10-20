package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

data class VectorDescriptor(
    val components: Collection<String>,

    val immutableBase: ClassName,
    val immutableBaseTypeSpec: TypeSpec,

    val mutableBase: ClassName,
    val mutableBaseTypeSpec: TypeSpec,

    val accessor: ClassName,
    val accessorTypeSpec: TypeSpec,

    val destinationPackage: String
) {
    val size: Int = components.size
}
