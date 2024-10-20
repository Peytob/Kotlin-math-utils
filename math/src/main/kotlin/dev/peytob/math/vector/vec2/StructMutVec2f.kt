package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructMutVec2f(
  override var x: Float,
  override var y: Float,
) : MutVec2<Float> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 8
}
