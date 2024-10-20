package dev.peytob.math.vector.vec2

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
@JvmName(name = "immutableVec2ld")
fun immutableVec2l(right: Vec2Accessor<Double>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return immutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2lf")
fun immutableVec2l(right: Vec2Accessor<Float>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return immutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2l(): Vec2<Long> = StructVec2l(0L, 0L)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2li")
fun immutableVec2l(right: Vec2Accessor<Int>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return immutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2l(rx: Long, ry: Long): Vec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2l(rx: Float, ry: Float): Vec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2l(rx: Double, ry: Double): Vec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2ll")
fun immutableVec2l(right: Vec2Accessor<Long>): Vec2<Long> {
  val rx = right.x
  val ry = right.y
  return immutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2l(rx: Int, ry: Int): Vec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructVec2l(x = x, y = y)
}
