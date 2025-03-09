package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec2f")
public fun Vec2<Float>.normalize(): Vec2<Float> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  return immutableVec2f(x = x, y = y)
}
