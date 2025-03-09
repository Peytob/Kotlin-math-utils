package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Int
import kotlin.String

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
internal data class StructMutVec3d(
  override var x: Double,
  override var y: Double,
  override var z: Double,
) : MutVec3<Double> {
  override val elementSizeBytes: Int = 8

  override val vectorSizeBytes: Int = 24

  override fun toString(): String = "StructMutVec3d[x=$x, y=$y, z=$z]"
}
