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
public fun mutableVec3l(): MutVec3<Long> = StructMutVec3l(0L, 0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ld")
public fun mutableVec3l(right: Vec3Accessor<Double>): MutVec3<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  val z = right.z.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ld")
public fun mutableVec3l(
  x: Double,
  y: Double,
  z: Double,
): MutVec3<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  val rz = z.toLong()
  return StructMutVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3lf")
public fun mutableVec3l(right: Vec3Accessor<Float>): MutVec3<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  val z = right.z.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3lf")
public fun mutableVec3l(
  x: Float,
  y: Float,
  z: Float,
): MutVec3<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  val rz = z.toLong()
  return StructMutVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3li")
public fun mutableVec3l(right: Vec3Accessor<Int>): MutVec3<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  val z = right.z.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3li")
public fun mutableVec3l(
  x: Int,
  y: Int,
  z: Int,
): MutVec3<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  val rz = z.toLong()
  return StructMutVec3l(x = rx, y = ry, z = rz)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ll")
public fun mutableVec3l(right: Vec3Accessor<Long>): MutVec3<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  val z = right.z.toLong()
  return StructMutVec3l(x = x, y = y, z = z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec3ll")
public fun mutableVec3l(
  x: Long,
  y: Long,
  z: Long,
): MutVec3<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  val rz = z.toLong()
  return StructMutVec3l(x = rx, y = ry, z = rz)
}
