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
  date = "2025-02-17",
)
@JvmName(name = "normalizeMutVec3i")
fun MutVec3<Int>.normalize(): MutVec3<Int> {
  val l = this.length()
  this.x = (this.x / l).toInt()
  this.y = (this.y / l).toInt()
  this.z = (this.z / l).toInt()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "normalizeVec3d")
fun Vec3<Double>.normalize(): Vec3<Double> {
  val l = this.length()
  val x = (this.x / l).toDouble()
  val y = (this.y / l).toDouble()
  val z = (this.z / l).toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "normalizeMutVec3f")
fun MutVec3<Float>.normalize(): MutVec3<Float> {
  val l = this.length()
  this.x = (this.x / l).toFloat()
  this.y = (this.y / l).toFloat()
  this.z = (this.z / l).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "normalizeVec3i")
fun Vec3<Int>.normalize(): Vec3<Int> {
  val l = this.length()
  val x = (this.x / l).toInt()
  val y = (this.y / l).toInt()
  val z = (this.z / l).toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "normalizeMutVec3d")
fun MutVec3<Double>.normalize(): MutVec3<Double> {
  val l = this.length()
  this.x = (this.x / l).toDouble()
  this.y = (this.y / l).toDouble()
  this.z = (this.z / l).toDouble()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "normalizeMutVec3l")
fun MutVec3<Long>.normalize(): MutVec3<Long> {
  val l = this.length()
  this.x = (this.x / l).toLong()
  this.y = (this.y / l).toLong()
  this.z = (this.z / l).toLong()
  return this
}
