package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.Number

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public interface Vec3Accessor<T : Number> {
  public val elementSizeBytes: Int

  public val vectorSizeBytes: Int

  public val elementsCount: Int
    get() = 3

  public val x: T

  public val y: T

  public val z: T

  public operator fun component0(): T = x

  public operator fun component1(): T = y

  public operator fun component2(): T = z

  public operator fun `get`(index: Int) {
    when (index) {
      0 -> x
      1 -> y
      2 -> z
      else -> throw IndexOutOfBoundsException()
    }
  }
}
