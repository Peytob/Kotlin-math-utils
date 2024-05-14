package dev.peytob.math.matrix

import dev.peytob.math.vector.vec2.Vec2i

sealed interface Mat4Accessor<T : Number> {

    /**
     * Returns side size of square matrix
     */
    val size: Int

    /**
     * Returns (x, y) side sizes of square matrix
     */
    val sizes: Vec2i

    /**
     * Returns count of elements in matrix
     */
    val elementsCount: Int

    /**
     * Returns sizes of one matrix element in bytes
     */
    val elementSizeBytes: Int

    /**
     * Returns size of flat matrix elements array size in bytes
     */
    val arraySizeBytes: Int
        get() = elementSizeBytes * elementsCount

    /**
     * Returns (x, y) element
     */
    operator fun get(row: Int, column: Int): T
}
