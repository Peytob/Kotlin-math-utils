package dev.peytob.math.matrix.mat33

internal data class ArrayMat33i(
    private val array: Array<Int>
) : Mat33i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val matrixSizeBytes: Int
        get() = Int.SIZE_BYTES * 3 * 3

    override fun get(index: Int): Int {
        return array[index]
    }

    override fun asArray(): Array<Int> {
        return array
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ArrayMat33i

        return array.contentEquals(other.array)
    }

    override fun hashCode(): Int {
        return array.contentHashCode()
    }

    override fun toString(): String {
        return "mat33i[ " +
                "[${get(0)}, ${get(1)}, ${get(2)}] " +
                "[${get(3)}, ${get(4)}, ${get(5)}] " +
                "[${get(6)}, ${get(7)}, ${get(8)}] " +
                "]"
    }
}