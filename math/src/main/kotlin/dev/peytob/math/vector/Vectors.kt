package dev.peytob.math.vector

import kotlin.math.sqrt

private val ZERO_VEC2F = Vec2f(0.0f, 0.0f)
private val ZERO_VEC2I = Vec2i(0, 0)

fun immutableVec2F(): Vec2f = ZERO_VEC2F

fun immutableVec2F(x: Float, y: Float): Vec2f = Vec2f(x, y)

fun immutableVec2F(from: Vec2<*>): Vec2f = if (from is Vec2f) from else Vec2f(from.x.toFloat(), from.x.toFloat())

fun immutableVec2I(): Vec2i = ZERO_VEC2I

fun immutableVec2I(x: Int, y: Int): Vec2i = Vec2i(x, y)

fun immutableVec2I(from: Vec2<*>): Vec2i = if (from is Vec2i) from else Vec2i(from.x.toInt(), from.x.toInt())

fun Vec2f.length(): Float = sqrt(this.x * this.x + this.y * this.y)

fun Vec2i.length(): Float = sqrt(this.x * this.x + this.y * this.y.toFloat())

fun Vec2<*>.length(): Float {
    val x = this.x.toFloat()
    val y = this.y.toFloat()

    return sqrt(x * x + y * y)
}

fun Vec2f.normalize(): Vec2f {
    val length = this.length()
    return immutableVec2F(x / length, y / length)
}

fun Vec2i.normalize(): Vec2i {
    val length = this.length()
    return immutableVec2I((x / length).toInt(), (y / length).toInt())
}

fun distance(p0: Vec2f, p1: Vec2f) = (p0 - p1).length()

fun distance(p0: Vec2i, p1: Vec2i) = (p0 - p1).length()
