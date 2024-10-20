package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut2if")
operator fun MutVec2<Int>.times(scalar: Float): MutVec2<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec2id")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.plus(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec2ii")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.minus(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.plus(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.minus(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutVec2i")
operator fun MutVec2<Int>.unaryMinus(): MutVec2<Int> {
  this.x = -this.x
  this.y = -this.y
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.minus(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.times(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec2il")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec2id")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutVec2i")
fun MutVec2<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.times(rx: Long, ry: Long): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec2il")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec2if")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec2ii")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut2il")
operator fun MutVec2<Int>.times(scalar: Long): MutVec2<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.times(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut2ii")
operator fun MutVec2<Int>.times(scalar: Int): MutVec2<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.times(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.plus(rx: Double, ry: Double): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec2if")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec2il")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutVec2i")
fun MutVec2<Int>.normalize(): MutVec2<Int> {
  val l = this.length()
  this.x = (this.x / l).toInt()
  this.y = (this.y / l).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut2id")
operator fun MutVec2<Int>.times(scalar: Double): MutVec2<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.plus(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutVec2i")
operator fun MutVec2<Int>.unaryPlus(): MutVec2<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec2if")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.minus(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec2ii")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec2id")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}
