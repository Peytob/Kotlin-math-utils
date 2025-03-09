package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public interface MutVec3<T : Number> : Vec3Accessor<T> {
  override var x: T

  override var y: T

  override var z: T
}

public typealias MutVec3d = MutVec3<Double>

public typealias MutVec3f = MutVec3<Float>

public typealias MutVec3i = MutVec3<Int>

public typealias MutVec3l = MutVec3<Long>
