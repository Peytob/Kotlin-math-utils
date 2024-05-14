package dev.peytob.math.matrix

internal class Mat4dStruct internal constructor(
    override val raw: DoubleArray
) : Mat4d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override fun get(row: Int, column: Int): Double = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4dStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int {
        return raw.contentHashCode()
    }
}