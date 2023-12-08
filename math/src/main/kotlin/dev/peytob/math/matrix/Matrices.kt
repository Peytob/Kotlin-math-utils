package dev.peytob.math.matrix

fun immutableMat4F(): Mat4F = Mat4F()

fun immutableMat4F(
    a11: Float, a12: Float, a13: Float, a14: Float,
    a21: Float, a22: Float, a23: Float, a24: Float,
    a31: Float, a32: Float, a33: Float, a34: Float,
    a41: Float, a42: Float, a43: Float, a44: Float
): Mat4F = Mat4F(
    a11, a12, a13, a14,
    a21, a22, a23, a24,
    a31, a32, a33, a34,
    a41, a42, a43, a44
)

/**
 * Creates orthographic matrix. See [glOrtho method](https://registry.khronos.org/OpenGL-Refpages/gl2.1/xhtml/glOrtho.xml) for details.
 */
fun ortho(left: Float, right: Float, bottom: Float, top: Float, nearVal: Float, farVal: Float): Mat4F {
    val tx = -((right + left) / (right - left))
    val ty = -((top + bottom) / (top - bottom))
    val tz = -((farVal + nearVal) / (farVal - nearVal))
    return immutableMat4F(
        2 / (right - left), 0f, 0f, 0f,
        0f, 2 / (top - bottom), 0f, 0f,
        0f, 0f, -2 / (farVal - nearVal), 0f,
        tx, ty, tz, 1f
    )
}

/**
 * Creates 2D orthographic matrix. See [glOrtho2D method](https://registry.khronos.org/OpenGL-Refpages/gl2.1/xhtml/gluOrtho2D.xml) for details.
 */
fun ortho2D(left: Float, right: Float, bottom: Float, top: Float): Mat4F = ortho(left, right, bottom, top, -1.0f, 1.0f)
