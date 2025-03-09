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
public operator fun Vec3<Double>.plus(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  val rz = (this.z + right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3dd")
public operator fun Vec3<Double>.times(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  val rz = (this.z * right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3dd")
public fun Vec3<Double>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.dot(
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
public operator fun Vec3<Double>.minus(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  val rz = (this.z - right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3df")
public operator fun Vec3<Double>.plus(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  val rz = (this.z + right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3df")
public operator fun Vec3<Double>.times(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  val rz = (this.z * right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3df")
public fun Vec3<Double>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.dot(
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
public operator fun Vec3<Double>.minus(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  val rz = (this.z - right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3di")
public operator fun Vec3<Double>.plus(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  val rz = (this.z + right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3di")
public operator fun Vec3<Double>.times(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  val rz = (this.z * right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3di")
public fun Vec3<Double>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.dot(
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
public operator fun Vec3<Double>.minus(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  val rz = (this.z - right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3dl")
public operator fun Vec3<Double>.plus(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = (this.x + right.x).toDouble()
  val ry = (this.y + right.y).toDouble()
  val rz = (this.z + right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3dl")
public operator fun Vec3<Double>.times(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = (this.x * right.x).toDouble()
  val ry = (this.y * right.y).toDouble()
  val rz = (this.z * right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3dl")
public fun Vec3<Double>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.dot(
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
public operator fun Vec3<Double>.minus(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = (this.x - right.x).toDouble()
  val ry = (this.y - right.y).toDouble()
  val rz = (this.z - right.z).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Double>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return immutableVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.plus(scalar: Double): Vec3<Double> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.times(scalar: Double): Vec3<Double> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.minus(scalar: Double): Vec3<Double> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.plus(scalar: Float): Vec3<Double> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.times(scalar: Float): Vec3<Double> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.minus(scalar: Float): Vec3<Double> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.plus(scalar: Int): Vec3<Double> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.times(scalar: Int): Vec3<Double> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.minus(scalar: Int): Vec3<Double> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.plus(scalar: Long): Vec3<Double> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.times(scalar: Long): Vec3<Double> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Double>.minus(scalar: Long): Vec3<Double> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec3d")
public operator fun Vec3<Double>.unaryPlus(): Vec3<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec3d")
public operator fun Vec3<Double>.unaryMinus(): Vec3<Double> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return immutableVec3d(x = x, y = y, z = z)
}
