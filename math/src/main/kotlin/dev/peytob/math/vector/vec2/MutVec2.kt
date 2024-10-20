package dev.peytob.math.vector.vec2

import javax.annotation.processing.Generated

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
interface MutVec2<T : Number> : Vec2Accessor<T> {
  override var x: T

  override var y: T
}
