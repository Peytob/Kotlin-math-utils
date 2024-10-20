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
@JvmName(name = "timesVecMutableVec2ld")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.times(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.minus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.plus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2li")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2ll")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2lf")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2ld")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2lf")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutableVec2l")
operator fun MutVec2<Long>.unaryPlus(): MutVec2<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.times(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.times(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2ll")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutableVec2l")
fun MutVec2<Long>.normalize(): MutVec2<Long> {
  val l = this.length()
  this.x = (this.x / l).toLong()
  this.y = (this.y / l).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2ld")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.minus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutableVec2l")
fun MutVec2<Long>.length(): Double {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.plus(rx: Double, ry: Double): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.minus(rx: Long, ry: Long): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2lf")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.plus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.times(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutableVec2l")
operator fun MutVec2<Long>.unaryMinus(): MutVec2<Long> {
  this.x = -this.x
  this.y = -this.y
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.plus(rx: Int, ry: Int): MutVec2<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2li")
operator fun MutVec2<Long>.plus(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Long>.minus(rx: Float, ry: Float): MutVec2<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2ll")
operator fun MutVec2<Long>.minus(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2li")
operator fun MutVec2<Long>.times(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}
