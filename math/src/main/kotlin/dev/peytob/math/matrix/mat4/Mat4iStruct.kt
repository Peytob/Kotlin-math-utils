package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class Mat4iStruct internal constructor(
    private val raw: IntArray
) : Mat4i {

    private val rawHashcode = raw.contentHashCode()

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override fun get(row: Int, column: Int): Int = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4iStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = rawHashcode
}