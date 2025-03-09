package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "lengthVec3i")
public fun Vec3<Int>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  s += this.z * this.z
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "lengthVec3i")
public fun length(
  x: Int,
  y: Int,
  z: Int,
): Float {
  var s = 0.0
  s += x * x
  s += y * y
  s += z * z
  return sqrt(s).toFloat()
}
