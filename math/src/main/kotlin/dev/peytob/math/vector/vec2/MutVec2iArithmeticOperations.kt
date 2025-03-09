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
public operator fun MutVec2<Int>.plus(right: Vec2Accessor<Double>): MutVec2<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.plus(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2id")
public operator fun MutVec2<Int>.times(right: Vec2Accessor<Double>): MutVec2<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.times(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2id")
public fun MutVec2<Int>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2id")
public operator fun MutVec2<Int>.minus(right: Vec2Accessor<Double>): MutVec2<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.minus(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2if")
public operator fun MutVec2<Int>.plus(right: Vec2Accessor<Float>): MutVec2<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.plus(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2if")
public operator fun MutVec2<Int>.times(right: Vec2Accessor<Float>): MutVec2<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.times(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2if")
public fun MutVec2<Int>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2if")
public operator fun MutVec2<Int>.minus(right: Vec2Accessor<Float>): MutVec2<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.minus(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ii")
public operator fun MutVec2<Int>.plus(right: Vec2Accessor<Int>): MutVec2<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.plus(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ii")
public operator fun MutVec2<Int>.times(right: Vec2Accessor<Int>): MutVec2<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.times(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ii")
public fun MutVec2<Int>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ii")
public operator fun MutVec2<Int>.minus(right: Vec2Accessor<Int>): MutVec2<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.minus(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2il")
public operator fun MutVec2<Int>.plus(right: Vec2Accessor<Long>): MutVec2<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.plus(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2il")
public operator fun MutVec2<Int>.times(right: Vec2Accessor<Long>): MutVec2<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.times(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2il")
public fun MutVec2<Int>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2il")
public operator fun MutVec2<Int>.minus(right: Vec2Accessor<Long>): MutVec2<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Int>.minus(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.plus(scalar: Double): MutVec2<Int> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.times(scalar: Double): MutVec2<Int> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.minus(scalar: Double): MutVec2<Int> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.plus(scalar: Float): MutVec2<Int> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.times(scalar: Float): MutVec2<Int> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.minus(scalar: Float): MutVec2<Int> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.plus(scalar: Int): MutVec2<Int> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.times(scalar: Int): MutVec2<Int> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.minus(scalar: Int): MutVec2<Int> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.plus(scalar: Long): MutVec2<Int> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.times(scalar: Long): MutVec2<Int> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Int>.minus(scalar: Long): MutVec2<Int> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec2i")
public operator fun MutVec2<Int>.unaryPlus(): MutVec2<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec2i")
public operator fun MutVec2<Int>.unaryMinus(): MutVec2<Int> {
  this.x = -this.x
  this.y = -this.y
  return this
}
