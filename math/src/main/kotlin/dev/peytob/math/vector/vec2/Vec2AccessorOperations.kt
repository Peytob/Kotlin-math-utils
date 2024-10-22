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
  date = "2024-10-22",
)
@JvmName(name = "length2d")
fun Vec2Accessor<Double>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "length2f")
fun Vec2Accessor<Float>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2dl")
fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2fl")
fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2ll")
fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2li")
fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2dd")
fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2ff")
fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2lf")
fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "length2i")
fun Vec2Accessor<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "length2l")
fun Vec2Accessor<Long>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2if")
fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2fd")
fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2di")
fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2il")
fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2id")
fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2fi")
fun distance(left: Vec2Accessor<Float>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2ld")
fun distance(left: Vec2Accessor<Long>, right: Vec2Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2df")
fun distance(left: Vec2Accessor<Double>, right: Vec2Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
@JvmName(name = "distance2ii")
fun distance(left: Vec2Accessor<Int>, right: Vec2Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  return sqrt(s).toFloat()
}
