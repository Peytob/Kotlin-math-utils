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
fun Vec3<Float>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryPlusVec3f")
operator fun Vec3<Float>.unaryPlus(): Vec3<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3ff")
operator fun Vec3<Float>.minus(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3fl")
operator fun Vec3<Float>.plus(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3fi")
operator fun Vec3<Float>.times(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.dot(
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
@JvmName(name = "timesVecVec3ff")
operator fun Vec3<Float>.times(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3fl")
operator fun Vec3<Float>.times(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3ff")
operator fun Vec3<Float>.plus(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "normalizeVec3f")
fun Vec3<Float>.normalize(): Vec3<Float> {
  val l = this.length()
  val x = (this.x / l).toFloat()
  val y = (this.y / l).toFloat()
  val z = (this.z / l).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times3fd")
operator fun Vec3<Float>.times(scalar: Double): Vec3<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  val z = (this.z * scalar).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3fl")
fun Vec3<Float>.dot(right: Vec3Accessor<Long>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3fd")
operator fun Vec3<Float>.minus(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times3fl")
operator fun Vec3<Float>.times(scalar: Long): Vec3<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  val z = (this.z * scalar).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3ff")
fun Vec3<Float>.dot(right: Vec3Accessor<Float>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.dot(
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
@JvmName(name = "dotVec3fd")
fun Vec3<Float>.dot(right: Vec3Accessor<Double>): Float = this.dot(rx = right.x, ry =
    right.y, rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.dot(
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
@JvmName(name = "plusVecVec3fi")
operator fun Vec3<Float>.plus(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "dotVec3fi")
fun Vec3<Float>.dot(right: Vec3Accessor<Int>): Float = this.dot(rx = right.x, ry = right.y,
    rz = right.z)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "timesVecVec3fd")
operator fun Vec3<Float>.times(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.times(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "lengthVec3f")
fun Vec3<Float>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.dot(
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
fun Vec3<Float>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3fl")
operator fun Vec3<Float>.minus(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "unaryMinusVec3f")
operator fun Vec3<Float>.unaryMinus(): Vec3<Float> {
  val x = -this.x
  val y = -this.y
  val z = -this.z
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times3ff")
operator fun Vec3<Float>.times(scalar: Float): Vec3<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  val z = (this.z * scalar).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "minusVecVec3fi")
operator fun Vec3<Float>.minus(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.minus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x * rx).toFloat()
  val y = (this.y * ry).toFloat()
  val z = (this.z * rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = (this.x - rx).toFloat()
  val y = (this.y - ry).toFloat()
  val z = (this.z - rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "times3fi")
operator fun Vec3<Float>.times(scalar: Int): Vec3<Float> {
  val x = (this.x * scalar).toFloat()
  val y = (this.y * scalar).toFloat()
  val z = (this.z * scalar).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "plusVecVec3fd")
operator fun Vec3<Float>.plus(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return this.plus(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun Vec3<Float>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = (this.x + rx).toFloat()
  val y = (this.y + ry).toFloat()
  val z = (this.z + rz).toFloat()
  return StructVec3f(x = x, y = y, z = z)
}
