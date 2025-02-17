package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.times(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times2ll")
operator fun Vec2<Long>.times(scalar: Long): Vec2<Long> {
  val x = (this.x * scalar).toLong()
  val y = (this.y * scalar).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.dot(rx: Int, ry: Int): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec2lf")
operator fun Vec2<Long>.plus(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec2ll")
operator fun Vec2<Long>.times(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec2ll")
fun Vec2<Long>.dot(right: Vec2Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusVec2l")
operator fun Vec2<Long>.unaryPlus(): Vec2<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times2ld")
operator fun Vec2<Long>.times(scalar: Double): Vec2<Long> {
  val x = (this.x * scalar).toLong()
  val y = (this.y * scalar).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.plus(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec2li")
operator fun Vec2<Long>.times(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec2ld")
operator fun Vec2<Long>.times(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.minus(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.dot(rx: Float, ry: Float): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec2ll")
operator fun Vec2<Long>.plus(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec2lf")
operator fun Vec2<Long>.minus(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec2ll")
operator fun Vec2<Long>.minus(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.minus(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec2li")
fun Vec2<Long>.dot(right: Vec2Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusVec2l")
operator fun Vec2<Long>.unaryMinus(): Vec2<Long> {
  val x = -this.x
  val y = -this.y
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec2lf")
fun Vec2<Long>.dot(right: Vec2Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.times(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec2ld")
operator fun Vec2<Long>.minus(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec2ld")
operator fun Vec2<Long>.plus(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.plus(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec2li")
operator fun Vec2<Long>.plus(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec2lf")
operator fun Vec2<Long>.times(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.minus(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.plus(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.plus(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times2lf")
operator fun Vec2<Long>.times(scalar: Float): Vec2<Long> {
  val x = (this.x * scalar).toLong()
  val y = (this.y * scalar).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.minus(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times2li")
operator fun Vec2<Long>.times(scalar: Int): Vec2<Long> {
  val x = (this.x * scalar).toLong()
  val y = (this.y * scalar).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.dot(rx: Double, ry: Double): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec2ld")
fun Vec2<Long>.dot(right: Vec2Accessor<Double>): Float = this.dot(rx = right.x, ry = right.y)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec2li")
operator fun Vec2<Long>.minus(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.dot(rx: Long, ry: Long): Float {
  val sum = x * rx + y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.times(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec2<Long>.times(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return StructVec2l(x = x, y = y)
}
