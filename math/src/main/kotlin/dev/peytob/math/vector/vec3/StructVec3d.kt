package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructVec3d(
  override val x: Double,
  override val y: Double,
  override val z: Double,
) : Vec3<Double> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 24
}
