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
@JvmName(name = "plusVecVec3fd")
public operator fun Vec3<Float>.plus(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  val rz = (this.z + right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fd")
public operator fun Vec3<Float>.times(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  val rz = (this.z * right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fd")
public fun Vec3<Float>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.dot(
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
@JvmName(name = "minusVecVec3fd")
public operator fun Vec3<Float>.minus(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  val rz = (this.z - right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ff")
public operator fun Vec3<Float>.plus(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  val rz = (this.z + right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ff")
public operator fun Vec3<Float>.times(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  val rz = (this.z * right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ff")
public fun Vec3<Float>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.dot(
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
@JvmName(name = "minusVecVec3ff")
public operator fun Vec3<Float>.minus(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  val rz = (this.z - right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3fi")
public operator fun Vec3<Float>.plus(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  val rz = (this.z + right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fi")
public operator fun Vec3<Float>.times(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  val rz = (this.z * right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fi")
public fun Vec3<Float>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.dot(
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
@JvmName(name = "minusVecVec3fi")
public operator fun Vec3<Float>.minus(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  val rz = (this.z - right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3fl")
public operator fun Vec3<Float>.plus(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = (this.x + right.x).toFloat()
  val ry = (this.y + right.y).toFloat()
  val rz = (this.z + right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fl")
public operator fun Vec3<Float>.times(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = (this.x * right.x).toFloat()
  val ry = (this.y * right.y).toFloat()
  val rz = (this.z * right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fl")
public fun Vec3<Float>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.dot(
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
@JvmName(name = "minusVecVec3fl")
public operator fun Vec3<Float>.minus(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = (this.x - right.x).toFloat()
  val ry = (this.y - right.y).toFloat()
  val rz = (this.z - right.z).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun Vec3<Float>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return immutableVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.plus(scalar: Double): Vec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.times(scalar: Double): Vec3<Float> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.minus(scalar: Double): Vec3<Float> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.plus(scalar: Float): Vec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.times(scalar: Float): Vec3<Float> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.minus(scalar: Float): Vec3<Float> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.plus(scalar: Int): Vec3<Float> = this.plus(rx = scalar, ry = scalar,
    rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.times(scalar: Int): Vec3<Float> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.minus(scalar: Int): Vec3<Float> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.plus(scalar: Long): Vec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.times(scalar: Long): Vec3<Float> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun Vec3<Float>.minus(scalar: Long): Vec3<Float> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusVec3f")
public operator fun Vec3<Float>.unaryPlus(): Vec3<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusVec3f")
public operator fun Vec3<Float>.unaryMinus(): Vec3<Float> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return immutableVec3f(x = x, y = y, z = z)
}
