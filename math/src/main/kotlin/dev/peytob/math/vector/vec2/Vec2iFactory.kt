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
@JvmName(name = "immutableVec2ii")
fun immutableVec2i(right: Vec2Accessor<Int>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return immutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2i(rx: Int, ry: Int): Vec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2i(): Vec2<Int> = StructVec2i(0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2i(rx: Double, ry: Double): Vec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2if")
fun immutableVec2i(right: Vec2Accessor<Float>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return immutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2id")
fun immutableVec2i(right: Vec2Accessor<Double>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return immutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2il")
fun immutableVec2i(right: Vec2Accessor<Long>): Vec2<Int> {
  val rx = right.x
  val ry = right.y
  return immutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2i(rx: Long, ry: Long): Vec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2i(rx: Float, ry: Float): Vec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructVec2i(x = x, y = y)
}
