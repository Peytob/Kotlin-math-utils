package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2024-10-20",
)
interface Vec2Accessor<T : Number> {
  val elementSizeBytes: Int

  val vectorSizeBytes: Int

  val elementsCount: Int
    get() = 2

  val x: T

  val y: T

  operator fun component0(): T = x

  operator fun component1(): T = y

  operator fun `get`(index: Int) {
    when (index) {
      0 -> x
      1 -> y
      else -> throw IndexOutOfBoundsException()
    }
  }
}
