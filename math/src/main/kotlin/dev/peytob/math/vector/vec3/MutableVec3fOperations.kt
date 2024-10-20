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
fun MutVec3<Float>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusMutableVec3f")
operator fun MutVec3<Float>.unaryMinus(): MutVec3<Float> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec3fd")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec3ff")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthMutableVec3f")
fun MutVec3<Float>.length(): Double {
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
@JvmName(name = "minusVecMutableVec3fl")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec3fi")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec3ff")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec3fi")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec3fd")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec3fi")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeMutableVec3f")
fun MutVec3<Float>.normalize(): MutVec3<Float> {
  val l = this.length()
  this.x = (this.x / l).toFloat()
  this.y = (this.y / l).toFloat()
  this.z = (this.z / l).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecMutableVec3fl")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusMutableVec3f")
operator fun MutVec3<Float>.unaryPlus(): MutVec3<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecMutableVec3fl")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec3fd")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun MutVec3<Float>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecMutableVec3ff")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}
