package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
internal data class StructVec3i(
  override val x: Int,
  override val y: Int,
  override val z: Int,
) : Vec3<Int> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12

  override fun toString(): String = "StructVec3i[x=$x, y=$y, z=$z]"
}
