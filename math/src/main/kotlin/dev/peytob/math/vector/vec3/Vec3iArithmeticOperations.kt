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
public operator fun Vec3<Int>.plus(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  val rz = (this.z + right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3id")
public operator fun Vec3<Int>.times(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  val rz = (this.z * right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3id")
public fun Vec3<Int>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.dot(
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
public operator fun Vec3<Int>.minus(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  val rz = (this.z - right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3if")
public operator fun Vec3<Int>.plus(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  val rz = (this.z + right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3if")
public operator fun Vec3<Int>.times(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  val rz = (this.z * right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3if")
public fun Vec3<Int>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.dot(
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
public operator fun Vec3<Int>.minus(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  val rz = (this.z - right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ii")
public operator fun Vec3<Int>.plus(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  val rz = (this.z + right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ii")
public operator fun Vec3<Int>.times(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  val rz = (this.z * right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ii")
public fun Vec3<Int>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.dot(
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
public operator fun Vec3<Int>.minus(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  val rz = (this.z - right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3il")
public operator fun Vec3<Int>.plus(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = (this.x + right.x).toInt()
  val ry = (this.y + right.y).toInt()
  val rz = (this.z + right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3il")
public operator fun Vec3<Int>.times(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = (this.x * right.x).toInt()
  val ry = (this.y * right.y).toInt()
  val rz = (this.z * right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3il")
public fun Vec3<Int>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.dot(
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
public operator fun Vec3<Int>.minus(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = (this.x - right.x).toInt()
  val ry = (this.y - right.y).toInt()
  val rz = (this.z - right.z).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Int>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return immutableVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.plus(scalar: Double): Vec3<Int> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.times(scalar: Double): Vec3<Int> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.minus(scalar: Double): Vec3<Int> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.plus(scalar: Float): Vec3<Int> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.times(scalar: Float): Vec3<Int> = this.times(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.minus(scalar: Float): Vec3<Int> = this.minus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.plus(scalar: Int): Vec3<Int> = this.plus(rx = scalar, ry = scalar, rz
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.times(scalar: Int): Vec3<Int> = this.times(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.minus(scalar: Int): Vec3<Int> = this.minus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.plus(scalar: Long): Vec3<Int> = this.plus(rx = scalar, ry = scalar, rz
    = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.times(scalar: Long): Vec3<Int> = this.times(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Int>.minus(scalar: Long): Vec3<Int> = this.minus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec3i")
public operator fun Vec3<Int>.unaryPlus(): Vec3<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec3i")
public operator fun Vec3<Int>.unaryMinus(): Vec3<Int> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return immutableVec3i(x = x, y = y, z = z)
}
