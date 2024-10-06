package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

class VectorSpec(
    val vectorDescriptor: VectorDescriptor,
    val primitiveDescriptor: PrimitiveDescriptor,
    val typeSpec: TypeSpec
) {

    val className = ClassName(vectorDescriptor.destinationPackage, typeSpec.name!!)

    val components = typeSpec.propertySpecs
        .filter { vectorDescriptor.components.contains(it.name) }
}