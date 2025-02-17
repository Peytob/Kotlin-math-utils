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
@JvmName(name = "mutableVec3ff")
fun mutableVec3f(right: Vec3Accessor<Float>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "mutableVec3fd")
fun mutableVec3f(right: Vec3Accessor<Double>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "mutableVec3fl")
fun mutableVec3f(right: Vec3Accessor<Long>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "mutableVec3fi")
fun mutableVec3f(right: Vec3Accessor<Int>): MutVec3<Float> {
  val rx = right.x
  val ry = right.y
  val rz = right.z
  return mutableVec3f(rx = rx, ry = ry, rz = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun mutableVec3f(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun mutableVec3f(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun mutableVec3f(): MutVec3<Float> = StructMutVec3f(0f, 0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun mutableVec3f(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun mutableVec3f(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  val z = rz.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}
