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
public fun mutableVec2i(): MutVec2<Int> = StructMutVec2i(0, 0)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2id")
public fun mutableVec2i(right: Vec2Accessor<Double>): MutVec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2id")
public fun mutableVec2i(x: Double, y: Double): MutVec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructMutVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2if")
public fun mutableVec2i(right: Vec2Accessor<Float>): MutVec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2if")
public fun mutableVec2i(x: Float, y: Float): MutVec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructMutVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ii")
public fun mutableVec2i(right: Vec2Accessor<Int>): MutVec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2ii")
public fun mutableVec2i(x: Int, y: Int): MutVec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructMutVec2i(x = rx, y = ry)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2il")
public fun mutableVec2i(right: Vec2Accessor<Long>): MutVec2<Int> {
  val x = right.x.toInt()
  val y = right.y.toInt()
  return StructMutVec2i(x = x, y = y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "mutableVec2il")
public fun mutableVec2i(x: Long, y: Long): MutVec2<Int> {
  val rx = x.toInt()
  val ry = y.toInt()
  return StructMutVec2i(x = rx, y = ry)
}
