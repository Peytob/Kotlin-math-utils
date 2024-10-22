package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
interface Vec3<T : Number> : Vec3Accessor<T>

typealias Vec3i = Vec3<Int>

typealias Vec3d = Vec3<Double>

typealias Vec3l = Vec3<Long>

typealias Vec3f = Vec3<Float>
