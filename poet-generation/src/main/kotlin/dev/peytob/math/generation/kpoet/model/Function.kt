package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec

data class Function(
    val file: String,
    val packageName: String,
    val operandsAliases: List<String>,
    val funSpec: FunSpec
) {
    val name: String = funSpec.name
    val className = ClassName(packageName, name)
}