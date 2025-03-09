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
public fun immutableVec3i(): Vec3<Int> = StructVec3i(0, 0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3id")
public fun immutableVec3i(right: Vec3Accessor<Double>): Vec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3id")
public fun immutableVec3i(
  x: Double,
  y: Double,
  z: Double,
): Vec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3if")
public fun immutableVec3i(right: Vec3Accessor<Float>): Vec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3if")
public fun immutableVec3i(
  x: Float,
  y: Float,
  z: Float,
): Vec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3ii")
public fun immutableVec3i(right: Vec3Accessor<Int>): Vec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3ii")
public fun immutableVec3i(
  x: Int,
  y: Int,
  z: Int,
): Vec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3il")
public fun immutableVec3i(right: Vec3Accessor<Long>): Vec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec3il")
public fun immutableVec3i(
  x: Long,
  y: Long,
  z: Long,
): Vec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructVec3i(x = rx, y = ry, z = rz)
}
