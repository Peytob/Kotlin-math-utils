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
public fun immutableVec3f(): Vec3<Float> = StructVec3f(0f, 0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fd")
public fun immutableVec3f(right: Vec3Accessor<Double>): Vec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fd")
public fun immutableVec3f(
  x: Double,
  y: Double,
  z: Double,
): Vec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3ff")
public fun immutableVec3f(right: Vec3Accessor<Float>): Vec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3ff")
public fun immutableVec3f(
  x: Float,
  y: Float,
  z: Float,
): Vec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fi")
public fun immutableVec3f(right: Vec3Accessor<Int>): Vec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fi")
public fun immutableVec3f(
  x: Int,
  y: Int,
  z: Int,
): Vec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructVec3f(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fl")
public fun immutableVec3f(right: Vec3Accessor<Long>): Vec3<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  val z = right.z.toFloat()
  return StructVec3f(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3fl")
public fun immutableVec3f(
  x: Long,
  y: Long,
  z: Long,
): Vec3<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  val rz = z.toFloat()
  return StructVec3f(x = rx, y = ry, z = rz)
}
