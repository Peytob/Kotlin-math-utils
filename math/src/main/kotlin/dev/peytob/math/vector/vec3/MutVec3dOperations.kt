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
@JvmName(name = "plusVecMutVec3df")
operator fun MutVec3<Double>.plus(right: Vec3Accessor<Float>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3df")
operator fun MutVec3<Double>.minus(right: Vec3Accessor<Float>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3df")
operator fun MutVec3<Double>.times(scalar: Float): MutVec3<Double> {
  this.x = (this.x * scalar).toDouble()
  this.y = (this.y * scalar).toDouble()
  this.z = (this.z * scalar).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  this.z = (this.z * rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3dd")
operator fun MutVec3<Double>.times(right: Vec3Accessor<Double>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3di")
operator fun MutVec3<Double>.minus(right: Vec3Accessor<Int>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  this.z = (this.z + rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3dl")
operator fun MutVec3<Double>.times(right: Vec3Accessor<Long>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  this.z = (this.z - rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  this.z = (this.z * rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  this.z = (this.z + rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  this.z = (this.z - rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3di")
operator fun MutVec3<Double>.times(right: Vec3Accessor<Int>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3di")
operator fun MutVec3<Double>.times(scalar: Int): MutVec3<Double> {
  this.x = (this.x * scalar).toDouble()
  this.y = (this.y * scalar).toDouble()
  this.z = (this.z * scalar).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3dl")
operator fun MutVec3<Double>.minus(right: Vec3Accessor<Long>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3dd")
operator fun MutVec3<Double>.times(scalar: Double): MutVec3<Double> {
  this.x = (this.x * scalar).toDouble()
  this.y = (this.y * scalar).toDouble()
  this.z = (this.z * scalar).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  this.z = (this.z * rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesMut3dl")
operator fun MutVec3<Double>.times(scalar: Long): MutVec3<Double> {
  this.x = (this.x * scalar).toDouble()
  this.y = (this.y * scalar).toDouble()
  this.z = (this.z * scalar).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutVec3d")
operator fun MutVec3<Double>.unaryMinus(): MutVec3<Double> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutVec3d")
fun MutVec3<Double>.normalize(): MutVec3<Double> {
  val l = this.length()
  this.x = (this.x / l).toDouble()
  this.y = (this.y / l).toDouble()
  this.z = (this.z / l).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutVec3d")
operator fun MutVec3<Double>.unaryPlus(): MutVec3<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3di")
operator fun MutVec3<Double>.plus(right: Vec3Accessor<Int>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutVec3dd")
operator fun MutVec3<Double>.minus(right: Vec3Accessor<Double>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutVec3df")
operator fun MutVec3<Double>.times(right: Vec3Accessor<Float>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  this.z = (this.z + rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  this.z = (this.z - rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3dl")
operator fun MutVec3<Double>.plus(right: Vec3Accessor<Long>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutVec3dd")
operator fun MutVec3<Double>.plus(right: Vec3Accessor<Double>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Double> {
  this.x = (this.x - rx).toDouble()
  this.y = (this.y - ry).toDouble()
  this.z = (this.z - rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutVec3d")
fun MutVec3<Double>.length(): Float {
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
fun MutVec3<Double>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Double> {
  this.x = (this.x * rx).toDouble()
  this.y = (this.y * ry).toDouble()
  this.z = (this.z * rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Double>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  this.z = (this.z + rz).toDouble()
  return this
}
