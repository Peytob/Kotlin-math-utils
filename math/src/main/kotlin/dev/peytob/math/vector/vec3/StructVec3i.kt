package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
internal data class StructVec3i(
  override val x: Int,
  override val y: Int,
  override val z: Int,
) : Vec3<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12
}
