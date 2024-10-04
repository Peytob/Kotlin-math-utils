//package dev.peytob.math.vector
//
//import dev.peytob.math.vector.vec2.MutVec2
//import dev.peytob.math.vector.vec2.Vec2Accessor
//import dev.peytob.math.vector.vec2.Vec2f
//import dev.peytob.math.vector.vec2.Vec2i
//import dev.peytob.math.vector.vec3.MutVec3
//import dev.peytob.math.vector.vec3.Vec3Accessor
//import dev.peytob.math.vector.vec3.Vec3f
//import dev.peytob.math.vector.vec3.Vec3i
//import kotlin.math.sqrt
//
//// vec2
//
//@JvmName("length2Double")
//fun Vec2Accessor<Double>.length(): Float = sqrt(this.x * this.x + this.y * this.y).toFloat()
//
//@JvmName("length2Float")
//fun Vec2Accessor<Float>.length(): Float = sqrt(this.x * this.x + this.y * this.y)
//
//@JvmName("length2Int")
//fun Vec2Accessor<Int>.length(): Float = sqrt((this.x * this.x + this.y * this.y).toDouble()).toFloat()
//
//@JvmName("length2Long")
//fun Vec2Accessor<Long>.length(): Float = sqrt((this.x * this.x + this.y * this.y).toDouble()).toFloat()
//
//@JvmName("normalize2Double")
//fun MutVec2<Double>.normalize(): MutVec2<Double> {
//    val length = this.length()
//    x /= length
//    y /= length
//    return this
//}
//
//@JvmName("normalize2Float")
//fun MutVec2<Float>.normalize(): MutVec2<Float> {
//    val length = this.length()
//    x /= length
//    y /= length
//    return this
//}
//
//@JvmName("normalize2Int")
//fun MutVec2<Int>.normalize(): MutVec2<Int> {
//    val length = this.length().toInt()
//    x /= length
//    y /= length
//    return this
//}
//
//@JvmName("normalize2Long")
//fun MutVec2<Long>.normalize(): MutVec2<Long> {
//    val length = this.length().toLong()
//    x /= length
//    y /= length
//    return this
//}
//
//fun distance(p0: Vec2f, p1: Vec2f) = (p0 - p1).length()
//
//fun distance(p0: Vec2i, p1: Vec2i) = (p0 - p1).length()
//
//// vec3
//
//@JvmName("length3Double")
//fun Vec3Accessor<Double>.length(): Float = sqrt(this.x * this.x + this.y * this.y + this.z * this.z).toFloat()
//
//@JvmName("length3Float")
//fun Vec3Accessor<Float>.length(): Float = sqrt(this.x * this.x + this.y * this.y + this.z * this.z)
//
//@JvmName("length3Int")
//fun Vec3Accessor<Int>.length(): Float = sqrt((this.x * this.x + this.y * this.y + this.z * this.z).toDouble()).toFloat()
//
//@JvmName("length3Long")
//fun Vec3Accessor<Long>.length(): Float = sqrt((this.x * this.x + this.y * this.y + this.z * this.z).toDouble()).toFloat()
//
//@JvmName("normalize3Double")
//fun MutVec3<Double>.normalize(): MutVec3<Double> {
//    val length = this.length()
//    x /= length
//    y /= length
//    z /= length
//    return this
//}
//
//@JvmName("normalize3Float")
//fun MutVec3<Float>.normalize(): MutVec3<Float> {
//    val length = this.length()
//    x /= length
//    y /= length
//    z /= length
//    return this
//}
//
//@JvmName("normalize3Int")
//fun MutVec3<Int>.normalize(): MutVec3<Int> {
//    val length = this.length().toInt()
//    x /= length
//    y /= length
//    z /= length
//    return this
//}
//
//@JvmName("normalize3Long")
//fun MutVec3<Long>.normalize(): MutVec3<Long> {
//    val length = this.length().toLong()
//    x /= length
//    y /= length
//    z /= length
//    return this
//}
//
//fun distance(p0: Vec3f, p1: Vec3f) = (p0 - p1).length()
//
//fun distance(p0: Vec3i, p1: Vec3i) = (p0 - p1).length()
//
