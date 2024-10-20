package dev.peytob.math.matrix.mat4

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
     * Number of rows in matrix (equals to size in mat4 case)
     */
    val rows: Int
        get() = size

    /**
     * Number of columns in matrix (equals to size in mat4 case)
     */
    val columns: Int
        get() = size

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

    /**
     * Returns elements with given index in raw matrix.
     */
    operator fun get(index: Int): T
}
