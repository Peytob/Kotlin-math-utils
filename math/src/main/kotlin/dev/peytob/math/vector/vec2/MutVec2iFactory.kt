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
@JvmName(name = "mutableVec2id")
fun mutableVec2i(right: Vec2Accessor<Double>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return mutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2il")
fun mutableVec2i(right: Vec2Accessor<Long>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return mutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2i(): MutVec2<Int> = StructMutVec2i(0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2i(rx: Float, ry: Float): MutVec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2if")
fun mutableVec2i(right: Vec2Accessor<Float>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return mutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2i(rx: Long, ry: Long): MutVec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "mutableVec2ii")
fun mutableVec2i(right: Vec2Accessor<Int>): MutVec2<Int> {
  val rx = right.x
  val ry = right.y
  return mutableVec2i(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2i(rx: Double, ry: Double): MutVec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
fun mutableVec2i(rx: Int, ry: Int): MutVec2<Int> {
  val x = rx.toInt()
  val y = ry.toInt()
  return StructMutVec2i(x = x, y = y)
}
