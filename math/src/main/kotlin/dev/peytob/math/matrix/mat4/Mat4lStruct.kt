package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class Mat4lStruct internal constructor(
    private val raw: LongArray
) : Mat4l {

    private val rawHashcode = raw.contentHashCode()

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override fun get(row: Int, column: Int): Long = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4lStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = rawHashcode
}