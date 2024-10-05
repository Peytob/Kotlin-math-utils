package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.MemberName
import dev.peytob.math.generation.kpoet.extractPostfix
import kotlin.reflect.KClass

data class PrimitiveDescriptor(
    val cls: KClass<*>,
    val sizeBytes: Int,
    val numberCastMethodName: MemberName
) {
    val postfix: Char = extractPostfix(cls)
}
