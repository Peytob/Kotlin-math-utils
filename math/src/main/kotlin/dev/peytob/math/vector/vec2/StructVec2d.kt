package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
internal data class StructVec2d(
  override val x: Double,
  override val y: Double,
) : Vec2<Double> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 16

  override fun toString(): String = "StructVec2d[x=$x, y=$y]"
}
