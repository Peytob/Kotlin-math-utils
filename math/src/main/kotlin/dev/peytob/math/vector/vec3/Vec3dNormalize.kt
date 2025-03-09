package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec3d")
public fun Vec3<Double>.normalize(): Vec3<Double> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  val z = this.z / l
  return immutableVec3d(x = x, y = y, z = z)
}
