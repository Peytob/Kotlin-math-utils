package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal class StructMutVec3f(
  override var x: Float,
  override var y: Float,
  override var z: Float,
) : MutVec3<Float> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12
}
