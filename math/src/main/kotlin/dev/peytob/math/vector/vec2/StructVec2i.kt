package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructVec2i(
  override val x: Int,
  override val y: Int,
) : Vec2<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 8
}
