package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName

class VectorSpec(
    val vectorDescriptor: VectorDescriptor,
    val primitiveDescriptor: PrimitiveDescriptor,
    val typeSpec: TypeSpec,
) {

    val className = ClassName(vectorDescriptor.destinationPackage, typeSpec.name!!)

    val components = typeSpec.propertySpecs
        .filter { vectorDescriptor.components.contains(it.name) }

    val baseClassName = vectorDescriptor.base.asClassName().parameterizedBy(primitiveDescriptor.cls.asTypeName())

    val alias = "Vec${components.size}${primitiveDescriptor.postfix}"
}