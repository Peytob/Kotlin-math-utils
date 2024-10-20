package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3di")
fun distance(left: Vec3Accessor<Double>, right: Vec3Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3ff")
fun distance(left: Vec3Accessor<Float>, right: Vec3Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3fi")
fun distance(left: Vec3Accessor<Float>, right: Vec3Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3dl")
fun distance(left: Vec3Accessor<Double>, right: Vec3Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3li")
fun distance(left: Vec3Accessor<Long>, right: Vec3Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3df")
fun distance(left: Vec3Accessor<Double>, right: Vec3Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3ii")
fun distance(left: Vec3Accessor<Int>, right: Vec3Accessor<Int>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "length3i")
fun Vec3Accessor<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3ld")
fun distance(left: Vec3Accessor<Long>, right: Vec3Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3id")
fun distance(left: Vec3Accessor<Int>, right: Vec3Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3if")
fun distance(left: Vec3Accessor<Int>, right: Vec3Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3ll")
fun distance(left: Vec3Accessor<Long>, right: Vec3Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3dd")
fun distance(left: Vec3Accessor<Double>, right: Vec3Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3lf")
fun distance(left: Vec3Accessor<Long>, right: Vec3Accessor<Float>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3fd")
fun distance(left: Vec3Accessor<Float>, right: Vec3Accessor<Double>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3fl")
fun distance(left: Vec3Accessor<Float>, right: Vec3Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "distance3il")
fun distance(left: Vec3Accessor<Int>, right: Vec3Accessor<Long>): Float {
  var s = 0.0
  s += (left.x - right.x) * (left.x - right.x)
  s += (left.y - right.y) * (left.y - right.y)
  s += (left.z - right.z) * (left.z - right.z)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "length3f")
fun Vec3Accessor<Float>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "length3d")
fun Vec3Accessor<Double>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
@JvmName(name = "length3l")
fun Vec3Accessor<Long>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}
