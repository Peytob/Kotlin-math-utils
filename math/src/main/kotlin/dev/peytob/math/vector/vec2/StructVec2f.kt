package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
internal data class StructVec2f(
  override val x: Float,
  override val y: Float,
) : Vec2<Float> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 8

  override fun toString(): String = "StructVec2f[x=$x, y=$y]"
}
