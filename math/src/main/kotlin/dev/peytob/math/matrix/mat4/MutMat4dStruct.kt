package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class MutMat4dStruct internal constructor(
    private val raw: DoubleArray
) : MutMat4d {

    override fun plus(right: MutMat4d): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] += right[element]
        }

        return this
    }

    override fun plus(right: MutMat4f): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toDouble()
        }

        return this
    }

    override fun plus(right: MutMat4i): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toDouble()
        }

        return this
    }

    override fun plus(right: MutMat4l): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toDouble()
        }

        return this
    }

    override fun minus(right: MutMat4d): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element]
        }

        return this
    }

    override fun minus(right: MutMat4f): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toDouble()
        }

        return this
    }

    override fun minus(right: MutMat4i): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toDouble()
        }

        return this
    }

    override fun minus(right: MutMat4l): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toDouble()
        }

        return this
    }

    override fun times(right: MutMat4d): MutMat4d {
        raw[0] = get(0, 0) * right[0, 0] + get(1, 0) * right[0, 1] +
                get(2, 0) * right[0, 2] + get(3, 0) * right[0, 3]
        raw[1] = get(0, 1) * right[0, 0] + get(1, 1) * right[0, 1] +
                get(2, 1) * right[0, 2] + get(3, 1) * right[0, 3]
        raw[2] = get(0, 2) * right[0, 0] + get(1, 2) * right[0, 1] +
                get(2, 2) * right[0, 2] + get(3, 2) * right[0, 3]
        raw[3] = get(0, 3) * right[0, 0] + get(1, 3) * right[0, 1] +
                get(2, 3) * right[0, 2] + get(3, 3) * right[0, 3]
        raw[4] = get(0, 0) * right[1, 0] + get(1, 0) * right[1, 1] +
                get(2, 0) * right[1, 2] + get(3, 0) * right[1, 3]
        raw[5] = get(0, 1) * right[1, 0] + get(1, 1) * right[1, 1] +
                get(2, 1) * right[1, 2] + get(3, 1) * right[1, 3]
        raw[6] = get(0, 2) * right[1, 0] + get(1, 2) * right[1, 1] +
                get(2, 2) * right[1, 2] + get(3, 2) * right[1, 3]
        raw[7] = get(0, 3) * right[1, 0] + get(1, 3) * right[1, 1] +
                get(2, 3) * right[1, 2] + get(3, 3) * right[1, 3]
        raw[8] = get(0, 0) * right[2, 0] + get(1, 0) * right[2, 1] +
                get(2, 0) * right[2, 2] + get(3, 0) * right[2, 3]
        raw[9] = get(0, 1) * right[2, 0] + get(1, 1) * right[2, 1] +
                get(2, 1) * right[2, 2] + get(3, 1) * right[2, 3]
        raw[10] = get(0, 2) * right[2, 0] + get(1, 2) * right[2, 1] +
                get(2, 2) * right[2, 2] + get(3, 2) * right[2, 3]
        raw[11] = get(0, 3) * right[2, 0] + get(1, 3) * right[2, 1] +
                get(2, 3) * right[2, 2] + get(3, 3) * right[2, 3]
        raw[12] = get(0, 0) * right[3, 0] + get(1, 0) * right[3, 1] +
                get(2, 0) * right[3, 2] + get(3, 0) * right[3, 3]
        raw[13] = get(0, 1) * right[3, 0] + get(1, 1) * right[3, 1] +
                get(2, 1) * right[3, 2] + get(3, 1) * right[3, 3]
        raw[14] = get(0, 2) * right[3, 0] + get(1, 2) * right[3, 1] +
                get(2, 2) * right[3, 2] + get(3, 2) * right[3, 3]
        raw[15] = get(0, 3) * right[3, 0] + get(1, 3) * right[3, 1] +
                get(2, 3) * right[3, 2] + get(3, 3) * right[3, 3]

        return this
    }

    override fun times(scalar: Double): MutMat4d {
        for (element in 0..< elementsCount) {
            raw[element] *= scalar
        }

        return this
    }

    override fun times(right: MutMat4f): MutMat4d {
        raw[0] = get(0, 0) * right[0, 0] + get(1, 0) * right[0, 1] +
                get(2, 0) * right[0, 2] + get(3, 0) * right[0, 3]
        raw[1] = get(0, 1) * right[0, 0] + get(1, 1) * right[0, 1] +
                get(2, 1) * right[0, 2] + get(3, 1) * right[0, 3]
        raw[2] = get(0, 2) * right[0, 0] + get(1, 2) * right[0, 1] +
                get(2, 2) * right[0, 2] + get(3, 2) * right[0, 3]
        raw[3] = get(0, 3) * right[0, 0] + get(1, 3) * right[0, 1] +
                get(2, 3) * right[0, 2] + get(3, 3) * right[0, 3]
        raw[4] = get(0, 0) * right[1, 0] + get(1, 0) * right[1, 1] +
                get(2, 0) * right[1, 2] + get(3, 0) * right[1, 3]
        raw[5] = get(0, 1) * right[1, 0] + get(1, 1) * right[1, 1] +
                get(2, 1) * right[1, 2] + get(3, 1) * right[1, 3]
        raw[6] = get(0, 2) * right[1, 0] + get(1, 2) * right[1, 1] +
                get(2, 2) * right[1, 2] + get(3, 2) * right[1, 3]
        raw[7] = get(0, 3) * right[1, 0] + get(1, 3) * right[1, 1] +
                get(2, 3) * right[1, 2] + get(3, 3) * right[1, 3]
        raw[8] = get(0, 0) * right[2, 0] + get(1, 0) * right[2, 1] +
                get(2, 0) * right[2, 2] + get(3, 0) * right[2, 3]
        raw[9] = get(0, 1) * right[2, 0] + get(1, 1) * right[2, 1] +
                get(2, 1) * right[2, 2] + get(3, 1) * right[2, 3]
        raw[10] = get(0, 2) * right[2, 0] + get(1, 2) * right[2, 1] +
                get(2, 2) * right[2, 2] + get(3, 2) * right[2, 3]
        raw[11] = get(0, 3) * right[2, 0] + get(1, 3) * right[2, 1] +
                get(2, 3) * right[2, 2] + get(3, 3) * right[2, 3]
        raw[12] = get(0, 0) * right[3, 0] + get(1, 0) * right[3, 1] +
                get(2, 0) * right[3, 2] + get(3, 0) * right[3, 3]
        raw[13] = get(0, 1) * right[3, 0] + get(1, 1) * right[3, 1] +
                get(2, 1) * right[3, 2] + get(3, 1) * right[3, 3]
        raw[14] = get(0, 2) * right[3, 0] + get(1, 2) * right[3, 1] +
                get(2, 2) * right[3, 2] + get(3, 2) * right[3, 3]
        raw[15] = get(0, 3) * right[3, 0] + get(1, 3) * right[3, 1] +
                get(2, 3) * right[3, 2] + get(3, 3) * right[3, 3]

        return this
    }

    override fun times(scalar: Float): MutMat4d {
        val doubleScalar = scalar.toDouble()

        for (element in 0..< elementsCount) {
            raw[element] *= doubleScalar
        }

        return this
    }

    override fun times(right: MutMat4i): MutMat4d {
        raw[0] = get(0, 0) * right[0, 0] + get(1, 0) * right[0, 1] +
                get(2, 0) * right[0, 2] + get(3, 0) * right[0, 3]
        raw[1] = get(0, 1) * right[0, 0] + get(1, 1) * right[0, 1] +
                get(2, 1) * right[0, 2] + get(3, 1) * right[0, 3]
        raw[2] = get(0, 2) * right[0, 0] + get(1, 2) * right[0, 1] +
                get(2, 2) * right[0, 2] + get(3, 2) * right[0, 3]
        raw[3] = get(0, 3) * right[0, 0] + get(1, 3) * right[0, 1] +
                get(2, 3) * right[0, 2] + get(3, 3) * right[0, 3]
        raw[4] = get(0, 0) * right[1, 0] + get(1, 0) * right[1, 1] +
                get(2, 0) * right[1, 2] + get(3, 0) * right[1, 3]
        raw[5] = get(0, 1) * right[1, 0] + get(1, 1) * right[1, 1] +
                get(2, 1) * right[1, 2] + get(3, 1) * right[1, 3]
        raw[6] = get(0, 2) * right[1, 0] + get(1, 2) * right[1, 1] +
                get(2, 2) * right[1, 2] + get(3, 2) * right[1, 3]
        raw[7] = get(0, 3) * right[1, 0] + get(1, 3) * right[1, 1] +
                get(2, 3) * right[1, 2] + get(3, 3) * right[1, 3]
        raw[8] = get(0, 0) * right[2, 0] + get(1, 0) * right[2, 1] +
                get(2, 0) * right[2, 2] + get(3, 0) * right[2, 3]
        raw[9] = get(0, 1) * right[2, 0] + get(1, 1) * right[2, 1] +
                get(2, 1) * right[2, 2] + get(3, 1) * right[2, 3]
        raw[10] = get(0, 2) * right[2, 0] + get(1, 2) * right[2, 1] +
                get(2, 2) * right[2, 2] + get(3, 2) * right[2, 3]
        raw[11] = get(0, 3) * right[2, 0] + get(1, 3) * right[2, 1] +
                get(2, 3) * right[2, 2] + get(3, 3) * right[2, 3]
        raw[12] = get(0, 0) * right[3, 0] + get(1, 0) * right[3, 1] +
                get(2, 0) * right[3, 2] + get(3, 0) * right[3, 3]
        raw[13] = get(0, 1) * right[3, 0] + get(1, 1) * right[3, 1] +
                get(2, 1) * right[3, 2] + get(3, 1) * right[3, 3]
        raw[14] = get(0, 2) * right[3, 0] + get(1, 2) * right[3, 1] +
                get(2, 2) * right[3, 2] + get(3, 2) * right[3, 3]
        raw[15] = get(0, 3) * right[3, 0] + get(1, 3) * right[3, 1] +
                get(2, 3) * right[3, 2] + get(3, 3) * right[3, 3]

        return this
    }

    override fun times(scalar: Int): MutMat4d {
        val doubleScalar = scalar.toDouble()

        for (element in 0..< elementsCount) {
            raw[element] *= doubleScalar
        }

        return this
    }

    override fun times(right: MutMat4l): MutMat4d {
        raw[0] = get(0, 0) * right[0, 0] + get(1, 0) * right[0, 1] +
                get(2, 0) * right[0, 2] + get(3, 0) * right[0, 3]
        raw[1] = get(0, 1) * right[0, 0] + get(1, 1) * right[0, 1] +
                get(2, 1) * right[0, 2] + get(3, 1) * right[0, 3]
        raw[2] = get(0, 2) * right[0, 0] + get(1, 2) * right[0, 1] +
                get(2, 2) * right[0, 2] + get(3, 2) * right[0, 3]
        raw[3] = get(0, 3) * right[0, 0] + get(1, 3) * right[0, 1] +
                get(2, 3) * right[0, 2] + get(3, 3) * right[0, 3]
        raw[4] = get(0, 0) * right[1, 0] + get(1, 0) * right[1, 1] +
                get(2, 0) * right[1, 2] + get(3, 0) * right[1, 3]
        raw[5] = get(0, 1) * right[1, 0] + get(1, 1) * right[1, 1] +
                get(2, 1) * right[1, 2] + get(3, 1) * right[1, 3]
        raw[6] = get(0, 2) * right[1, 0] + get(1, 2) * right[1, 1] +
                get(2, 2) * right[1, 2] + get(3, 2) * right[1, 3]
        raw[7] = get(0, 3) * right[1, 0] + get(1, 3) * right[1, 1] +
                get(2, 3) * right[1, 2] + get(3, 3) * right[1, 3]
        raw[8] = get(0, 0) * right[2, 0] + get(1, 0) * right[2, 1] +
                get(2, 0) * right[2, 2] + get(3, 0) * right[2, 3]
        raw[9] = get(0, 1) * right[2, 0] + get(1, 1) * right[2, 1] +
                get(2, 1) * right[2, 2] + get(3, 1) * right[2, 3]
        raw[10] = get(0, 2) * right[2, 0] + get(1, 2) * right[2, 1] +
                get(2, 2) * right[2, 2] + get(3, 2) * right[2, 3]
        raw[11] = get(0, 3) * right[2, 0] + get(1, 3) * right[2, 1] +
                get(2, 3) * right[2, 2] + get(3, 3) * right[2, 3]
        raw[12] = get(0, 0) * right[3, 0] + get(1, 0) * right[3, 1] +
                get(2, 0) * right[3, 2] + get(3, 0) * right[3, 3]
        raw[13] = get(0, 1) * right[3, 0] + get(1, 1) * right[3, 1] +
                get(2, 1) * right[3, 2] + get(3, 1) * right[3, 3]
        raw[14] = get(0, 2) * right[3, 0] + get(1, 2) * right[3, 1] +
                get(2, 2) * right[3, 2] + get(3, 2) * right[3, 3]
        raw[15] = get(0, 3) * right[3, 0] + get(1, 3) * right[3, 1] +
                get(2, 3) * right[3, 2] + get(3, 3) * right[3, 3]

        return this
    }

    override fun times(scalar: Long): MutMat4d {
        val doubleScalar = scalar.toDouble()

        for (element in 0..< elementsCount) {
            raw[element] *= doubleScalar
        }

        return this
    }

    override fun withRaw(supplier: (DoubleArray) -> Unit) {
        supplier(raw)
    }

    override fun set(row: Int, column: Int, value: Double) {
        raw[toIndex(row, column, size)] = value
    }

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override fun get(row: Int, column: Int): Double {
        return get(toIndex(row, column, size))
    }

    override fun get(index: Int): Double {
        return raw[index]
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutMat4dStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = raw.contentHashCode()
}