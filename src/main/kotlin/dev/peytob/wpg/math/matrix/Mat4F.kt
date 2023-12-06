package dev.peytob.wpg.math.matrix

class Mat4F internal constructor(
    override val raw: FloatArray
) : Mat4 {

    constructor(a11: Float, a12: Float, a13: Float, a14: Float,
                a21: Float, a22: Float, a23: Float, a24: Float,
                a31: Float, a32: Float, a33: Float, a34: Float,
                a41: Float, a42: Float, a43: Float, a44: Float
    ) : this(floatArrayOf(
        a11, a12, a13, a14,
        a21, a22, a23, a24,
        a31, a32, a33, a34,
        a41, a42, a43, a44
    ))

    constructor() : this(FloatArray(16))

    override fun get(row: Int, column: Int): Float = raw[toIndex(row, column)]

    private fun toIndex(row: Int, column: Int): Int = row * 4 + column

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mat4F

        return raw.contentEquals(other.raw)
    }

    override fun hashCode(): Int {
        return raw.contentHashCode()
    }


}