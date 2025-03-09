package dev.peytob.math.vector.vec2

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public interface Vec2Accessor<T : Number> {
  public val elementSizeBytes: Int

  public val vectorSizeBytes: Int

  public val elementsCount: Int
    get() = 2

  public val x: T

  public val y: T

  public operator fun component0(): T = x

  public operator fun component1(): T = y

  public operator fun `get`(index: Int) {
    when (index) {
      0 -> x
      1 -> y
      else -> throw IndexOutOfBoundsException()
    }
  }
}
