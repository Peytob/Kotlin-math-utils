package dev.peytob.math.matrix

internal class Mat4lStruct internal constructor(
    override val raw: LongArray
) : Mat4l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override fun get(row: Int, column: Int): Long = raw[toIndex(row, column, size)]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4lStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int {
        return raw.contentHashCode()
    }
}