package dev.peytob.math.matrix.mat33

internal data class ArrayMat33l(
    private val array: Array<Long>
) : Mat33l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val matrixSizeBytes: Int
        get() = Long.SIZE_BYTES * 3 * 3

    override fun get(index: Int): Long {
        return array[index]
    }

    override fun asArray(): Array<Long> {
        return array
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArrayMat33l

        return array.contentEquals(other.array)
    }

    override fun hashCode(): Int {
        return array.contentHashCode()
    }

    override fun toString(): String {
        return "mat33l[ " +
                "[${get(0)}, ${get(1)}, ${get(2)}] " +
                "[${get(3)}, ${get(4)}, ${get(5)}] " +
                "[${get(6)}, ${get(7)}, ${get(8)}] " +
                "]"
    }
}