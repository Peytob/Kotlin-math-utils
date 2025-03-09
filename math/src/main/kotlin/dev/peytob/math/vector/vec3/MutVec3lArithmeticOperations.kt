package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ld")
public operator fun MutVec3<Long>.plus(right: Vec3Accessor<Double>): MutVec3<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  this.z = (this.z + right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ld")
public operator fun MutVec3<Long>.times(right: Vec3Accessor<Double>): MutVec3<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  this.z = (this.z * right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ld")
public fun MutVec3<Long>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.dot(
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3ld")
public operator fun MutVec3<Long>.minus(right: Vec3Accessor<Double>): MutVec3<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  this.z = (this.z - right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3lf")
public operator fun MutVec3<Long>.plus(right: Vec3Accessor<Float>): MutVec3<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  this.z = (this.z + right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3lf")
public operator fun MutVec3<Long>.times(right: Vec3Accessor<Float>): MutVec3<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  this.z = (this.z * right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Long> {
  this.x = (this.x * rx).toLong()
  this.y = (this.y * ry).toLong()
  this.z = (this.z * rz).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3lf")
public fun MutVec3<Long>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.dot(
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3lf")
public operator fun MutVec3<Long>.minus(right: Vec3Accessor<Float>): MutVec3<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  this.z = (this.z - right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3li")
public operator fun MutVec3<Long>.plus(right: Vec3Accessor<Int>): MutVec3<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  this.z = (this.z + right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3li")
public operator fun MutVec3<Long>.times(right: Vec3Accessor<Int>): MutVec3<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  this.z = (this.z * right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3li")
public fun MutVec3<Long>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.dot(
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3li")
public operator fun MutVec3<Long>.minus(right: Vec3Accessor<Int>): MutVec3<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  this.z = (this.z - right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ll")
public operator fun MutVec3<Long>.plus(right: Vec3Accessor<Long>): MutVec3<Long> {
  this.x = (this.x + right.x).toLong()
  this.y = (this.y + right.y).toLong()
  this.z = (this.z + right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ll")
public operator fun MutVec3<Long>.times(right: Vec3Accessor<Long>): MutVec3<Long> {
  this.x = (this.x * right.x).toLong()
  this.y = (this.y * right.y).toLong()
  this.z = (this.z * right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ll")
public fun MutVec3<Long>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.dot(
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3ll")
public operator fun MutVec3<Long>.minus(right: Vec3Accessor<Long>): MutVec3<Long> {
  this.x = (this.x - right.x).toLong()
  this.y = (this.y - right.y).toLong()
  this.z = (this.z - right.z).toLong()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Long>.minus(
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
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.plus(scalar: Double): MutVec3<Long> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.times(scalar: Double): MutVec3<Long> = this.times(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.minus(scalar: Double): MutVec3<Long> = this.minus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.plus(scalar: Float): MutVec3<Long> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.times(scalar: Float): MutVec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.minus(scalar: Float): MutVec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.plus(scalar: Int): MutVec3<Long> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.times(scalar: Int): MutVec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.minus(scalar: Int): MutVec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.plus(scalar: Long): MutVec3<Long> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.times(scalar: Long): MutVec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Long>.minus(scalar: Long): MutVec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec3l")
public operator fun MutVec3<Long>.unaryPlus(): MutVec3<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec3l")
public operator fun MutVec3<Long>.unaryMinus(): MutVec3<Long> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}
