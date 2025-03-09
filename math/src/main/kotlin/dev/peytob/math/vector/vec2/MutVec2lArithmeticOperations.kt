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
public operator fun MutVec2<Long>.plus(right: Vec2Accessor<Double>): MutVec2<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.plus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ld")
public operator fun MutVec2<Long>.times(right: Vec2Accessor<Double>): MutVec2<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.times(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ld")
public fun MutVec2<Long>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ld")
public operator fun MutVec2<Long>.minus(right: Vec2Accessor<Double>): MutVec2<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.minus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2lf")
public operator fun MutVec2<Long>.plus(right: Vec2Accessor<Float>): MutVec2<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.plus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2lf")
public operator fun MutVec2<Long>.times(right: Vec2Accessor<Float>): MutVec2<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.times(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2lf")
public fun MutVec2<Long>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2lf")
public operator fun MutVec2<Long>.minus(right: Vec2Accessor<Float>): MutVec2<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.minus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2li")
public operator fun MutVec2<Long>.plus(right: Vec2Accessor<Int>): MutVec2<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.plus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2li")
public operator fun MutVec2<Long>.times(right: Vec2Accessor<Int>): MutVec2<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.times(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2li")
public fun MutVec2<Long>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2li")
public operator fun MutVec2<Long>.minus(right: Vec2Accessor<Int>): MutVec2<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.minus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ll")
public operator fun MutVec2<Long>.plus(right: Vec2Accessor<Long>): MutVec2<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.plus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ll")
public operator fun MutVec2<Long>.times(right: Vec2Accessor<Long>): MutVec2<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.times(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ll")
public fun MutVec2<Long>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ll")
public operator fun MutVec2<Long>.minus(right: Vec2Accessor<Long>): MutVec2<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Long>.minus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.plus(scalar: Double): MutVec2<Long> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.times(scalar: Double): MutVec2<Long> = this.times(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.minus(scalar: Double): MutVec2<Long> = this.minus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.plus(scalar: Float): MutVec2<Long> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.times(scalar: Float): MutVec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.minus(scalar: Float): MutVec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.plus(scalar: Int): MutVec2<Long> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.times(scalar: Int): MutVec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.minus(scalar: Int): MutVec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.plus(scalar: Long): MutVec2<Long> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.times(scalar: Long): MutVec2<Long> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Long>.minus(scalar: Long): MutVec2<Long> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec2l")
public operator fun MutVec2<Long>.unaryPlus(): MutVec2<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec2l")
public operator fun MutVec2<Long>.unaryMinus(): MutVec2<Long> {
  this.x = -this.x
  this.y = -this.y
  return this
}
