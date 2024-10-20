package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
interface MutVec2<T : Number> : Vec2Accessor<T> {
  override var x: T

  override var y: T
}

typealias MutVec2f = MutVec2<Float>

typealias MutVec2d = MutVec2<Double>

typealias MutVec2i = MutVec2<Int>

typealias MutVec2l = MutVec2<Long>
