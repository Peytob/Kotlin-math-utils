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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3fl")
fun distance(
  lx: Float,
  ly: Float,
  lz: Float,
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3fi")
fun distance(
  lx: Float,
  ly: Float,
  lz: Float,
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3li")
fun distance(
  lx: Long,
  ly: Long,
  lz: Long,
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3fd")
fun distance(
  lx: Float,
  ly: Float,
  lz: Float,
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3ld")
fun distance(
  lx: Long,
  ly: Long,
  lz: Long,
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3ii")
fun distance(
  lx: Int,
  ly: Int,
  lz: Int,
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3il")
fun distance(
  lx: Int,
  ly: Int,
  lz: Int,
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3ll")
fun distance(
  lx: Long,
  ly: Long,
  lz: Long,
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3df")
fun distance(
  lx: Double,
  ly: Double,
  lz: Double,
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3ff")
fun distance(
  lx: Float,
  ly: Float,
  lz: Float,
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3dd")
fun distance(
  lx: Double,
  ly: Double,
  lz: Double,
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
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
  date = "2025-02-17",
)
@JvmName(name = "distance3di")
fun distance(
  lx: Double,
  ly: Double,
  lz: Double,
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3if")
fun distance(
  lx: Int,
  ly: Int,
  lz: Int,
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3dl")
fun distance(
  lx: Double,
  ly: Double,
  lz: Double,
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3lf")
fun distance(
  lx: Long,
  ly: Long,
  lz: Long,
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "distance3id")
fun distance(
  lx: Int,
  ly: Int,
  lz: Int,
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  var s = 0.0
  s += (lx - rx) * (lx - rx)
  s += (ly - ry) * (ly - ry)
  s += (lz - rz) * (lz - rz)
  return sqrt(s).toFloat()
}
