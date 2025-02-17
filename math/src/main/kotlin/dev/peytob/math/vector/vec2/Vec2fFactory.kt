package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec2f(rx: Float, ry: Float): Vec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec2f(rx: Int, ry: Int): Vec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec2fd")
fun immutableVec2f(right: Vec2Accessor<Double>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return immutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec2fl")
fun immutableVec2f(right: Vec2Accessor<Long>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return immutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec2fi")
fun immutableVec2f(right: Vec2Accessor<Int>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return immutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec2f(rx: Double, ry: Double): Vec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "immutableVec2ff")
fun immutableVec2f(right: Vec2Accessor<Float>): Vec2<Float> {
  val rx = right.x
  val ry = right.y
  return immutableVec2f(rx = rx, ry = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec2f(rx: Long, ry: Long): Vec2<Float> {
  val x = rx.toFloat()
  val y = ry.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
fun immutableVec2f(): Vec2<Float> = StructVec2f(0f, 0f)
