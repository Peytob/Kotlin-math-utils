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
public fun mutableVec3i(): MutVec3<Int> = StructMutVec3i(0, 0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3id")
public fun mutableVec3i(right: Vec3Accessor<Double>): MutVec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3id")
public fun mutableVec3i(
  x: Double,
  y: Double,
  z: Double,
): MutVec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructMutVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3if")
public fun mutableVec3i(right: Vec3Accessor<Float>): MutVec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3if")
public fun mutableVec3i(
  x: Float,
  y: Float,
  z: Float,
): MutVec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructMutVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ii")
public fun mutableVec3i(right: Vec3Accessor<Int>): MutVec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ii")
public fun mutableVec3i(
  x: Int,
  y: Int,
  z: Int,
): MutVec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructMutVec3i(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3il")
public fun mutableVec3i(right: Vec3Accessor<Long>): MutVec3<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  val z = right.z.toInt()
  return StructMutVec3i(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3il")
public fun mutableVec3i(
  x: Long,
  y: Long,
  z: Long,
): MutVec3<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  val rz = z.toInt()
  return StructMutVec3i(x = rx, y = ry, z = rz)
}
