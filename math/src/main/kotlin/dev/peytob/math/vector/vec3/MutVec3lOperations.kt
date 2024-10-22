package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  this.z = (this.z + rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  this.z = (this.z - rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecMutVec3lf")
operator fun MutVec3<Long>.plus(right: Vec3Accessor<Float>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  this.z = (this.z * rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecMutVec3ll")
operator fun MutVec3<Long>.minus(right: Vec3Accessor<Long>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "normalizeMutVec3l")
fun MutVec3<Long>.normalize(): MutVec3<Long> {
  val l = this.length()
  this.x = (this.x / l).toLong()
  this.y = (this.y / l).toLong()
  this.z = (this.z / l).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecMutVec3li")
operator fun MutVec3<Long>.plus(right: Vec3Accessor<Int>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  this.z = (this.z * rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  this.z = (this.z - rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesMut3ld")
operator fun MutVec3<Long>.times(scalar: Double): MutVec3<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  this.z = (this.z * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecMutVec3ld")
operator fun MutVec3<Long>.times(right: Vec3Accessor<Double>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  this.z = (this.z + rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecMutVec3ld")
operator fun MutVec3<Long>.minus(right: Vec3Accessor<Double>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesMut3li")
operator fun MutVec3<Long>.times(scalar: Int): MutVec3<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  this.z = (this.z * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  this.z = (this.z - rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecMutVec3ll")
operator fun MutVec3<Long>.times(right: Vec3Accessor<Long>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesMut3lf")
operator fun MutVec3<Long>.times(scalar: Float): MutVec3<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  this.z = (this.z * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  this.z = (this.z + rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryPlusMutVec3l")
operator fun MutVec3<Long>.unaryPlus(): MutVec3<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecMutVec3lf")
operator fun MutVec3<Long>.times(right: Vec3Accessor<Float>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Long> {
  this.x = (this.x - rx).toLong()
  this.y = (this.y - ry).toLong()
  this.z = (this.z - rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  this.z = (this.z * rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecMutVec3lf")
operator fun MutVec3<Long>.minus(right: Vec3Accessor<Float>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "lengthMutVec3l")
fun MutVec3<Long>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecMutVec3ll")
operator fun MutVec3<Long>.plus(right: Vec3Accessor<Long>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "plusVecMutVec3ld")
operator fun MutVec3<Long>.plus(right: Vec3Accessor<Double>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Long> {
  this.x = (this.x + rx).toLong()
  this.y = (this.y + ry).toLong()
  this.z = (this.z + rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesVecMutVec3li")
operator fun MutVec3<Long>.times(right: Vec3Accessor<Int>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "minusVecMutVec3li")
operator fun MutVec3<Long>.minus(right: Vec3Accessor<Int>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "unaryMinusMutVec3l")
operator fun MutVec3<Long>.unaryMinus(): MutVec3<Long> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "timesMut3ll")
operator fun MutVec3<Long>.times(scalar: Long): MutVec3<Long> {
  this.x = (this.x * scalar).toLong()
  this.y = (this.y * scalar).toLong()
  this.z = (this.z * scalar).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun MutVec3<Long>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  this.z = (this.z * rz).toLong()
  return this
}
