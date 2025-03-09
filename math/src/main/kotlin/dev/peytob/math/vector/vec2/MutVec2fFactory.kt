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
public fun mutableVec2f(): MutVec2<Float> = StructMutVec2f(0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fd")
public fun mutableVec2f(right: Vec2Accessor<Double>): MutVec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fd")
public fun mutableVec2f(x: Double, y: Double): MutVec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructMutVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ff")
public fun mutableVec2f(right: Vec2Accessor<Float>): MutVec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ff")
public fun mutableVec2f(x: Float, y: Float): MutVec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructMutVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fi")
public fun mutableVec2f(right: Vec2Accessor<Int>): MutVec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fi")
public fun mutableVec2f(x: Int, y: Int): MutVec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructMutVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fl")
public fun mutableVec2f(right: Vec2Accessor<Long>): MutVec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructMutVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2fl")
public fun mutableVec2f(x: Long, y: Long): MutVec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructMutVec2f(x = rx, y = ry)
}
