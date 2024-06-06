package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class Mat4fStruct internal constructor(
    private val raw: FloatArray
) : Mat4f {

    private val rawHashcode = raw.contentHashCode()

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override fun get(row: Int, column: Int): Float = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4fStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = rawHashcode
}