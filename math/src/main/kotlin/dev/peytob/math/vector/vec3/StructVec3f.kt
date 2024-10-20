package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructVec3f(
  override val x: Float,
  override val y: Float,
  override val z: Float,
) : Vec3<Float> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12
}
