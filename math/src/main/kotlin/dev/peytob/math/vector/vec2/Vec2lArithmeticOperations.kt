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
@JvmName(name = "plusVecVec2ld")
public operator fun Vec2<Long>.plus(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.plus(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ld")
public operator fun Vec2<Long>.times(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.times(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ld")
public fun Vec2<Long>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ld")
public operator fun Vec2<Long>.minus(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.minus(rx: Double, ry: Double): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2lf")
public operator fun Vec2<Long>.plus(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.plus(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2lf")
public operator fun Vec2<Long>.times(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.times(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2lf")
public fun Vec2<Long>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2lf")
public operator fun Vec2<Long>.minus(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.minus(rx: Float, ry: Float): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2li")
public operator fun Vec2<Long>.plus(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.plus(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2li")
public operator fun Vec2<Long>.times(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.times(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2li")
public fun Vec2<Long>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2li")
public operator fun Vec2<Long>.minus(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.minus(rx: Int, ry: Int): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ll")
public operator fun Vec2<Long>.plus(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.plus(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ll")
public operator fun Vec2<Long>.times(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.times(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ll")
public fun Vec2<Long>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ll")
public operator fun Vec2<Long>.minus(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Long>.minus(rx: Long, ry: Long): Vec2<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  return immutableVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.plus(scalar: Double): Vec2<Long> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.times(scalar: Double): Vec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.minus(scalar: Double): Vec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.plus(scalar: Float): Vec2<Long> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.times(scalar: Float): Vec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.minus(scalar: Float): Vec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.plus(scalar: Int): Vec2<Long> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.times(scalar: Int): Vec2<Long> = this.times(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.minus(scalar: Int): Vec2<Long> = this.minus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.plus(scalar: Long): Vec2<Long> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.times(scalar: Long): Vec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Long>.minus(scalar: Long): Vec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec2l")
public operator fun Vec2<Long>.unaryPlus(): Vec2<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec2l")
public operator fun Vec2<Long>.unaryMinus(): Vec2<Long> {
  val x = -this.x
  val y = -this.y
  return immutableVec2l(x = x, y = y)
}
