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
fun Vec2<Int>.dot(rx: Long, ry: Long): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryMinusVec2i")
operator fun Vec2<Int>.unaryMinus(): Vec2<Int> {
  val x = -this.x
  val y = -this.y
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.times(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.times(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2il")
operator fun Vec2<Int>.times(scalar: Long): Vec2<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2if")
operator fun Vec2<Int>.minus(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2id")
operator fun Vec2<Int>.plus(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2il")
operator fun Vec2<Int>.plus(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.minus(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2ii")
operator fun Vec2<Int>.plus(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "normalizeVec2i")
fun Vec2<Int>.normalize(): Vec2<Int> {
  val l = this.length()
  val x = (this.x / l).toInt()
  val y = (this.y / l).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.minus(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2ii")
operator fun Vec2<Int>.minus(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2ii")
operator fun Vec2<Int>.times(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2ii")
fun Vec2<Int>.dot(right: Vec2Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "lengthVec2i")
fun Vec2<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2if")
operator fun Vec2<Int>.times(scalar: Float): Vec2<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2il")
fun Vec2<Int>.dot(right: Vec2Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2ii")
operator fun Vec2<Int>.times(scalar: Int): Vec2<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2if")
operator fun Vec2<Int>.times(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.times(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2il")
operator fun Vec2<Int>.times(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.plus(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryPlusVec2i")
operator fun Vec2<Int>.unaryPlus(): Vec2<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecVec2if")
operator fun Vec2<Int>.plus(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.dot(rx: Double, ry: Double): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2id")
fun Vec2<Int>.dot(right: Vec2Accessor<Double>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecVec2id")
operator fun Vec2<Int>.times(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.plus(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.dot(rx: Float, ry: Float): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.plus(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "dotVec2if")
fun Vec2<Int>.dot(right: Vec2Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.plus(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2il")
operator fun Vec2<Int>.minus(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecVec2id")
operator fun Vec2<Int>.minus(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "times2id")
operator fun Vec2<Int>.times(scalar: Double): Vec2<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.minus(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.dot(rx: Int, ry: Int): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.minus(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun Vec2<Int>.times(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return StructVec2i(x = x, y = y)
}
