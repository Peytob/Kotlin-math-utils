package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3id")
fun mutableVec3i(right: Vec3Accessor<Double>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3i(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3i(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3i(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3il")
fun mutableVec3i(right: Vec3Accessor<Long>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3i(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  val z = rz.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3if")
fun mutableVec3i(right: Vec3Accessor<Float>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3i(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3i(): MutVec3<Int> = StructMutVec3i(0, 0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3ii")
fun mutableVec3i(right: Vec3Accessor<Int>): MutVec3<Int> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3i(rx = rx, ry = ry, rz = rz)
}
