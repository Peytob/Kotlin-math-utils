package dev.peytob.math.matrix

internal class Mat4fStruct internal constructor(
    override val raw: FloatArray
) : Mat4f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override fun get(row: Int, column: Int): Float = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4fStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int {
        return raw.contentHashCode()
    }
}