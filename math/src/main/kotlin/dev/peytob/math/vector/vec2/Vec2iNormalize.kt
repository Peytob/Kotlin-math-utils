package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "normalizeVec2i")
public fun Vec2<Int>.normalize(): Vec2<Int> {
  var l = this.length()
  val x = this.x / l
  val y = this.y / l
  return immutableVec2i(x = x, y = y)
}
