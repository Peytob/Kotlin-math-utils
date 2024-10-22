package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec3d(): MutVec3<Double> = StructMutVec3d(0.0, 0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec3d(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec3dl")
fun mutableVec3d(right: Vec3Accessor<Long>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec3d(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec3df")
fun mutableVec3d(right: Vec3Accessor<Float>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec3d(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec3d(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  val z = rz.toDouble()
  return StructMutVec3d(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec3dd")
fun mutableVec3d(right: Vec3Accessor<Double>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3d(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec3di")
fun mutableVec3d(right: Vec3Accessor<Int>): MutVec3<Double> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3d(rx = rx, ry = ry, rz = rz)
}
