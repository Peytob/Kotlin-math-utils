package dev.peytob.math.matrix

import dev.peytob.math.matrix.mat4.MutMat4f

/**
 * Creates orthographic matrix. See [glOrtho method](https://registry.khronos.org/OpenGL-Refpages/gl2.1/xhtml/glOrtho.xml) for details.
 */
fun ortho(left: Float, right: Float, bottom: Float, top: Float, nearVal: Float, farVal: Float): MutMat4f {
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
fun ortho2D(left: Float, right: Float, bottom: Float, top: Float): MutMat4f = ortho(left, right, bottom, top, -1.0f, 1.0f)
