package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

data class VectorAccessor(
    val components: Collection<String>,
    val destinationPackage: String
) {
    val size: Int = components.size
    lateinit var typeSpec: TypeSpec
    lateinit var className: ClassName
}