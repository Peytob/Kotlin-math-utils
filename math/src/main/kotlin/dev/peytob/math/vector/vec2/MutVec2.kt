package dev.peytob.math.vector.vec2

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
public interface MutVec2<T : Number> : Vec2Accessor<T> {
  override var x: T

  override var y: T
}

public typealias MutVec2d = MutVec2<Double>

public typealias MutVec2f = MutVec2<Float>

public typealias MutVec2i = MutVec2<Int>

public typealias MutVec2l = MutVec2<Long>
