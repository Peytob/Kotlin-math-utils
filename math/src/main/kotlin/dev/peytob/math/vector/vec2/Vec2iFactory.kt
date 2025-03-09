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
public fun immutableVec2i(): Vec2<Int> = StructVec2i(0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2id")
public fun immutableVec2i(right: Vec2Accessor<Double>): Vec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2id")
public fun immutableVec2i(x: Double, y: Double): Vec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2if")
public fun immutableVec2i(right: Vec2Accessor<Float>): Vec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2if")
public fun immutableVec2i(x: Float, y: Float): Vec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ii")
public fun immutableVec2i(right: Vec2Accessor<Int>): Vec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2ii")
public fun immutableVec2i(x: Int, y: Int): Vec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2il")
public fun immutableVec2i(right: Vec2Accessor<Long>): Vec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "immutableVec2il")
public fun immutableVec2i(x: Long, y: Long): Vec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructVec2i(x = rx, y = ry)
}
