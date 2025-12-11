package dev.peytob.math.vec

import dev.peytob.math.MemorizedObject
import javax.`annotation`.processing.Generated
import kotlin.Boolean
import kotlin.Int
import kotlin.Number

/**
 * Base type for all vectors. You should use special-cases vectors in most cases
 */
@Generated(date = "2025-12-11")
public interface Vec<T : Number> : MemorizedObject {
  public val mutable: Boolean

  public operator fun `get`(i: Int): T

  public operator fun `set`(i: Int, `value`: T)

  /**
   * Creates mutable copy of this vector. Copy will be saved in separated structure
   */
  public fun copyMutable(): Vec<T>

  /**
   * Creates immutable copy of this vector. Copy will be saved in separated structure
   */
  public fun copyImmutable(): Vec<T> {
    TODO("Immutable vectors are not implemented yet")
  }
}
