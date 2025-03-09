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
public fun mutableVec2d(): MutVec2<Double> = StructMutVec2d(0.0, 0.0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2dd")
public fun mutableVec2d(right: Vec2Accessor<Double>): MutVec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2dd")
public fun mutableVec2d(x: Double, y: Double): MutVec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructMutVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2df")
public fun mutableVec2d(right: Vec2Accessor<Float>): MutVec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2df")
public fun mutableVec2d(x: Float, y: Float): MutVec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructMutVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2di")
public fun mutableVec2d(right: Vec2Accessor<Int>): MutVec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2di")
public fun mutableVec2d(x: Int, y: Int): MutVec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructMutVec2d(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2dl")
public fun mutableVec2d(right: Vec2Accessor<Long>): MutVec2<Double> {
  val x = right.x.toDouble()
  val y = right.y.toDouble()
  return StructMutVec2d(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2dl")
public fun mutableVec2d(x: Long, y: Long): MutVec2<Double> {
  val rx = x.toDouble()
  val ry = y.toDouble()
  return StructMutVec2d(x = rx, y = ry)
}
