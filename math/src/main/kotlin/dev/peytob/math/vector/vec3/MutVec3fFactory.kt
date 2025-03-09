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
public fun mutableVec3f(): MutVec3<Float> = StructMutVec3f(0f, 0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fd")
public fun mutableVec3f(right: Vec3Accessor<Double>): MutVec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fd")
public fun mutableVec3f(
  x: Double,
  y: Double,
  z: Double,
): MutVec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructMutVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ff")
public fun mutableVec3f(right: Vec3Accessor<Float>): MutVec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ff")
public fun mutableVec3f(
  x: Float,
  y: Float,
  z: Float,
): MutVec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructMutVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fi")
public fun mutableVec3f(right: Vec3Accessor<Int>): MutVec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fi")
public fun mutableVec3f(
  x: Int,
  y: Int,
  z: Int,
): MutVec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructMutVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fl")
public fun mutableVec3f(right: Vec3Accessor<Long>): MutVec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructMutVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3fl")
public fun mutableVec3f(
  x: Long,
  y: Long,
  z: Long,
): MutVec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructMutVec3f(x = rx, y = ry, z = rz)
}
