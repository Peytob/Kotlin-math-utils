package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
interface MutVec3<T : Number> : Vec3Accessor<T> {
  override var x: T

  override var y: T

  override var z: T
}

typealias MutVec3l = MutVec3<Long>

typealias MutVec3i = MutVec3<Int>

typealias MutVec3d = MutVec3<Double>

typealias MutVec3f = MutVec3<Float>
