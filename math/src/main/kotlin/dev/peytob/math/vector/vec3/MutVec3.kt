package dev.peytob.math.vector.vec3

import javax.annotation.processing.Generated

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
interface MutVec3<T : Number> : Vec3Accessor<T> {
  override var x: T

  override var y: T

  override var z: T
}
