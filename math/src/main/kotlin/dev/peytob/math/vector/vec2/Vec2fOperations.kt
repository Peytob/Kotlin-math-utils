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
  date = "2024-10-20",
)
fun Vec2<Float>.dot(rx: Double, ry: Double): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.minus(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec2ff")
fun Vec2<Float>.dot(right: Vec2Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec2fi")
operator fun Vec2<Float>.minus(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.plus(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec2fl")
operator fun Vec2<Float>.times(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.plus(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec2fd")
operator fun Vec2<Float>.minus(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec2fi")
operator fun Vec2<Float>.plus(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusVec2f")
operator fun Vec2<Float>.unaryMinus(): Vec2<Float> {
  val x = -this.x
  val y = -this.y
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusVec2f")
operator fun Vec2<Float>.unaryPlus(): Vec2<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec2ff")
operator fun Vec2<Float>.minus(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.times(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.minus(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec2fd")
operator fun Vec2<Float>.plus(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.times(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.plus(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.dot(rx: Float, ry: Float): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times2fd")
operator fun Vec2<Float>.times(scalar: Double): Vec2<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec2fl")
fun Vec2<Float>.dot(right: Vec2Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times2ff")
operator fun Vec2<Float>.times(scalar: Float): Vec2<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec2fi")
fun Vec2<Float>.dot(right: Vec2Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.dot(rx: Long, ry: Long): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times2fi")
operator fun Vec2<Float>.times(scalar: Int): Vec2<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec2fd")
fun Vec2<Float>.dot(right: Vec2Accessor<Double>): Float = this.dot(rx = right.x, ry =
    right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.minus(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times2fl")
operator fun Vec2<Float>.times(scalar: Long): Vec2<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.times(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthVec2f")
fun Vec2<Float>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec2fl")
operator fun Vec2<Float>.minus(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec2ff")
operator fun Vec2<Float>.times(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.minus(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec2ff")
operator fun Vec2<Float>.plus(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec2fi")
operator fun Vec2<Float>.times(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeVec2f")
fun Vec2<Float>.normalize(): Vec2<Float> {
  val l = this.length()
  val x = (this.x / l).toFloat()
  val y = (this.y / l).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.times(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.dot(rx: Int, ry: Int): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec2fd")
operator fun Vec2<Float>.times(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec2fl")
operator fun Vec2<Float>.plus(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec2<Float>.plus(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return StructVec2f(x = x, y = y)
}
