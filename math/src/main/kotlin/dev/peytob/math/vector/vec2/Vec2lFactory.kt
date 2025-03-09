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
public fun immutableVec2l(): Vec2<Long> = StructVec2l(0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ld")
public fun immutableVec2l(right: Vec2Accessor<Double>): Vec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ld")
public fun immutableVec2l(x: Double, y: Double): Vec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2lf")
public fun immutableVec2l(right: Vec2Accessor<Float>): Vec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2lf")
public fun immutableVec2l(x: Float, y: Float): Vec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2li")
public fun immutableVec2l(right: Vec2Accessor<Int>): Vec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2li")
public fun immutableVec2l(x: Int, y: Int): Vec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructVec2l(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ll")
public fun immutableVec2l(right: Vec2Accessor<Long>): Vec2<Long> {
  val x = right.x.toLong()
  val y = right.y.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ll")
public fun immutableVec2l(x: Long, y: Long): Vec2<Long> {
  val rx = x.toLong()
  val ry = y.toLong()
  return StructVec2l(x = rx, y = ry)
}
