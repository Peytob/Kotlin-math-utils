package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Long
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
internal data class StructVec3l(
  override val x: Long,
  override val y: Long,
  override val z: Long,
) : Vec3<Long> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 24

  override fun toString(): String = "StructVec3l[x=$x, y=$y, z=$z]"
}
