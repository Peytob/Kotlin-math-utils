package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec3f")
public fun Vec3<Float>.normalize(): Vec3<Float> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  val z = this.z / l
  return immutableVec3f(x = x, y = y, z = z)
}
