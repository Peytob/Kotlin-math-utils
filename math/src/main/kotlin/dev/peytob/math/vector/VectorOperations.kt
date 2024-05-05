package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.*
import dev.peytob.math.vector.vec3.*
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

// vec2

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

fun abs(p: Vec2d): Vec2d = immutableVec2d(p.x, p.y)

fun abs(p: Vec2f): Vec2f = immutableVec2f(p.x, p.y)

fun abs(p: Vec2i): Vec2i = immutableVec2i(p.x, p.y)

fun abs(p: Vec2l): Vec2l = immutableVec2l(p.x, p.y)

fun max(p: Vec2d, right: Double): Vec2d = immutableVec2d(max(p.x, right), max(p.y, right))

fun max(p: Vec2f, right: Float): Vec2f = immutableVec2f(max(p.x, right), max(p.y, right))

fun max(p: Vec2i, right: Int): Vec2i = immutableVec2i(max(p.x, right), max(p.y, right))

fun max(p: Vec2l, right: Long): Vec2l = immutableVec2l(max(p.x, right), max(p.y, right))

fun min(p: Vec2d, right: Double): Vec2d = immutableVec2d(min(p.x, right), min(p.y, right))

fun min(p: Vec2f, right: Float): Vec2f = immutableVec2f(min(p.x, right), min(p.y, right))

fun min(p: Vec2i, right: Int): Vec2i = immutableVec2i(min(p.x, right), min(p.y, right))

fun min(p: Vec2l, right: Long): Vec2l = immutableVec2l(min(p.x, right), min(p.y, right))

fun normalize(p: Vec2d): Vec2d {
    val l = p.length()
    return immutableVec2d(p.x / l, p.y / l)
}

fun normalize(p: Vec2f): Vec2f {
    val l = p.length()
    return immutableVec2f(p.x / l, p.y / l)
}

fun normalize(p: Vec2i): Vec2f {
    val l = p.length()
    return immutableVec2f(p.x / l, p.y / l)
}

fun normalize(p: Vec2l): Vec2f {
    val l = p.length()
    return immutableVec2f(p.x / l, p.y / l)
}

// vec3

@JvmName("length3Double")
fun Vec3Accessor<Double>.length(): Float = sqrt(this.x * this.x + this.y * this.y + this.z * this.z).toFloat()

@JvmName("length3Float")
fun Vec3Accessor<Float>.length(): Float = sqrt(this.x * this.x + this.y * this.y + this.z * this.z)

@JvmName("length3Int")
fun Vec3Accessor<Int>.length(): Float = sqrt((this.x * this.x + this.y * this.y + this.z * this.z).toDouble()).toFloat()

@JvmName("length3Long")
fun Vec3Accessor<Long>.length(): Float = sqrt((this.x * this.x + this.y * this.y + this.z * this.z).toDouble()).toFloat()

@JvmName("normalize3Double")
fun MutVec3<Double>.normalize(): MutVec3<Double> {
    val length = this.length()
    x /= length
    y /= length
    z /= length
    return this
}

@JvmName("normalize3Float")
fun MutVec3<Float>.normalize(): MutVec3<Float> {
    val length = this.length()
    x /= length
    y /= length
    z /= length
    return this
}

@JvmName("normalize3Int")
fun MutVec3<Int>.normalize(): MutVec3<Int> {
    val length = this.length().toInt()
    x /= length
    y /= length
    z /= length
    return this
}

@JvmName("normalize3Long")
fun MutVec3<Long>.normalize(): MutVec3<Long> {
    val length = this.length().toLong()
    x /= length
    y /= length
    z /= length
    return this
}

fun distance(p0: Vec3f, p1: Vec3f) = (p0 - p1).length()

fun distance(p0: Vec3i, p1: Vec3i) = (p0 - p1).length()

fun abs(p: Vec3d): Vec3d = immutableVec3d(p.x, p.y, p.z)

fun abs(p: Vec3f): Vec3f = immutableVec3f(p.x, p.y, p.z)

fun abs(p: Vec3i): Vec3i = immutableVec3i(p.x, p.y, p.z)

fun abs(p: Vec3l): Vec3l = immutableVec3l(p.x, p.y, p.z)

fun max(p: Vec3d, right: Double): Vec3d = immutableVec3d(max(p.x, right), max(p.y, right), max(p.z, right))

fun max(p: Vec3f, right: Float): Vec3f = immutableVec3f(max(p.x, right), max(p.y, right), max(p.z, right))

fun max(p: Vec3i, right: Int): Vec3i = immutableVec3i(max(p.x, right), max(p.y, right), max(p.z, right))

fun max(p: Vec3l, right: Long): Vec3l = immutableVec3l(max(p.x, right), max(p.y, right), max(p.z, right))

fun min(p: Vec3d, right: Double): Vec3d = immutableVec3d(min(p.x, right), min(p.y, right), min(p.z, right))

fun min(p: Vec3f, right: Float): Vec3f = immutableVec3f(min(p.x, right), min(p.y, right), min(p.z, right))

fun min(p: Vec3i, right: Int): Vec3i = immutableVec3i(min(p.x, right), min(p.y, right), min(p.z, right))

fun min(p: Vec3l, right: Long): Vec3l = immutableVec3l(min(p.x, right), min(p.y, right), min(p.z, right))

fun normalize(p: Vec3d): Vec3d {
    val l = p.length()
    return immutableVec3d(p.x / l, p.y / l, p.z / l)
}

fun normalize(p: Vec3f): Vec3f {
    val l = p.length()
    return immutableVec3f(p.x / l, p.y / l, p.z / l)
}

fun normalize(p: Vec3i): Vec3f {
    val l = p.length()
    return immutableVec3f(p.x / l, p.y / l, p.z / l)
}

fun normalize(p: Vec3l): Vec3f {
    val l = p.length()
    return immutableVec3f(p.x / l, p.y / l, p.z / l)
}
