package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Long
import kotlin.jvm.JvmName
import kotlin.math.sqrt

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "lengthVec2l")
public fun Vec2<Long>.length(): Float {
  var s = 0.0
  s += this.x * this.x
  s += this.y * this.y
  return sqrt(s).toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "lengthVec2l")
public fun length(x: Long, y: Long): Float {
  var s = 0.0
  s += x * x
  s += y * y
  return sqrt(s).toFloat()
}
