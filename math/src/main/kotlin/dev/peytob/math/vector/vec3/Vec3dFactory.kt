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
public fun immutableVec3d(): Vec3<Double> = StructVec3d(0.0, 0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3dd")
public fun immutableVec3d(right: Vec3Accessor<Double>): Vec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3dd")
public fun immutableVec3d(
  x: Double,
  y: Double,
  z: Double,
): Vec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3df")
public fun immutableVec3d(right: Vec3Accessor<Float>): Vec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3df")
public fun immutableVec3d(
  x: Float,
  y: Float,
  z: Float,
): Vec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3di")
public fun immutableVec3d(right: Vec3Accessor<Int>): Vec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3di")
public fun immutableVec3d(
  x: Int,
  y: Int,
  z: Int,
): Vec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructVec3d(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3dl")
public fun immutableVec3d(right: Vec3Accessor<Long>): Vec3<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  val z = right.z.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3dl")
public fun immutableVec3d(
  x: Long,
  y: Long,
  z: Long,
): Vec3<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  val rz = z.toDouble()
  return StructVec3d(x = rx, y = ry, z = rz)
}
