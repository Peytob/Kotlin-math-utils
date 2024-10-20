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
fun mutableVec3l(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3l(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3ld")
fun mutableVec3l(right: Vec3Accessor<Double>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3ll")
fun mutableVec3l(right: Vec3Accessor<Long>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3lf")
fun mutableVec3l(right: Vec3Accessor<Float>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3l(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3l(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3l(): MutVec3<Long> = StructMutVec3l(0L, 0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec3l(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  val z = rz.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec3li")
fun mutableVec3l(right: Vec3Accessor<Int>): MutVec3<Long> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3l(rx = rx, ry = ry, rz = rz)
}
