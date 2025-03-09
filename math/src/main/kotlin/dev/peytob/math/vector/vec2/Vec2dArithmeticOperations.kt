package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2dd")
public operator fun Vec2<Double>.plus(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.plus(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2dd")
public operator fun Vec2<Double>.times(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.times(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2dd")
public fun Vec2<Double>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2dd")
public operator fun Vec2<Double>.minus(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.minus(rx: Double, ry: Double): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2df")
public operator fun Vec2<Double>.plus(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.plus(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2df")
public operator fun Vec2<Double>.times(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.times(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2df")
public fun Vec2<Double>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2df")
public operator fun Vec2<Double>.minus(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.minus(rx: Float, ry: Float): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2di")
public operator fun Vec2<Double>.plus(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.plus(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2di")
public operator fun Vec2<Double>.times(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.times(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2di")
public fun Vec2<Double>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2di")
public operator fun Vec2<Double>.minus(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.minus(rx: Int, ry: Int): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2dl")
public operator fun Vec2<Double>.plus(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.plus(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2dl")
public operator fun Vec2<Double>.times(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.times(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2dl")
public fun Vec2<Double>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2dl")
public operator fun Vec2<Double>.minus(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Double>.minus(rx: Long, ry: Long): Vec2<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  return immutableVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.plus(scalar: Double): Vec2<Double> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.times(scalar: Double): Vec2<Double> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.minus(scalar: Double): Vec2<Double> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.plus(scalar: Float): Vec2<Double> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.times(scalar: Float): Vec2<Double> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.minus(scalar: Float): Vec2<Double> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.plus(scalar: Int): Vec2<Double> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.times(scalar: Int): Vec2<Double> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.minus(scalar: Int): Vec2<Double> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.plus(scalar: Long): Vec2<Double> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.times(scalar: Long): Vec2<Double> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Double>.minus(scalar: Long): Vec2<Double> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec2d")
public operator fun Vec2<Double>.unaryPlus(): Vec2<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec2d")
public operator fun Vec2<Double>.unaryMinus(): Vec2<Double> {
  val x = -this.x
  val y = -this.y
  return immutableVec2d(x = x, y = y)
}
