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
@JvmName(name = "immutableVec3ii")
fun immutableVec3i(right: Vec3Accessor<Int>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3i(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3il")
fun immutableVec3i(right: Vec3Accessor<Long>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3id")
fun immutableVec3i(right: Vec3Accessor<Double>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3i(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3i(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3i(): Vec3<Int> = StructVec3i(0, 0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3if")
fun immutableVec3i(right: Vec3Accessor<Float>): Vec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3i(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructVec3i(x = x, y = y, z = z)
}
