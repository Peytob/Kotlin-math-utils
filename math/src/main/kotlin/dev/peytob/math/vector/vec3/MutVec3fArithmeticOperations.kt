package dev.peytob.math.vector.vec3

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
@JvmName(name = "timesVecMutVec3fl")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusMutVec3f")
operator fun MutVec3<Float>.unaryMinus(): MutVec3<Float> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec3ff")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "timesMut3ff")
operator fun MutVec3<Float>.times(scalar: Float): MutVec3<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  this.z = (this.z * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec3fl")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec3fd")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec3fi")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec3fd")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec3fl")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec3ff")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec3fi")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut3fi")
operator fun MutVec3<Float>.times(scalar: Int): MutVec3<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  this.z = (this.z * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "plusVecMutVec3ff")
operator fun MutVec3<Float>.plus(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut3fd")
operator fun MutVec3<Float>.times(scalar: Double): MutVec3<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  this.z = (this.z * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusMutVec3f")
operator fun MutVec3<Float>.unaryPlus(): MutVec3<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecMutVec3fi")
operator fun MutVec3<Float>.times(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesMut3fl")
operator fun MutVec3<Float>.times(scalar: Long): MutVec3<Float> {
  this.x = (this.x * scalar).toFloat()
  this.y = (this.y * scalar).toFloat()
  this.z = (this.z * scalar).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "minusVecMutVec3fd")
operator fun MutVec3<Float>.minus(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}
