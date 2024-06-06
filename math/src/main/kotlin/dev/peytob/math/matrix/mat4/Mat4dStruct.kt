package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class Mat4dStruct internal constructor(
    private val raw: DoubleArray
) : Mat4d {

    private val rawHashcode = raw.contentHashCode()

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override fun get(row: Int, column: Int): Double = raw[toIndex(row, column, size)]


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4dStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = rawHashcode
}