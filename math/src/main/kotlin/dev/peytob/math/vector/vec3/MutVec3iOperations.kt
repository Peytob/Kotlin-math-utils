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
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3if")
operator fun MutVec3<Int>.times(right: Vec3Accessor<Float>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3il")
operator fun MutVec3<Int>.times(right: Vec3Accessor<Long>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  this.z = (this.z * rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  this.z = (this.z - rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3il")
operator fun MutVec3<Int>.minus(right: Vec3Accessor<Long>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3ii")
operator fun MutVec3<Int>.times(right: Vec3Accessor<Int>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  this.z = (this.z * rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3id")
operator fun MutVec3<Int>.times(right: Vec3Accessor<Double>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  this.z = (this.z * rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3if")
operator fun MutVec3<Int>.times(scalar: Float): MutVec3<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  this.z = (this.z * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3ii")
operator fun MutVec3<Int>.plus(right: Vec3Accessor<Int>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3id")
operator fun MutVec3<Int>.plus(right: Vec3Accessor<Double>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutVec3i")
fun MutVec3<Int>.normalize(): MutVec3<Int> {
  val l = this.length()
  this.x = (this.x / l).toInt()
  this.y = (this.y / l).toInt()
  this.z = (this.z / l).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3il")
operator fun MutVec3<Int>.plus(right: Vec3Accessor<Long>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3id")
operator fun MutVec3<Int>.minus(right: Vec3Accessor<Double>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3il")
operator fun MutVec3<Int>.times(scalar: Long): MutVec3<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  this.z = (this.z * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  this.z = (this.z - rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3if")
operator fun MutVec3<Int>.minus(right: Vec3Accessor<Float>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  this.z = (this.z + rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3id")
operator fun MutVec3<Int>.times(scalar: Double): MutVec3<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  this.z = (this.z * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  this.z = (this.z - rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  this.z = (this.z + rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3ii")
operator fun MutVec3<Int>.times(scalar: Int): MutVec3<Int> {
  this.x = (this.x * scalar).toInt()
  this.y = (this.y * scalar).toInt()
  this.z = (this.z * scalar).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutVec3i")
operator fun MutVec3<Int>.unaryPlus(): MutVec3<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  this.z = (this.z + rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutVec3i")
operator fun MutVec3<Int>.unaryMinus(): MutVec3<Int> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Int> {
  this.x = (this.x + rx).toInt()
  this.y = (this.y + ry).toInt()
  this.z = (this.z + rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Int> {
  this.x = (this.x - rx).toInt()
  this.y = (this.y - ry).toInt()
  this.z = (this.z - rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3if")
operator fun MutVec3<Int>.plus(right: Vec3Accessor<Float>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutVec3i")
fun MutVec3<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3ii")
operator fun MutVec3<Int>.minus(right: Vec3Accessor<Int>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Int>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  this.z = (this.z * rz).toInt()
  return this
}
