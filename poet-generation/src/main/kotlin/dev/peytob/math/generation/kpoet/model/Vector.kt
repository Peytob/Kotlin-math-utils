package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec

data class Vector(
    val base: VectorBase,
    val primitive: Primitive,
    val typeSpec: TypeSpec
) {
    val size = base.size
    val isMutable = base.isMutable
    val components = base.components
    val className = ClassName(base.accessor.destinationPackage, typeSpec.name!!)
    val alias = generateVectorAlias()

    private fun generateVectorAlias() = TypeAliasSpec
        .builder(base.className.simpleName + primitive.postfix, base.className.parameterizedBy(primitive.cls))
        .build()
}
