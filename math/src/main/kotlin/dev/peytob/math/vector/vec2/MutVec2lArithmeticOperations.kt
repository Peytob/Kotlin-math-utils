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
@JvmName(name = "timesMut2li")
operator fun MutVec2<Long>.times(scalar: Int): MutVec2<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2ll")
operator fun MutVec2<Long>.times(scalar: Long): MutVec2<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2ll")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.minus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusMutVec2l")
operator fun MutVec2<Long>.unaryPlus(): MutVec2<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.minus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2ld")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2ld")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.times(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2ll")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.plus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.plus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2li")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2li")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.minus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.plus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.minus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2lf")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2lf")
operator fun MutVec2<Long>.times(scalar: Float): MutVec2<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2ld")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.plus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2lf")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusMutVec2l")
operator fun MutVec2<Long>.unaryMinus(): MutVec2<Long> {
  this.x = -this.x
  this.y = -this.y
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.times(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2lf")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2ld")
operator fun MutVec2<Long>.times(scalar: Double): MutVec2<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.times(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2ll")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2li")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Long>.times(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}
