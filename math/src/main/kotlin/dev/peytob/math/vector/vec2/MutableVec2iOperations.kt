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
@JvmName(name = "minusVecMutableVec2id")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
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
@JvmName(name = "minusVecMutableVec2il")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
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
@JvmName(name = "timesVecMutableVec2il")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
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
@JvmName(name = "lengthMutableVec2i")
fun MutVec2<Int>.length(): Double {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2il")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
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
@JvmName(name = "unaryMinusMutableVec2i")
operator fun MutVec2<Int>.unaryMinus(): MutVec2<Int> {
  this.x = -this.x
  this.y = -this.y
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
@JvmName(name = "timesVecMutableVec2ii")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2id")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec2if")
operator fun MutVec2<Int>.times(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.times(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2if")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
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
@JvmName(name = "minusVecMutableVec2if")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
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
@JvmName(name = "minusVecMutableVec2ii")
operator fun MutVec2<Int>.minus(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.minus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2ii")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec2id")
operator fun MutVec2<Int>.plus(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return this.plus(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutableVec2i")
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
fun MutVec2<Int>.plus(rx: Int, ry: Int): MutVec2<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutableVec2i")
operator fun MutVec2<Int>.unaryPlus(): MutVec2<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec2<Int>.minus(rx: Float, ry: Float): MutVec2<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  return this
}
