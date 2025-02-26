package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName

data class Primitive(
    val cls: ClassName,
    val sizeBytes: Int,
    val numberCastMethodName: MemberName,
    val literal: String?,
    val postfix: String
)