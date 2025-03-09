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
public operator fun MutVec2<Double>.plus(right: Vec2Accessor<Double>): MutVec2<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.plus(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2dd")
public operator fun MutVec2<Double>.times(right: Vec2Accessor<Double>): MutVec2<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.times(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2dd")
public fun MutVec2<Double>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2dd")
public operator fun MutVec2<Double>.minus(right: Vec2Accessor<Double>): MutVec2<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.minus(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2df")
public operator fun MutVec2<Double>.plus(right: Vec2Accessor<Float>): MutVec2<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.plus(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2df")
public operator fun MutVec2<Double>.times(right: Vec2Accessor<Float>): MutVec2<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.times(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2df")
public fun MutVec2<Double>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2df")
public operator fun MutVec2<Double>.minus(right: Vec2Accessor<Float>): MutVec2<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.minus(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2di")
public operator fun MutVec2<Double>.plus(right: Vec2Accessor<Int>): MutVec2<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.plus(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2di")
public operator fun MutVec2<Double>.times(right: Vec2Accessor<Int>): MutVec2<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.times(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2di")
public fun MutVec2<Double>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2di")
public operator fun MutVec2<Double>.minus(right: Vec2Accessor<Int>): MutVec2<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.minus(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2dl")
public operator fun MutVec2<Double>.plus(right: Vec2Accessor<Long>): MutVec2<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.plus(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2dl")
public operator fun MutVec2<Double>.times(right: Vec2Accessor<Long>): MutVec2<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.times(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2dl")
public fun MutVec2<Double>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2dl")
public operator fun MutVec2<Double>.minus(right: Vec2Accessor<Long>): MutVec2<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Double>.minus(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.plus(scalar: Double): MutVec2<Double> = this.plus(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.times(scalar: Double): MutVec2<Double> = this.times(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.minus(scalar: Double): MutVec2<Double> = this.minus(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.plus(scalar: Float): MutVec2<Double> = this.plus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.times(scalar: Float): MutVec2<Double> = this.times(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.minus(scalar: Float): MutVec2<Double> = this.minus(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.plus(scalar: Int): MutVec2<Double> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.times(scalar: Int): MutVec2<Double> = this.times(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.minus(scalar: Int): MutVec2<Double> = this.minus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.plus(scalar: Long): MutVec2<Double> = this.plus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.times(scalar: Long): MutVec2<Double> = this.times(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Double>.minus(scalar: Long): MutVec2<Double> = this.minus(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec2d")
public operator fun MutVec2<Double>.unaryPlus(): MutVec2<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec2d")
public operator fun MutVec2<Double>.unaryMinus(): MutVec2<Double> {
  this.x = -this.x
  this.y = -this.y
  return this
}
