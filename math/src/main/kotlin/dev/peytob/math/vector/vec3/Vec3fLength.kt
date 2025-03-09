package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "lengthVec3f")
public fun Vec3<Float>.length(): Float {
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
@JvmName(name = "lengthVec3f")
public fun length(
  x: Float,
  y: Float,
  z: Float,
): Float {
  var s = 0.0
  s += x * x
  s += y * y
  s += z * z
  return sqrt(s).toFloat()
}
