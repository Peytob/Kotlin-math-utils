package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

data class TypedVectorAccessor(
    val accessor: VectorAccessor,
    val primitive: Primitive
) {
    val className = accessor.className.parameterizedBy(primitive.cls)
    val alias = "${accessor.className.simpleName}${primitive.postfix}"
    val size = accessor.size
    val components = accessor.components
}