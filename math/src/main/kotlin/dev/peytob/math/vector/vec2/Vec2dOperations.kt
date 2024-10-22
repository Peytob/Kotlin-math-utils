package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.minus(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2dl")
operator fun Vec2<Double>.times(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2di")
operator fun Vec2<Double>.times(scalar: Int): Vec2<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2dd")
operator fun Vec2<Double>.minus(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.dot(rx: Double, ry: Double): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.minus(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2di")
operator fun Vec2<Double>.times(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.plus(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "normalizeVec2d")
fun Vec2<Double>.normalize(): Vec2<Double> {
  val l = this.length()
  val x = (this.x / l).toDouble()
  val y = (this.y / l).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.plus(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.times(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2dl")
fun Vec2<Double>.dot(right: Vec2Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2dd")
operator fun Vec2<Double>.plus(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2dd")
fun Vec2<Double>.dot(right: Vec2Accessor<Double>): Float = this.dot(rx = right.x, ry =
    right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "lengthVec2d")
fun Vec2<Double>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.dot(rx: Int, ry: Int): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.plus(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.times(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2df")
operator fun Vec2<Double>.times(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2di")
operator fun Vec2<Double>.minus(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.dot(rx: Float, ry: Float): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2di")
fun Vec2<Double>.dot(right: Vec2Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.minus(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2df")
operator fun Vec2<Double>.minus(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.times(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.times(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2dd")
operator fun Vec2<Double>.times(scalar: Double): Vec2<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.dot(rx: Long, ry: Long): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2df")
fun Vec2<Double>.dot(right: Vec2Accessor<Float>): Float = this.dot(rx = right.x, ry =
    right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2dl")
operator fun Vec2<Double>.minus(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryMinusVec2d")
operator fun Vec2<Double>.unaryMinus(): Vec2<Double> {
  val x = -this.x
  val y = -this.y
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2dl")
operator fun Vec2<Double>.times(scalar: Long): Vec2<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.plus(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2df")
operator fun Vec2<Double>.plus(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2di")
operator fun Vec2<Double>.plus(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryPlusVec2d")
operator fun Vec2<Double>.unaryPlus(): Vec2<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2df")
operator fun Vec2<Double>.times(scalar: Float): Vec2<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2dl")
operator fun Vec2<Double>.plus(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Double>.minus(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2dd")
operator fun Vec2<Double>.times(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}
