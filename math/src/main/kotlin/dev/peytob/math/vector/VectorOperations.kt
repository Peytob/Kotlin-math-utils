package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.MutVec2
import dev.peytob.math.vector.vec2.Vec2Accessor
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.Vec2i
import kotlin.math.sqrt

@JvmName("length2Double")
fun Vec2Accessor<Double>.length(): Float = sqrt(this.x * this.x + this.y * this.y).toFloat()

@JvmName("length2Float")
fun Vec2Accessor<Float>.length(): Float = sqrt(this.x * this.x + this.y * this.y)

@JvmName("length2Int")
fun Vec2Accessor<Int>.length(): Float = sqrt((this.x * this.x + this.y * this.y).toDouble()).toFloat()

@JvmName("length2Long")
fun Vec2Accessor<Long>.length(): Float = sqrt((this.x * this.x + this.y * this.y).toDouble()).toFloat()

@JvmName("normalize2Double")
fun MutVec2<Double>.normalize(): MutVec2<Double> {
    val length = this.length()
    x /= length
    y /= length
    return this
}

@JvmName("normalize2Float")
fun MutVec2<Float>.normalize(): MutVec2<Float> {
    val length = this.length()
    x /= length
    y /= length
    return this
}

@JvmName("normalize2Int")
fun MutVec2<Int>.normalize(): MutVec2<Int> {
    val length = this.length().toInt()
    x /= length
    y /= length
    return this
}

@JvmName("normalize2Long")
fun MutVec2<Long>.normalize(): MutVec2<Long> {
    val length = this.length().toLong()
    x /= length
    y /= length
    return this
}

fun distance(p0: Vec2f, p1: Vec2f) = (p0 - p1).length()

fun distance(p0: Vec2i, p1: Vec2i) = (p0 - p1).length()
