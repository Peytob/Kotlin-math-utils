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
@JvmName(name = "timesVecVec3if")
operator fun Vec3<Int>.times(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3il")
operator fun Vec3<Int>.times(scalar: Long): Vec3<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  val z = (this.z * scalar).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.dot(
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec3il")
operator fun Vec3<Int>.times(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3if")
operator fun Vec3<Int>.minus(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3if")
fun Vec3<Int>.dot(right: Vec3Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3id")
operator fun Vec3<Int>.plus(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3ii")
operator fun Vec3<Int>.minus(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec3ii")
operator fun Vec3<Int>.times(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3id")
operator fun Vec3<Int>.minus(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3ii")
operator fun Vec3<Int>.times(scalar: Int): Vec3<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  val z = (this.z * scalar).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.dot(
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3id")
fun Vec3<Int>.dot(right: Vec3Accessor<Double>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusVec3i")
operator fun Vec3<Int>.unaryMinus(): Vec3<Int> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3id")
operator fun Vec3<Int>.times(scalar: Double): Vec3<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  val z = (this.z * scalar).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3il")
fun Vec3<Int>.dot(right: Vec3Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y, rz
    = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3ii")
operator fun Vec3<Int>.plus(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec3id")
operator fun Vec3<Int>.times(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.dot(
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3if")
operator fun Vec3<Int>.times(scalar: Float): Vec3<Int> {
  val x = (this.x * scalar).toInt()
  val y = (this.y * scalar).toInt()
  val z = (this.z * scalar).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3il")
operator fun Vec3<Int>.minus(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3il")
operator fun Vec3<Int>.plus(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3if")
operator fun Vec3<Int>.plus(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x + rx).toInt()
  val y = (this.y + ry).toInt()
  val z = (this.z + rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusVec3i")
operator fun Vec3<Int>.unaryPlus(): Vec3<Int> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3ii")
fun Vec3<Int>.dot(right: Vec3Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y, rz
    = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = (this.x * rx).toInt()
  val y = (this.y * ry).toInt()
  val z = (this.z * rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = (this.x - rx).toInt()
  val y = (this.y - ry).toInt()
  val z = (this.z - rz).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Int>.dot(
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}
