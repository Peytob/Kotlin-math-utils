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
@JvmName(name = "plusVecVec3id")
public operator fun MutVec3<Int>.plus(right: Vec3Accessor<Double>): MutVec3<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  this.z = (this.z + right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3id")
public operator fun MutVec3<Int>.times(right: Vec3Accessor<Double>): MutVec3<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  this.z = (this.z * right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3id")
public fun MutVec3<Int>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.dot(
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
@JvmName(name = "minusVecVec3id")
public operator fun MutVec3<Int>.minus(right: Vec3Accessor<Double>): MutVec3<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  this.z = (this.z - right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3if")
public operator fun MutVec3<Int>.plus(right: Vec3Accessor<Float>): MutVec3<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  this.z = (this.z + right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3if")
public operator fun MutVec3<Int>.times(right: Vec3Accessor<Float>): MutVec3<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  this.z = (this.z * right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3if")
public fun MutVec3<Int>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.dot(
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
@JvmName(name = "minusVecVec3if")
public operator fun MutVec3<Int>.minus(right: Vec3Accessor<Float>): MutVec3<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  this.z = (this.z - right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ii")
public operator fun MutVec3<Int>.plus(right: Vec3Accessor<Int>): MutVec3<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  this.z = (this.z + right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ii")
public operator fun MutVec3<Int>.times(right: Vec3Accessor<Int>): MutVec3<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  this.z = (this.z * right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Int> {
  this.x = (this.x * rx).toInt()
  this.y = (this.y * ry).toInt()
  this.z = (this.z * rz).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ii")
public fun MutVec3<Int>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.dot(
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
@JvmName(name = "minusVecVec3ii")
public operator fun MutVec3<Int>.minus(right: Vec3Accessor<Int>): MutVec3<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  this.z = (this.z - right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3il")
public operator fun MutVec3<Int>.plus(right: Vec3Accessor<Long>): MutVec3<Int> {
  this.x = (this.x + right.x).toInt()
  this.y = (this.y + right.y).toInt()
  this.z = (this.z + right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3il")
public operator fun MutVec3<Int>.times(right: Vec3Accessor<Long>): MutVec3<Int> {
  this.x = (this.x * right.x).toInt()
  this.y = (this.y * right.y).toInt()
  this.z = (this.z * right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3il")
public fun MutVec3<Int>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.dot(
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
@JvmName(name = "minusVecVec3il")
public operator fun MutVec3<Int>.minus(right: Vec3Accessor<Long>): MutVec3<Int> {
  this.x = (this.x - right.x).toInt()
  this.y = (this.y - right.y).toInt()
  this.z = (this.z - right.z).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Int>.minus(
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
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.plus(scalar: Double): MutVec3<Int> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.times(scalar: Double): MutVec3<Int> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.minus(scalar: Double): MutVec3<Int> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.plus(scalar: Float): MutVec3<Int> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.times(scalar: Float): MutVec3<Int> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.minus(scalar: Float): MutVec3<Int> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.plus(scalar: Int): MutVec3<Int> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.times(scalar: Int): MutVec3<Int> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.minus(scalar: Int): MutVec3<Int> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.plus(scalar: Long): MutVec3<Int> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.times(scalar: Long): MutVec3<Int> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Int>.minus(scalar: Long): MutVec3<Int> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec3i")
public operator fun MutVec3<Int>.unaryPlus(): MutVec3<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec3i")
public operator fun MutVec3<Int>.unaryMinus(): MutVec3<Int> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}
