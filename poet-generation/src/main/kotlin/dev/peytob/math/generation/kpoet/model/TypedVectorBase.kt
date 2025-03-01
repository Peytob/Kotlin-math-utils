package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

data class TypedVectorBase(
    val base: VectorBase,
    val primitive: Primitive
) {
    val className = base.className.parameterizedBy(primitive.cls)
    val isMutable = base.isMutable
    val alias = base.className.simpleName + primitive.postfix
    val size = base.size
    val components = base.components
}