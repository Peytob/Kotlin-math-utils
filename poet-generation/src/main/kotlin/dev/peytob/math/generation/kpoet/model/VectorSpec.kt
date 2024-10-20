package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

class VectorSpec(
    val vectorDescriptor: VectorDescriptor,
    val primitiveDescriptor: PrimitiveDescriptor,
    val typeSpec: TypeSpec,
    val isImmutable: Boolean
) {

    val className = ClassName(vectorDescriptor.destinationPackage, typeSpec.name!!)

    val components = typeSpec.propertySpecs
        .filter { vectorDescriptor.components.contains(it.name) }

    val baseClassName = (if (isImmutable) vectorDescriptor.immutableBase else vectorDescriptor.mutableBase).parameterizedBy(primitiveDescriptor.cls)

    val alias = (if (isImmutable) "" else "Mutable") + "Vec${components.size}${primitiveDescriptor.postfix}"

    val parameterizedAccessor = vectorDescriptor.accessor.parameterizedBy(primitiveDescriptor.cls)
}