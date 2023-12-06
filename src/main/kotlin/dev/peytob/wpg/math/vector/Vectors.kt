package dev.peytob.wpg.math.vector

import kotlin.math.sqrt

private val ZERO_VEC2F = Vec2F(0.0f, 0.0f)
private val ZERO_VEC2I = Vec2I(0, 0)

fun immutableVec2F(): Vec2F = ZERO_VEC2F

fun immutableVec2F(x: Float, y: Float): Vec2F = Vec2F(x, y)

fun immutableVec2F(from: Vec2<*>): Vec2F = if (from is Vec2F) from else Vec2F(from.x.toFloat(), from.x.toFloat())

fun immutableVec2I(): Vec2I = ZERO_VEC2I

fun immutableVec2I(x: Int, y: Int): Vec2I = Vec2I(x, y)

fun immutableVec2I(from: Vec2<*>): Vec2I = if (from is Vec2I) from else Vec2I(from.x.toInt(), from.x.toInt())

fun Vec2F.length(): Float = sqrt(this.x * this.x + this.y * this.y)

fun Vec2I.length(): Float = sqrt(this.x * this.x + this.y * this.y.toFloat())

fun Vec2<*>.length(): Float {
    val x = this.x.toFloat()
    val y = this.y.toFloat()

    return sqrt(x * x + y * y)
}

fun Vec2F.normalize(): Vec2F {
    val length = this.length()
    return immutableVec2F(x / length, y / length)
}

fun Vec2I.normalize(): Vec2I {
    val length = this.length()
    return immutableVec2I((x / length).toInt(), (y / length).toInt())
}
