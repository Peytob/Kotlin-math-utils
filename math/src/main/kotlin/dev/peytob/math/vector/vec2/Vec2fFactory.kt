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
public fun immutableVec2f(): Vec2<Float> = StructVec2f(0f, 0f)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fd")
public fun immutableVec2f(right: Vec2Accessor<Double>): Vec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fd")
public fun immutableVec2f(x: Double, y: Double): Vec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ff")
public fun immutableVec2f(right: Vec2Accessor<Float>): Vec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ff")
public fun immutableVec2f(x: Float, y: Float): Vec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fi")
public fun immutableVec2f(right: Vec2Accessor<Int>): Vec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fi")
public fun immutableVec2f(x: Int, y: Int): Vec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructVec2f(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fl")
public fun immutableVec2f(right: Vec2Accessor<Long>): Vec2<Float> {
  val x = right.x.toFloat()
  val y = right.y.toFloat()
  return StructVec2f(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2fl")
public fun immutableVec2f(x: Long, y: Long): Vec2<Float> {
  val rx = x.toFloat()
  val ry = y.toFloat()
  return StructVec2f(x = rx, y = ry)
}
