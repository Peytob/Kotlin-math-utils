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
@JvmName(name = "timesVecVec3dl")
operator fun Vec3<Double>.times(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3dl")
operator fun Vec3<Double>.times(scalar: Long): Vec3<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  val z = (this.z * scalar).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryPlusVec3d")
operator fun Vec3<Double>.unaryPlus(): Vec3<Double> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3dd")
operator fun Vec3<Double>.plus(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec3dd")
operator fun Vec3<Double>.times(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "timesVecVec3df")
operator fun Vec3<Double>.times(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3dl")
operator fun Vec3<Double>.plus(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.dot(
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
fun Vec3<Double>.dot(
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
fun Vec3<Double>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.dot(
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3df")
operator fun Vec3<Double>.minus(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3dl")
operator fun Vec3<Double>.minus(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3dl")
fun Vec3<Double>.dot(right: Vec3Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3di")
operator fun Vec3<Double>.plus(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3df")
operator fun Vec3<Double>.times(scalar: Float): Vec3<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  val z = (this.z * scalar).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3di")
operator fun Vec3<Double>.times(scalar: Int): Vec3<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  val z = (this.z * scalar).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.dot(
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
@JvmName(name = "timesVecVec3di")
operator fun Vec3<Double>.times(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "times3dd")
operator fun Vec3<Double>.times(scalar: Double): Vec3<Double> {
  val x = (this.x * scalar).toDouble()
  val y = (this.y * scalar).toDouble()
  val z = (this.z * scalar).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3dd")
operator fun Vec3<Double>.minus(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x * rx).toDouble()
  val y = (this.y * ry).toDouble()
  val z = (this.z * rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3dd")
fun Vec3<Double>.dot(right: Vec3Accessor<Double>): Float = this.dot(rx = right.x, ry =
    right.y, rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "plusVecVec3df")
operator fun Vec3<Double>.plus(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3df")
fun Vec3<Double>.dot(right: Vec3Accessor<Float>): Float = this.dot(rx = right.x, ry =
    right.y, rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "dotVec3di")
fun Vec3<Double>.dot(right: Vec3Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "unaryMinusVec3d")
operator fun Vec3<Double>.unaryMinus(): Vec3<Double> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = (this.x + rx).toDouble()
  val y = (this.y + ry).toDouble()
  val z = (this.z + rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun Vec3<Double>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = (this.x - rx).toDouble()
  val y = (this.y - ry).toDouble()
  val z = (this.z - rz).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "minusVecVec3di")
operator fun Vec3<Double>.minus(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}
