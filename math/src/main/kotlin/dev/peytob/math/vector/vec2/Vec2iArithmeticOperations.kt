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
@JvmName(name = "plusVecVec2id")
public operator fun Vec2<Int>.plus(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.plus(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2id")
public operator fun Vec2<Int>.times(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.times(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2id")
public fun Vec2<Int>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2id")
public operator fun Vec2<Int>.minus(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.minus(rx: Double, ry: Double): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2if")
public operator fun Vec2<Int>.plus(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.plus(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2if")
public operator fun Vec2<Int>.times(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.times(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2if")
public fun Vec2<Int>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2if")
public operator fun Vec2<Int>.minus(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.minus(rx: Float, ry: Float): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ii")
public operator fun Vec2<Int>.plus(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.plus(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ii")
public operator fun Vec2<Int>.times(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.times(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ii")
public fun Vec2<Int>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ii")
public operator fun Vec2<Int>.minus(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.minus(rx: Int, ry: Int): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2il")
public operator fun Vec2<Int>.plus(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.plus(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2il")
public operator fun Vec2<Int>.times(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.times(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2il")
public fun Vec2<Int>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2il")
public operator fun Vec2<Int>.minus(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec2<Int>.minus(rx: Long, ry: Long): Vec2<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  return immutableVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.plus(scalar: Double): Vec2<Int> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.times(scalar: Double): Vec2<Int> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.minus(scalar: Double): Vec2<Int> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.plus(scalar: Float): Vec2<Int> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.times(scalar: Float): Vec2<Int> = this.times(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.minus(scalar: Float): Vec2<Int> = this.minus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.plus(scalar: Int): Vec2<Int> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.times(scalar: Int): Vec2<Int> = this.times(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.minus(scalar: Int): Vec2<Int> = this.minus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.plus(scalar: Long): Vec2<Int> = this.plus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.times(scalar: Long): Vec2<Int> = this.times(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec2<Int>.minus(scalar: Long): Vec2<Int> = this.minus(rx = scalar, ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec2i")
public operator fun Vec2<Int>.unaryPlus(): Vec2<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec2i")
public operator fun Vec2<Int>.unaryMinus(): Vec2<Int> {
  val x = -this.x
  val y = -this.y
  return immutableVec2i(x = x, y = y)
}
