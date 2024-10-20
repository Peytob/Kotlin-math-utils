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
fun MutVec2<Double>.minus(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.minus(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2di")
operator fun MutVec2<Double>.times(right: Vec2Accessor<Int>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.times(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutableVec2d")
operator fun MutVec2<Double>.unaryPlus(): MutVec2<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2dl")
operator fun MutVec2<Double>.minus(right: Vec2Accessor<Long>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2dd")
operator fun MutVec2<Double>.times(right: Vec2Accessor<Double>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2dl")
operator fun MutVec2<Double>.times(right: Vec2Accessor<Long>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2df")
operator fun MutVec2<Double>.minus(right: Vec2Accessor<Float>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2df")
operator fun MutVec2<Double>.plus(right: Vec2Accessor<Float>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutableVec2d")
fun MutVec2<Double>.length(): Double {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.times(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.plus(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.plus(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2di")
operator fun MutVec2<Double>.minus(right: Vec2Accessor<Int>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.plus(rx: Int, ry: Int): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.times(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.minus(rx: Double, ry: Double): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.plus(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2df")
operator fun MutVec2<Double>.times(right: Vec2Accessor<Float>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutableVec2d")
operator fun MutVec2<Double>.unaryMinus(): MutVec2<Double> {
  this.x = -this.x
  this.y = -this.y
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.times(rx: Long, ry: Long): MutVec2<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2dd")
operator fun MutVec2<Double>.plus(right: Vec2Accessor<Double>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2di")
operator fun MutVec2<Double>.plus(right: Vec2Accessor<Int>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2dl")
operator fun MutVec2<Double>.plus(right: Vec2Accessor<Long>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutableVec2d")
fun MutVec2<Double>.normalize(): MutVec2<Double> {
  val l = this.length()
  this.x = (this.x / l).toDouble()
  this.y = (this.y / l).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec2dd")
operator fun MutVec2<Double>.minus(right: Vec2Accessor<Double>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Double>.minus(rx: Float, ry: Float): MutVec2<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  return this
}
