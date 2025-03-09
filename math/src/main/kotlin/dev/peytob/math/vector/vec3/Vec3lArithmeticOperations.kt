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
public operator fun Vec3<Long>.plus(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  val rz = (this.z + right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ld")
public operator fun Vec3<Long>.times(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  val rz = (this.z * right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ld")
public fun Vec3<Long>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.dot(
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
public operator fun Vec3<Long>.minus(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  val rz = (this.z - right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3lf")
public operator fun Vec3<Long>.plus(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  val rz = (this.z + right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3lf")
public operator fun Vec3<Long>.times(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  val rz = (this.z * right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3lf")
public fun Vec3<Long>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.dot(
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
public operator fun Vec3<Long>.minus(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  val rz = (this.z - right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3li")
public operator fun Vec3<Long>.plus(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  val rz = (this.z + right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3li")
public operator fun Vec3<Long>.times(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  val rz = (this.z * right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3li")
public fun Vec3<Long>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.dot(
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
public operator fun Vec3<Long>.minus(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  val rz = (this.z - right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ll")
public operator fun Vec3<Long>.plus(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = (this.x + right.x).toLong()
  val ry = (this.y + right.y).toLong()
  val rz = (this.z + right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ll")
public operator fun Vec3<Long>.times(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = (this.x * right.x).toLong()
  val ry = (this.y * right.y).toLong()
  val rz = (this.z * right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ll")
public fun Vec3<Long>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.dot(
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
public operator fun Vec3<Long>.minus(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = (this.x - right.x).toLong()
  val ry = (this.y - right.y).toLong()
  val rz = (this.z - right.z).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Long>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return immutableVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.plus(scalar: Double): Vec3<Long> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.times(scalar: Double): Vec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.minus(scalar: Double): Vec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.plus(scalar: Float): Vec3<Long> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.times(scalar: Float): Vec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.minus(scalar: Float): Vec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.plus(scalar: Int): Vec3<Long> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.times(scalar: Int): Vec3<Long> = this.times(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.minus(scalar: Int): Vec3<Long> = this.minus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.plus(scalar: Long): Vec3<Long> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.times(scalar: Long): Vec3<Long> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Long>.minus(scalar: Long): Vec3<Long> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec3l")
public operator fun Vec3<Long>.unaryPlus(): Vec3<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec3l")
public operator fun Vec3<Long>.unaryMinus(): Vec3<Long> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return immutableVec3l(x = x, y = y, z = z)
}
