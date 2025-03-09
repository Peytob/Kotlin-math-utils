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
public fun mutableVec3d(): MutVec3<Double> = StructMutVec3d(0.0, 0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3dd")
public fun mutableVec3d(right: Vec3Accessor<Double>): MutVec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3dd")
public fun mutableVec3d(
  x: Double,
  y: Double,
  z: Double,
): MutVec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructMutVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3df")
public fun mutableVec3d(right: Vec3Accessor<Float>): MutVec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3df")
public fun mutableVec3d(
  x: Float,
  y: Float,
  z: Float,
): MutVec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructMutVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3di")
public fun mutableVec3d(right: Vec3Accessor<Int>): MutVec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3di")
public fun mutableVec3d(
  x: Int,
  y: Int,
  z: Int,
): MutVec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructMutVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3dl")
public fun mutableVec3d(right: Vec3Accessor<Long>): MutVec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3dl")
public fun mutableVec3d(
  x: Long,
  y: Long,
  z: Long,
): MutVec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructMutVec3d(x = rx, y = ry, z = rz)
}
