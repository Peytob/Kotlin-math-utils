package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec3i")
public fun Vec3<Int>.normalize(): Vec3<Int> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  val z = this.z / l
  return immutableVec3i(x = x, y = y, z = z)
}
