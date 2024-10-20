package dev.peytob.math.vector.vec2

import javax.annotation.processing.Generated

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructMutVec2i(
  override var x: Int,
  override var y: Int,
) : MutVec2<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 8
}
