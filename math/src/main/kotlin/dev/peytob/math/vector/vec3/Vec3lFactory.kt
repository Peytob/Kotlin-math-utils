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
fun immutableVec3l(): Vec3<Long> = StructVec3l(0L, 0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3li")
fun immutableVec3l(right: Vec3Accessor<Int>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3l(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3lf")
fun immutableVec3l(right: Vec3Accessor<Float>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3l(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3ld")
fun immutableVec3l(right: Vec3Accessor<Double>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3l(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3l(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3ll")
fun immutableVec3l(right: Vec3Accessor<Long>): Vec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3l(rx = rx, ry = ry, rz = rz)
}
