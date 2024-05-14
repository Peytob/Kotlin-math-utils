package dev.peytob.math.matrix

internal class Mat4iStruct internal constructor(
    override val raw: IntArray
) : Mat4i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override fun get(row: Int, column: Int): Int = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4iStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int {
        return raw.contentHashCode()
    }
}