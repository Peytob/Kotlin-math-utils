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
@JvmName(name = "unaryMinusMutableVec3i")
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
@JvmName(name = "plusVecMutableVec3ii")
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
@JvmName(name = "lengthMutableVec3i")
fun MutVec3<Int>.length(): Double {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s)
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
@JvmName(name = "unaryPlusMutableVec3i")
operator fun MutVec3<Int>.unaryPlus(): MutVec3<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec3il")
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
@JvmName(name = "minusVecMutableVec3il")
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
@JvmName(name = "minusVecMutableVec3ii")
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
@JvmName(name = "timesVecMutableVec3if")
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
@JvmName(name = "timesVecMutableVec3id")
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
@JvmName(name = "timesVecMutableVec3ii")
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
@JvmName(name = "timesVecMutableVec3il")
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
@JvmName(name = "minusVecMutableVec3if")
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
@JvmName(name = "plusVecMutableVec3id")
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
@JvmName(name = "plusVecMutableVec3if")
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
@JvmName(name = "minusVecMutableVec3id")
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
@JvmName(name = "normalizeMutableVec3i")
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
