package dev.peytob.math.generation.kpoet

import dev.peytob.math.generation.kpoet.vec.generateTypedVec2

fun main() {
    val vec2d = generateTypedVec2(Double::class, Double.SIZE_BYTES)
    saveTypeFile(vec2d)
    val vec2f = generateTypedVec2(Float::class, Float.SIZE_BYTES)
    saveTypeFile(vec2f)
    val vec2i = generateTypedVec2(Int::class, Int.SIZE_BYTES)
    saveTypeFile(vec2i)
    val vec2l = generateTypedVec2(Long::class, Long.SIZE_BYTES)
    saveTypeFile(vec2l)
}
