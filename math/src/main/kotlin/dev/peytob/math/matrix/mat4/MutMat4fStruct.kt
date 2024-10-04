package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.toIndex

internal class MutMat4fStruct internal constructor(
    private val raw: FloatArray
) : MutMat4f {

    override fun plus(right: MutMat4d): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toFloat()
        }

        return this
    }

    override fun plus(right: MutMat4f): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] += right[element]
        }

        return this
    }

    override fun plus(right: MutMat4i): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toFloat()
        }

        return this
    }

    override fun plus(right: MutMat4l): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] += right[element].toFloat()
        }

        return this
    }

    override fun minus(right: MutMat4d): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toFloat()
        }

        return this
    }

    override fun minus(right: MutMat4f): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element]
        }

        return this
    }

    override fun minus(right: MutMat4i): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toFloat()
        }

        return this
    }

    override fun minus(right: MutMat4l): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] -= right[element].toFloat()
        }

        return this
    }

    override fun times(right: MutMat4d): MutMat4f {
        raw[0] = get(0, 0) * right[0, 0].toFloat() + get(1, 0) * right[0, 1].toFloat() +
                get(2, 0) * right[0, 2].toFloat() + get(3, 0) * right[0, 3].toFloat()
        raw[1] = get(0, 1) * right[0, 0].toFloat() + get(1, 1) * right[0, 1].toFloat() +
                get(2, 1) * right[0, 2].toFloat() + get(3, 1) * right[0, 3].toFloat()
        raw[2] = get(0, 2) * right[0, 0].toFloat() + get(1, 2) * right[0, 1].toFloat() +
                get(2, 2) * right[0, 2].toFloat() + get(3, 2) * right[0, 3].toFloat()
        raw[3] = get(0, 3) * right[0, 0].toFloat() + get(1, 3) * right[0, 1].toFloat() +
                get(2, 3) * right[0, 2].toFloat() + get(3, 3) * right[0, 3].toFloat()
        raw[4] = get(0, 0) * right[1, 0].toFloat() + get(1, 0) * right[1, 1].toFloat() +
                get(2, 0) * right[1, 2].toFloat() + get(3, 0) * right[1, 3].toFloat()
        raw[5] = get(0, 1) * right[1, 0].toFloat() + get(1, 1) * right[1, 1].toFloat() +
                get(2, 1) * right[1, 2].toFloat() + get(3, 1) * right[1, 3].toFloat()
        raw[6] = get(0, 2) * right[1, 0].toFloat() + get(1, 2) * right[1, 1].toFloat() +
                get(2, 2) * right[1, 2].toFloat() + get(3, 2) * right[1, 3].toFloat()
        raw[7] = get(0, 3) * right[1, 0].toFloat() + get(1, 3) * right[1, 1].toFloat() +
                get(2, 3) * right[1, 2].toFloat() + get(3, 3) * right[1, 3].toFloat()
        raw[8] = get(0, 0) * right[2, 0].toFloat() + get(1, 0) * right[2, 1].toFloat() +
                get(2, 0) * right[2, 2].toFloat() + get(3, 0) * right[2, 3].toFloat()
        raw[9] = get(0, 1) * right[2, 0].toFloat() + get(1, 1) * right[2, 1].toFloat() +
                get(2, 1) * right[2, 2].toFloat() + get(3, 1) * right[2, 3].toFloat()
        raw[10] = get(0, 2) * right[2, 0].toFloat() + get(1, 2) * right[2, 1].toFloat() +
                get(2, 2) * right[2, 2].toFloat() + get(3, 2) * right[2, 3].toFloat()
        raw[11] = get(0, 3) * right[2, 0].toFloat() + get(1, 3) * right[2, 1].toFloat() +
                get(2, 3) * right[2, 2].toFloat() + get(3, 3) * right[2, 3].toFloat()
        raw[12] = get(0, 0) * right[3, 0].toFloat() + get(1, 0) * right[3, 1].toFloat() +
                get(2, 0) * right[3, 2].toFloat() + get(3, 0) * right[3, 3].toFloat()
        raw[13] = get(0, 1) * right[3, 0].toFloat() + get(1, 1) * right[3, 1].toFloat() +
                get(2, 1) * right[3, 2].toFloat() + get(3, 1) * right[3, 3].toFloat()
        raw[14] = get(0, 2) * right[3, 0].toFloat() + get(1, 2) * right[3, 1].toFloat() +
                get(2, 2) * right[3, 2].toFloat() + get(3, 2) * right[3, 3].toFloat()
        raw[15] = get(0, 3) * right[3, 0].toFloat() + get(1, 3) * right[3, 1].toFloat() +
                get(2, 3) * right[3, 2].toFloat() + get(3, 3) * right[3, 3].toFloat()

        return this
    }

    override fun times(scalar: Double): MutMat4f {
        val floatScalar = scalar.toFloat()
        for (element in 0..< elementsCount) {
            raw[element] *= floatScalar
        }

        return this
    }

    override fun times(right: MutMat4f): MutMat4f {
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

    override fun times(scalar: Float): MutMat4f {
        for (element in 0..< elementsCount) {
            raw[element] *= scalar
        }

        return this
    }

    override fun times(right: MutMat4i): MutMat4f {
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

    override fun times(scalar: Int): MutMat4f {
        val floatScalar = scalar.toFloat()

        for (element in 0..< elementsCount) {
            raw[element] *= floatScalar
        }

        return this
    }

    override fun times(right: MutMat4l): MutMat4f {
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

    override fun times(scalar: Long): MutMat4f {
        val floatScalar = scalar.toFloat()

        for (element in 0..< elementsCount) {
            raw[element] *= floatScalar
        }

        return this
    }

    override fun withRaw(supplier: (FloatArray) -> Unit) {
        supplier(raw)
    }

    override fun set(row: Int, column: Int, value: Float) {
        raw[toIndex(row, column, size)] = value
    }

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override fun get(row: Int, column: Int): Float {
        return get(toIndex(row, column, size))
    }

    override fun get(index: Int): Float {
        return raw[index]
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutMat4fStruct

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int = raw.contentHashCode()
}