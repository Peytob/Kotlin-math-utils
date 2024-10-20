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
fun immutableVec2d(rx: Double, ry: Double): Vec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2dl")
fun immutableVec2d(right: Vec2Accessor<Long>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return immutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2d(rx: Long, ry: Long): Vec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2d(): Vec2<Double> = StructVec2d(0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2di")
fun immutableVec2d(right: Vec2Accessor<Int>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return immutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2dd")
fun immutableVec2d(right: Vec2Accessor<Double>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return immutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2d(rx: Int, ry: Int): Vec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "immutableVec2df")
fun immutableVec2d(right: Vec2Accessor<Float>): Vec2<Double> {
  val rx = right.x
  val ry = right.y
  return immutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun immutableVec2d(rx: Float, ry: Float): Vec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructVec2d(x = x, y = y)
}
