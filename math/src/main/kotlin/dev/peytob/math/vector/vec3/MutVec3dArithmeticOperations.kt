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
@JvmName(name = "plusVecVec3dd")
public operator fun MutVec3<Double>.plus(right: Vec3Accessor<Double>): MutVec3<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  this.z = (this.z + right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3dd")
public operator fun MutVec3<Double>.times(right: Vec3Accessor<Double>): MutVec3<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  this.z = (this.z * right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3dd")
public fun MutVec3<Double>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.dot(
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
@JvmName(name = "minusVecVec3dd")
public operator fun MutVec3<Double>.minus(right: Vec3Accessor<Double>): MutVec3<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  this.z = (this.z - right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3df")
public operator fun MutVec3<Double>.plus(right: Vec3Accessor<Float>): MutVec3<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  this.z = (this.z + right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3df")
public operator fun MutVec3<Double>.times(right: Vec3Accessor<Float>): MutVec3<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  this.z = (this.z * right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3df")
public fun MutVec3<Double>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.dot(
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
@JvmName(name = "minusVecVec3df")
public operator fun MutVec3<Double>.minus(right: Vec3Accessor<Float>): MutVec3<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  this.z = (this.z - right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3di")
public operator fun MutVec3<Double>.plus(right: Vec3Accessor<Int>): MutVec3<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  this.z = (this.z + right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Double> {
  this.x = (this.x + rx).toDouble()
  this.y = (this.y + ry).toDouble()
  this.z = (this.z + rz).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3di")
public operator fun MutVec3<Double>.times(right: Vec3Accessor<Int>): MutVec3<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  this.z = (this.z * right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3di")
public fun MutVec3<Double>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.dot(
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
@JvmName(name = "minusVecVec3di")
public operator fun MutVec3<Double>.minus(right: Vec3Accessor<Int>): MutVec3<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  this.z = (this.z - right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.minus(
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
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3dl")
public operator fun MutVec3<Double>.plus(right: Vec3Accessor<Long>): MutVec3<Double> {
  this.x = (this.x + right.x).toDouble()
  this.y = (this.y + right.y).toDouble()
  this.z = (this.z + right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.plus(
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
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3dl")
public operator fun MutVec3<Double>.times(right: Vec3Accessor<Long>): MutVec3<Double> {
  this.x = (this.x * right.x).toDouble()
  this.y = (this.y * right.y).toDouble()
  this.z = (this.z * right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.times(
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
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3dl")
public fun MutVec3<Double>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.dot(
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
@JvmName(name = "minusVecVec3dl")
public operator fun MutVec3<Double>.minus(right: Vec3Accessor<Long>): MutVec3<Double> {
  this.x = (this.x - right.x).toDouble()
  this.y = (this.y - right.y).toDouble()
  this.z = (this.z - right.z).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Double>.minus(
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
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.plus(scalar: Double): MutVec3<Double> = this.plus(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.times(scalar: Double): MutVec3<Double> = this.times(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.minus(scalar: Double): MutVec3<Double> = this.minus(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.plus(scalar: Float): MutVec3<Double> = this.plus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.times(scalar: Float): MutVec3<Double> = this.times(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.minus(scalar: Float): MutVec3<Double> = this.minus(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.plus(scalar: Int): MutVec3<Double> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.times(scalar: Int): MutVec3<Double> = this.times(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.minus(scalar: Int): MutVec3<Double> = this.minus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.plus(scalar: Long): MutVec3<Double> = this.plus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.times(scalar: Long): MutVec3<Double> = this.times(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Double>.minus(scalar: Long): MutVec3<Double> = this.minus(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec3d")
public operator fun MutVec3<Double>.unaryPlus(): MutVec3<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec3d")
public operator fun MutVec3<Double>.unaryMinus(): MutVec3<Double> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}
