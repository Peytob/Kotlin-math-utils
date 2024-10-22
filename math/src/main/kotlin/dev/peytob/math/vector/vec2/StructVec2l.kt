package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Long
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
internal data class StructVec2l(
  override val x: Long,
  override val y: Long,
) : Vec2<Long> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 16

  override fun toString(): String = "StructVec2l[x=$x, y=$y]"
}
