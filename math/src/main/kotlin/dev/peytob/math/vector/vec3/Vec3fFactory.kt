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
fun immutableVec3f(): Vec3<Float> = StructVec3f(0f, 0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3ff")
fun immutableVec3f(right: Vec3Accessor<Float>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3f(
  rx: Long,
  ry: Long,
  rz: Long,
): Vec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3f(
  rx: Int,
  ry: Int,
  rz: Int,
): Vec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3fl")
fun immutableVec3f(right: Vec3Accessor<Long>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3f(
  rx: Double,
  ry: Double,
  rz: Double,
): Vec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3fi")
fun immutableVec3f(right: Vec3Accessor<Int>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun immutableVec3f(
  rx: Float,
  ry: Float,
  rz: Float,
): Vec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "immutableVec3fd")
fun immutableVec3f(right: Vec3Accessor<Double>): Vec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return immutableVec3f(rx = rx, ry = ry, rz = rz)
}
