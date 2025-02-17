package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Long
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
internal data class StructMutVec3l(
  override var x: Long,
  override var y: Long,
  override var z: Long,
) : MutVec3<Long> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 24

  override fun toString(): String = "StructMutVec3l[x=$x, y=$y, z=$z]"
}
