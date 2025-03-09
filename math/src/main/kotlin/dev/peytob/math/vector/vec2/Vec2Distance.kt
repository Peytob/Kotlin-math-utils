package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2d")
public fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2d")
public fun distance(
  lx: Double,
  ly: Double,
  rx: Double,
  ry: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2f")
public fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2f")
public fun distance(
  lx: Double,
  ly: Double,
  rx: Float,
  ry: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2i")
public fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2i")
public fun distance(
  lx: Double,
  ly: Double,
  rx: Int,
  ry: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2l")
public fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2dVec2l")
public fun distance(
  lx: Double,
  ly: Double,
  rx: Long,
  ry: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2d")
public fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2d")
public fun distance(
  lx: Float,
  ly: Float,
  rx: Double,
  ry: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2f")
public fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2f")
public fun distance(
  lx: Float,
  ly: Float,
  rx: Float,
  ry: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2i")
public fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2i")
public fun distance(
  lx: Float,
  ly: Float,
  rx: Int,
  ry: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2l")
public fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2fVec2l")
public fun distance(
  lx: Float,
  ly: Float,
  rx: Long,
  ry: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2d")
public fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2d")
public fun distance(
  lx: Int,
  ly: Int,
  rx: Double,
  ry: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2f")
public fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2f")
public fun distance(
  lx: Int,
  ly: Int,
  rx: Float,
  ry: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2i")
public fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2i")
public fun distance(
  lx: Int,
  ly: Int,
  rx: Int,
  ry: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2l")
public fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2iVec2l")
public fun distance(
  lx: Int,
  ly: Int,
  rx: Long,
  ry: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2d")
public fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2d")
public fun distance(
  lx: Long,
  ly: Long,
  rx: Double,
  ry: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2f")
public fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2f")
public fun distance(
  lx: Long,
  ly: Long,
  rx: Float,
  ry: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2i")
public fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2i")
public fun distance(
  lx: Long,
  ly: Long,
  rx: Int,
  ry: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2l")
public fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "distanceVec2lVec2l")
public fun distance(
  lx: Long,
  ly: Long,
  rx: Long,
  ry: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  return sqrt(s).toFloat()
}
