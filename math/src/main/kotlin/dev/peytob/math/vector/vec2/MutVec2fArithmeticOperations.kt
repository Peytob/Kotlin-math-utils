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
fun MutVec2<Float>.times(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2fi")
operator fun MutVec2<Float>.times(scalar: Int): MutVec2<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.plus(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusMutVec2f")
operator fun MutVec2<Float>.unaryMinus(): MutVec2<Float> {
  this.x = -this.x
  this.y = -this.y
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.times(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2fd")
operator fun MutVec2<Float>.times(right: Vec2Accessor<Double>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2ff")
operator fun MutVec2<Float>.plus(right: Vec2Accessor<Float>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2fi")
operator fun MutVec2<Float>.plus(right: Vec2Accessor<Int>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.plus(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2fl")
operator fun MutVec2<Float>.minus(right: Vec2Accessor<Long>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2fd")
operator fun MutVec2<Float>.plus(right: Vec2Accessor<Double>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2fl")
operator fun MutVec2<Float>.times(scalar: Long): MutVec2<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2fd")
operator fun MutVec2<Float>.times(scalar: Double): MutVec2<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.minus(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2fi")
operator fun MutVec2<Float>.minus(right: Vec2Accessor<Int>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.times(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2ff")
operator fun MutVec2<Float>.minus(right: Vec2Accessor<Float>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.minus(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut2ff")
operator fun MutVec2<Float>.times(scalar: Float): MutVec2<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2fl")
operator fun MutVec2<Float>.times(right: Vec2Accessor<Long>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2ff")
operator fun MutVec2<Float>.times(right: Vec2Accessor<Float>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec2fl")
operator fun MutVec2<Float>.plus(right: Vec2Accessor<Long>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec2fi")
operator fun MutVec2<Float>.times(right: Vec2Accessor<Int>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.minus(rx: Float, ry: Float): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.plus(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec2fd")
operator fun MutVec2<Float>.minus(right: Vec2Accessor<Double>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.times(rx: Long, ry: Long): MutVec2<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusMutVec2f")
operator fun MutVec2<Float>.unaryPlus(): MutVec2<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.plus(rx: Double, ry: Double): MutVec2<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun MutVec2<Float>.minus(rx: Int, ry: Int): MutVec2<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  return this
}
