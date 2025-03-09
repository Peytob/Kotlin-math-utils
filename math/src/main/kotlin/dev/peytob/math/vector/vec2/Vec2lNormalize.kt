package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec2l")
public fun Vec2<Long>.normalize(): Vec2<Long> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  return immutableVec2l(x = x, y = y)
}
