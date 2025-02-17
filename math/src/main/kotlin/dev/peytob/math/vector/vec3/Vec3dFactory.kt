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
@JvmName(name = "immutableVec3dd")
fun immutableVec3d(right: Vec3Accessor<Double>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec3d(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec3d(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec3d(): Vec3<Double> = StructVec3d(0.0, 0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec3dl")
fun immutableVec3d(right: Vec3Accessor<Long>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec3di")
fun immutableVec3d(right: Vec3Accessor<Int>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec3d(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec3df")
fun immutableVec3d(right: Vec3Accessor<Float>): Vec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec3d(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructVec3d(x = x, y = y, z = z)
}
