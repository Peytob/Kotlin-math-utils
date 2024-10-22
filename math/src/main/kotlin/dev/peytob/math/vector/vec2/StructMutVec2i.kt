package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
internal data class StructMutVec2i(
  override var x: Int,
  override var y: Int,
) : MutVec2<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 8

  override fun toString(): String = "StructMutVec2i[x=$x, y=$y]"
}
