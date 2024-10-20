package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3ll")
operator fun Vec3<Long>.minus(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.dot(
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3li")
operator fun Vec3<Long>.times(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3li")
operator fun Vec3<Long>.minus(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3lf")
operator fun Vec3<Long>.minus(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3lf")
fun Vec3<Long>.dot(right: Vec3Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3lf")
operator fun Vec3<Long>.times(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.dot(
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3ll")
operator fun Vec3<Long>.times(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3ld")
operator fun Vec3<Long>.times(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3ld")
fun Vec3<Long>.dot(right: Vec3Accessor<Double>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3lf")
operator fun Vec3<Long>.plus(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3ld")
operator fun Vec3<Long>.minus(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3ld")
operator fun Vec3<Long>.plus(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusVec3l")
operator fun Vec3<Long>.unaryMinus(): Vec3<Long> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.dot(
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthVec3l")
fun Vec3<Long>.length(): Double {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3ll")
operator fun Vec3<Long>.plus(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3li")
fun Vec3<Long>.dot(right: Vec3Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y, rz
    = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = (this.x * rx).toLong()
  val y = (this.y * ry).toLong()
  val z = (this.z * rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3ll")
fun Vec3<Long>.dot(right: Vec3Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x - rx).toLong()
  val y = (this.y - ry).toLong()
  val z = (this.z - rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusVec3l")
operator fun Vec3<Long>.unaryPlus(): Vec3<Long> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.dot(
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  val sum = x * rx + y * ry + z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Long>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = (this.x + rx).toLong()
  val y = (this.y + ry).toLong()
  val z = (this.z + rz).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeVec3l")
fun Vec3<Long>.normalize(): Vec3<Long> {
  val l = this.length()
  val x = (this.x / l).toLong()
  val y = (this.y / l).toLong()
  val z = (this.z / l).toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3li")
operator fun Vec3<Long>.plus(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}
