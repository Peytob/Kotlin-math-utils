package dev.peytob.math.vec

import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer
import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Number

/**
 * Base type for all three-components vectors. You can use aliases in your code
 */
@Generated(date = "2025-12-11")
public interface Vec3<T : Number> : Vec<T> {
  public var x: T

  public var y: T

  public var z: T
}

public interface Vec3f : Vec3<Float> {
  override fun copyMutable(): Vec3f = vec3f(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3f): Vec3f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3d): Vec3f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3i): Vec3f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3l): Vec3f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec3f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec3f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec3f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec3f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3f): Vec3f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3d): Vec3f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3i): Vec3f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3l): Vec3f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec3f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec3f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec3f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3f): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3d): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3i): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3l): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec3f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec3f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec3f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec3f

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3l): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Float): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Double): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Int): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Long): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Float,
    y: Float,
    z: Float,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Double,
    y: Double,
    z: Double,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Int,
    y: Int,
    z: Int,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Long,
    y: Long,
    z: Long,
  ): Float

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: FloatBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: DoubleBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: IntBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: LongBuffer)

  /**
   * Puts this vector into given buffer
   */
  public fun toBuffer(buffer: ByteBuffer)
}

public interface Vec3d : Vec3<Double> {
  override fun copyMutable(): Vec3d = vec3d(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3f): Vec3d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3d): Vec3d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3i): Vec3d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3l): Vec3d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec3d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec3d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec3d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec3d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3f): Vec3d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3d): Vec3d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3i): Vec3d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3l): Vec3d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec3d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec3d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec3d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3f): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3d): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3i): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3l): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec3d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec3d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec3d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec3d

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3l): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Float): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Double): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Int): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Long): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Float,
    y: Float,
    z: Float,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Double,
    y: Double,
    z: Double,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Int,
    y: Int,
    z: Int,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Long,
    y: Long,
    z: Long,
  ): Float

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: FloatBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: DoubleBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: IntBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: LongBuffer)

  /**
   * Puts this vector into given buffer
   */
  public fun toBuffer(buffer: ByteBuffer)
}

public interface Vec3i : Vec3<Int> {
  override fun copyMutable(): Vec3i = vec3i(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3f): Vec3i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3d): Vec3i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3i): Vec3i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3l): Vec3i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec3i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec3i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec3i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec3i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3f): Vec3i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3d): Vec3i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3i): Vec3i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3l): Vec3i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec3i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec3i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec3i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3f): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3d): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3i): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3l): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec3i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec3i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec3i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec3i

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3l): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Float): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Double): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Int): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Long): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Float,
    y: Float,
    z: Float,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Double,
    y: Double,
    z: Double,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Int,
    y: Int,
    z: Int,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Long,
    y: Long,
    z: Long,
  ): Float

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: FloatBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: DoubleBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: IntBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: LongBuffer)

  /**
   * Puts this vector into given buffer
   */
  public fun toBuffer(buffer: ByteBuffer)
}

public interface Vec3l : Vec3<Long> {
  override fun copyMutable(): Vec3l = vec3l(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3f): Vec3l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3d): Vec3l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3i): Vec3l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec3l): Vec3l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec3l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec3l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec3l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec3l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3f): Vec3l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3d): Vec3l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3i): Vec3l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec3l): Vec3l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec3l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec3l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec3l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3f): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3d): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3i): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec3l): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Float,
    y: Float,
    z: Float,
  ): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Double,
    y: Double,
    z: Double,
  ): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Int,
    y: Int,
    z: Int,
  ): Vec3l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(
    x: Long,
    y: Long,
    z: Long,
  ): Vec3l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec3l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec3l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec3l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec3l

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec3l): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Float): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Double): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Int): Float

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  public fun dot(right: Long): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Float,
    y: Float,
    z: Float,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Double,
    y: Double,
    z: Double,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Int,
    y: Int,
    z: Int,
  ): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(
    x: Long,
    y: Long,
    z: Long,
  ): Float

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: FloatBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: DoubleBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: IntBuffer)

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  public fun toBuffer(buffer: LongBuffer)

  /**
   * Puts this vector into given buffer
   */
  public fun toBuffer(buffer: ByteBuffer)
}
