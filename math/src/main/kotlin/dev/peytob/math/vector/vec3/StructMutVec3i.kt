package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructMutVec3i(
  override var x: Int,
  override var y: Int,
  override var z: Int,
) : MutVec3<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12
}
