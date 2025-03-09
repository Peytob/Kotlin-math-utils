package dev.peytob.math.vector.vec2

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
public fun mutableVec2l(): MutVec2<Long> = StructMutVec2l(0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ld")
public fun mutableVec2l(right: Vec2Accessor<Double>): MutVec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ld")
public fun mutableVec2l(x: Double, y: Double): MutVec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructMutVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2lf")
public fun mutableVec2l(right: Vec2Accessor<Float>): MutVec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2lf")
public fun mutableVec2l(x: Float, y: Float): MutVec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructMutVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2li")
public fun mutableVec2l(right: Vec2Accessor<Int>): MutVec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2li")
public fun mutableVec2l(x: Int, y: Int): MutVec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructMutVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ll")
public fun mutableVec2l(right: Vec2Accessor<Long>): MutVec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ll")
public fun mutableVec2l(x: Long, y: Long): MutVec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructMutVec2l(x = rx, y = ry)
}
