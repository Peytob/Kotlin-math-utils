package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-22",
)
interface Vec3Accessor<T : Number> {
  val elementSizeBytes: Int

  val vectorSizeBytes: Int

  val elementsCount: Int
    get() = 3

  val x: T

  val y: T

  val z: T

  operator fun component0(): T = x

  operator fun component1(): T = y

  operator fun component2(): T = z

  operator fun `get`(index: Int) {
    when (index) {
      0 -> x
      1 -> y
      2 -> z
      else -> throw IndexOutOfBoundsException()
    }
  }
}
