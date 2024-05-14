package dev.peytob.math.matrix

fun immutableMat4d(): Mat4d = immutableMat4d(DoubleArray(MAT4_ELEMENTS_COUNT))

fun immutableMat4d(
    a11: Double, a12: Double, a13: Double, a14: Double,
    a21: Double, a22: Double, a23: Double, a24: Double,
    a31: Double, a32: Double, a33: Double, a34: Double,
    a41: Double, a42: Double, a43: Double, a44: Double
): Mat4d = immutableMat4d(
    doubleArrayOf(
        a11, a12, a13, a14,
        a21, a22, a23, a24,
        a31, a32, a33, a34,
        a41, a42, a43, a44
    )
)

fun immutableMat4d(raw: DoubleArray): Mat4d {
    if (raw.size != MAT4_ELEMENTS_COUNT) {
        throw IllegalArgumentException("Raw array size should be $MAT4_ELEMENTS_COUNT, but ${raw.size} found")
    }

    return Mat4dStruct(raw)
}

fun immutableMat4f(): Mat4f = immutableMat4f(FloatArray(MAT4_ELEMENTS_COUNT))

fun immutableMat4f(
    a11: Float, a12: Float, a13: Float, a14: Float,
    a21: Float, a22: Float, a23: Float, a24: Float,
    a31: Float, a32: Float, a33: Float, a34: Float,
    a41: Float, a42: Float, a43: Float, a44: Float
): Mat4f = immutableMat4f(
    floatArrayOf(
        a11, a12, a13, a14,
        a21, a22, a23, a24,
        a31, a32, a33, a34,
        a41, a42, a43, a44
    )
)

fun immutableMat4f(raw: FloatArray): Mat4f {
    if (raw.size != MAT4_ELEMENTS_COUNT) {
        throw IllegalArgumentException("Raw array size should be $MAT4_ELEMENTS_COUNT, but ${raw.size} found")
    }

    return Mat4fStruct(raw)
}

fun immutableMat4i(): Mat4i = immutableMat4i(IntArray(MAT4_ELEMENTS_COUNT))

fun immutableMat4i(
    a11: Int, a12: Int, a13: Int, a14: Int,
    a21: Int, a22: Int, a23: Int, a24: Int,
    a31: Int, a32: Int, a33: Int, a34: Int,
    a41: Int, a42: Int, a43: Int, a44: Int
): Mat4i = immutableMat4i(
    intArrayOf(
        a11, a12, a13, a14,
        a21, a22, a23, a24,
        a31, a32, a33, a34,
        a41, a42, a43, a44
    )
)

fun immutableMat4i(raw: IntArray): Mat4i {
    if (raw.size != MAT4_ELEMENTS_COUNT) {
        throw IllegalArgumentException("Raw array size should be $MAT4_ELEMENTS_COUNT, but ${raw.size} found")
    }

    return Mat4iStruct(raw)
}

fun immutableMat4l(): Mat4l = immutableMat4l(LongArray(MAT4_ELEMENTS_COUNT))

fun immutableMat4l(
    a11: Long, a12: Long, a13: Long, a14: Long,
    a21: Long, a22: Long, a23: Long, a24: Long,
    a31: Long, a32: Long, a33: Long, a34: Long,
    a41: Long, a42: Long, a43: Long, a44: Long
): Mat4l = immutableMat4l(
    longArrayOf(
        a11, a12, a13, a14,
        a21, a22, a23, a24,
        a31, a32, a33, a34,
        a41, a42, a43, a44
    )
)

fun immutableMat4l(raw: LongArray): Mat4l {
    if (raw.size != MAT4_ELEMENTS_COUNT) {
        throw IllegalArgumentException("Raw array size should be $MAT4_ELEMENTS_COUNT, but ${raw.size} found")
    }

    return Mat4lStruct(raw)
}

/**
 * Creates orthographic matrix. See [glOrtho method](https://registry.khronos.org/OpenGL-Refpages/gl2.1/xhtml/glOrtho.xml) for details.
 */
fun ortho(left: Float, right: Float, bottom: Float, top: Float, nearVal: Float, farVal: Float): Mat4f {
    val tx = -((right + left) / (right - left))
    val ty = -((top + bottom) / (top - bottom))
    val tz = -((farVal + nearVal) / (farVal - nearVal))
    return immutableMat4f(
        2 / (right - left), 0f, 0f, 0f,
        0f, 2 / (top - bottom), 0f, 0f,
        0f, 0f, -2 / (farVal - nearVal), 0f,
        tx, ty, tz, 1f
    )
}

/**
 * Creates 2D orthographic matrix. See [glOrtho2D method](https://registry.khronos.org/OpenGL-Refpages/gl2.1/xhtml/gluOrtho2D.xml) for details.
 */
fun ortho2D(left: Float, right: Float, bottom: Float, top: Float): Mat4f = ortho(left, right, bottom, top, -1.0f, 1.0f)
