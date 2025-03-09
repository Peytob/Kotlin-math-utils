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
public operator fun MutVec2<Float>.plus(right: Vec2Accessor<Double>): MutVec2<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.plus(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fd")
public operator fun MutVec2<Float>.times(right: Vec2Accessor<Double>): MutVec2<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.times(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fd")
public fun MutVec2<Float>.dot(right: Vec2Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.dot(rx: Double, ry: Double): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fd")
public operator fun MutVec2<Float>.minus(right: Vec2Accessor<Double>): MutVec2<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.minus(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2ff")
public operator fun MutVec2<Float>.plus(right: Vec2Accessor<Float>): MutVec2<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.plus(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2ff")
public operator fun MutVec2<Float>.times(right: Vec2Accessor<Float>): MutVec2<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.times(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2ff")
public fun MutVec2<Float>.dot(right: Vec2Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.dot(rx: Float, ry: Float): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2ff")
public operator fun MutVec2<Float>.minus(right: Vec2Accessor<Float>): MutVec2<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.minus(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2fi")
public operator fun MutVec2<Float>.plus(right: Vec2Accessor<Int>): MutVec2<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.plus(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fi")
public operator fun MutVec2<Float>.times(right: Vec2Accessor<Int>): MutVec2<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.times(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fi")
public fun MutVec2<Float>.dot(right: Vec2Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.dot(rx: Int, ry: Int): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fi")
public operator fun MutVec2<Float>.minus(right: Vec2Accessor<Int>): MutVec2<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.minus(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec2fl")
public operator fun MutVec2<Float>.plus(right: Vec2Accessor<Long>): MutVec2<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.plus(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec2fl")
public operator fun MutVec2<Float>.times(right: Vec2Accessor<Long>): MutVec2<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.times(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec2fl")
public fun MutVec2<Float>.dot(right: Vec2Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.dot(rx: Long, ry: Long): Float {
  val sum = this.x * rx + this.y * ry
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec2fl")
public operator fun MutVec2<Float>.minus(right: Vec2Accessor<Long>): MutVec2<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec2<Float>.minus(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.plus(scalar: Double): MutVec2<Float> = this.plus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.times(scalar: Double): MutVec2<Float> = this.times(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.minus(scalar: Double): MutVec2<Float> = this.minus(rx = scalar,
    ry = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.plus(scalar: Float): MutVec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.times(scalar: Float): MutVec2<Float> = this.times(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.minus(scalar: Float): MutVec2<Float> = this.minus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.plus(scalar: Int): MutVec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.times(scalar: Int): MutVec2<Float> = this.times(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.minus(scalar: Int): MutVec2<Float> = this.minus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.plus(scalar: Long): MutVec2<Float> = this.plus(rx = scalar, ry =
    scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.times(scalar: Long): MutVec2<Float> = this.times(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec2<Float>.minus(scalar: Long): MutVec2<Float> = this.minus(rx = scalar, ry
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec2f")
public operator fun MutVec2<Float>.unaryPlus(): MutVec2<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec2f")
public operator fun MutVec2<Float>.unaryMinus(): MutVec2<Float> {
  this.x = -this.x
  this.y = -this.y
  return this
}
