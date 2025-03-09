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
public fun immutableVec2d(): Vec2<Double> = StructVec2d(0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2dd")
public fun immutableVec2d(right: Vec2Accessor<Double>): Vec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2dd")
public fun immutableVec2d(x: Double, y: Double): Vec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2df")
public fun immutableVec2d(right: Vec2Accessor<Float>): Vec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2df")
public fun immutableVec2d(x: Float, y: Float): Vec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2di")
public fun immutableVec2d(right: Vec2Accessor<Int>): Vec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2di")
public fun immutableVec2d(x: Int, y: Int): Vec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2dl")
public fun immutableVec2d(right: Vec2Accessor<Long>): Vec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2dl")
public fun immutableVec2d(x: Long, y: Long): Vec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructVec2d(x = rx, y = ry)
}
