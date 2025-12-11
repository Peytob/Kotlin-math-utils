package dev.peytob.math

import javax.`annotation`.processing.Generated
import kotlin.Int

/**
 * Describes flat memory object
 */
@Generated(date = "2025-12-11")
public interface MemorizedObject {
  /**
   * Returns size of object one element in bytes
   */
  public val elementSize: Int

  /**
   * Returns count of object elements
   */
  public val elementCount: Int

  /**
   * Returns total size of object in bytes
   */
  public val objectSize: Int
}
