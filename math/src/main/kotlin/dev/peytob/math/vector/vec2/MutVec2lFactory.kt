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
@JvmName(name = "mutableVec2ld")
fun mutableVec2l(right: Vec2Accessor<Double>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return mutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2l(rx: Int, ry: Int): MutVec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2li")
fun mutableVec2l(right: Vec2Accessor<Int>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return mutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2lf")
fun mutableVec2l(right: Vec2Accessor<Float>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return mutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2l(rx: Long, ry: Long): MutVec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2l(rx: Float, ry: Float): MutVec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2ll")
fun mutableVec2l(right: Vec2Accessor<Long>): MutVec2<Long> {
  val rx = right.x
  val ry = right.y
  return mutableVec2l(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2l(rx: Double, ry: Double): MutVec2<Long> {
  val x = rx.toLong()
  val y = ry.toLong()
  return StructMutVec2l(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2l(): MutVec2<Long> = StructMutVec2l(0L, 0L)
