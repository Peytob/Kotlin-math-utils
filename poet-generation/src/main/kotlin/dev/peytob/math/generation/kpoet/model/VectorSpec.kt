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
    val isImmutable: Boolean
) {

    val className = ClassName(vectorDescriptor.destinationPackage, typeSpec.name!!)

    val components = typeSpec.propertySpecs
        .filter { vectorDescriptor.components.contains(it.name) }

    val baseClassName = (if (isImmutable) vectorDescriptor.immutableBase else vectorDescriptor.mutableBase).asClassName().parameterizedBy(primitiveDescriptor.cls.asTypeName())

    val alias = (if (isImmutable) "" else "Mutable") + "Vec${components.size}${primitiveDescriptor.postfix}"
}