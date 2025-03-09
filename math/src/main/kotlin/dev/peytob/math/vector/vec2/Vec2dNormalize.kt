package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec2d")
public fun Vec2<Double>.normalize(): Vec2<Double> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  return immutableVec2d(x = x, y = y)
}
