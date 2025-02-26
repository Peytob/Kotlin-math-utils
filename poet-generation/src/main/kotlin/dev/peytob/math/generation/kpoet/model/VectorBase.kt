package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

data class VectorBase(
    val accessor: VectorAccessor,
    val isMutable: Boolean,
    val typeSpec: TypeSpec
) {
    val size = accessor.size
    val components = accessor.components
    val className = ClassName(accessor.destinationPackage, typeSpec.name!!)
}