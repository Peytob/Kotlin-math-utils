package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Float
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
internal data class StructMutVec3f(
  override var x: Float,
  override var y: Float,
  override var z: Float,
) : MutVec3<Float> {
  override val elementSizeBytes: Int = 4

  override val vectorSizeBytes: Int = 12

  override fun toString(): String = "StructMutVec3f[x=$x, y=$y, z=$z]"
}
