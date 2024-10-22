package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2d(rx: Float, ry: Float): MutVec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2df")
fun mutableVec2d(right: Vec2Accessor<Float>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return mutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2di")
fun mutableVec2d(right: Vec2Accessor<Int>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return mutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2dl")
fun mutableVec2d(right: Vec2Accessor<Long>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return mutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2d(): MutVec2<Double> = StructMutVec2d(0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2d(rx: Double, ry: Double): MutVec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2dd")
fun mutableVec2d(right: Vec2Accessor<Double>): MutVec2<Double> {
  val rx = right.x
  val ry = right.y
  return mutableVec2d(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2d(rx: Long, ry: Long): MutVec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2d(rx: Int, ry: Int): MutVec2<Double> {
  val x = rx.toDouble()
  val y = ry.toDouble()
  return StructMutVec2d(x = x, y = y)
}
