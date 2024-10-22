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
@JvmName(name = "mutableVec2ff")
fun mutableVec2f(right: Vec2Accessor<Float>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return mutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2fd")
fun mutableVec2f(right: Vec2Accessor<Double>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return mutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2fl")
fun mutableVec2f(right: Vec2Accessor<Long>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return mutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2f(rx: Int, ry: Int): MutVec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2f(): MutVec2<Float> = StructMutVec2f(0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "mutableVec2fi")
fun mutableVec2f(right: Vec2Accessor<Int>): MutVec2<Float> {
  val rx = right.x
  val ry = right.y
  return mutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2f(rx: Float, ry: Float): MutVec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2f(rx: Long, ry: Long): MutVec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
fun mutableVec2f(rx: Double, ry: Double): MutVec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructMutVec2f(x = x, y = y)
}
