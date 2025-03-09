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
@JvmName(name = "plusVecVec2fd")
public operator fun Vec2<Float>.plus(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.plus(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fd")
public operator fun Vec2<Float>.times(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.times(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fd")
public fun Vec2<Float>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fd")
public operator fun Vec2<Float>.minus(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.minus(rx: Double, ry: Double): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ff")
public operator fun Vec2<Float>.plus(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.plus(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ff")
public operator fun Vec2<Float>.times(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.times(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ff")
public fun Vec2<Float>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ff")
public operator fun Vec2<Float>.minus(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.minus(rx: Float, ry: Float): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2fi")
public operator fun Vec2<Float>.plus(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.plus(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fi")
public operator fun Vec2<Float>.times(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.times(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fi")
public fun Vec2<Float>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fi")
public operator fun Vec2<Float>.minus(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.minus(rx: Int, ry: Int): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2fl")
public operator fun Vec2<Float>.plus(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.plus(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fl")
public operator fun Vec2<Float>.times(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.times(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fl")
public fun Vec2<Float>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fl")
public operator fun Vec2<Float>.minus(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Float>.minus(rx: Long, ry: Long): Vec2<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  return immutableVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.plus(scalar: Double): Vec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.times(scalar: Double): Vec2<Float> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.minus(scalar: Double): Vec2<Float> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.plus(scalar: Float): Vec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.times(scalar: Float): Vec2<Float> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.minus(scalar: Float): Vec2<Float> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.plus(scalar: Int): Vec2<Float> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.times(scalar: Int): Vec2<Float> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.minus(scalar: Int): Vec2<Float> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.plus(scalar: Long): Vec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.times(scalar: Long): Vec2<Float> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Float>.minus(scalar: Long): Vec2<Float> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec2f")
public operator fun Vec2<Float>.unaryPlus(): Vec2<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec2f")
public operator fun Vec2<Float>.unaryMinus(): Vec2<Float> {
  val x = -this.x
  val y = -this.y
  return immutableVec2f(x = x, y = y)
}
