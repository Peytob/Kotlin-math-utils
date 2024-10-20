package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Long

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructMutVec2l(
  override var x: Long,
  override var y: Long,
) : MutVec2<Long> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 16
}
