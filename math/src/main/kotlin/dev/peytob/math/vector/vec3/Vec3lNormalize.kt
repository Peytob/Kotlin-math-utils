package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec3l")
public fun Vec3<Long>.normalize(): Vec3<Long> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  val z = this.z / l
  return immutableVec3l(x = x, y = y, z = z)
}
