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
 * Base type for all two-components vectors. You should use interfaces in your code
 */
@Generated(date = "2025-12-11")
public interface Vec2<T : Number> : Vec<T> {
  public var x: T

  public var y: T
}

public interface Vec2f : Vec2<Float> {
  override fun copyMutable(): Vec2f = vec2f(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2f): Vec2f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2d): Vec2f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2i): Vec2f

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2l): Vec2f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Float, y: Float): Vec2f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Double, y: Double): Vec2f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Int, y: Int): Vec2f

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Long, y: Long): Vec2f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec2f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec2f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec2f

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec2f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2f): Vec2f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2d): Vec2f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2i): Vec2f

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2l): Vec2f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Float, y: Float): Vec2f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Double, y: Double): Vec2f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Int, y: Int): Vec2f

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Long, y: Long): Vec2f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec2f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec2f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec2f

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2f): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2d): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2i): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2l): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Float, y: Float): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Double, y: Double): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Int, y: Int): Vec2f

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Long, y: Long): Vec2f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec2f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec2f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec2f

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec2f

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2l): Float

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
  public fun dot(x: Float, y: Float): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Double, y: Double): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Int, y: Int): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Long, y: Long): Float

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

public interface Vec2d : Vec2<Double> {
  override fun copyMutable(): Vec2d = vec2d(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2f): Vec2d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2d): Vec2d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2i): Vec2d

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2l): Vec2d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Float, y: Float): Vec2d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Double, y: Double): Vec2d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Int, y: Int): Vec2d

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Long, y: Long): Vec2d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec2d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec2d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec2d

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec2d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2f): Vec2d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2d): Vec2d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2i): Vec2d

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2l): Vec2d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Float, y: Float): Vec2d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Double, y: Double): Vec2d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Int, y: Int): Vec2d

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Long, y: Long): Vec2d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec2d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec2d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec2d

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2f): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2d): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2i): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2l): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Float, y: Float): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Double, y: Double): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Int, y: Int): Vec2d

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Long, y: Long): Vec2d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec2d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec2d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec2d

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec2d

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2l): Float

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
  public fun dot(x: Float, y: Float): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Double, y: Double): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Int, y: Int): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Long, y: Long): Float

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

public interface Vec2i : Vec2<Int> {
  override fun copyMutable(): Vec2i = vec2i(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2f): Vec2i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2d): Vec2i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2i): Vec2i

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2l): Vec2i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Float, y: Float): Vec2i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Double, y: Double): Vec2i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Int, y: Int): Vec2i

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Long, y: Long): Vec2i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec2i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec2i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec2i

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec2i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2f): Vec2i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2d): Vec2i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2i): Vec2i

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2l): Vec2i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Float, y: Float): Vec2i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Double, y: Double): Vec2i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Int, y: Int): Vec2i

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Long, y: Long): Vec2i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec2i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec2i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec2i

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2f): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2d): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2i): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2l): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Float, y: Float): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Double, y: Double): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Int, y: Int): Vec2i

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Long, y: Long): Vec2i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec2i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec2i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec2i

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec2i

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2l): Float

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
  public fun dot(x: Float, y: Float): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Double, y: Double): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Int, y: Int): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Long, y: Long): Float

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

public interface Vec2l : Vec2<Long> {
  override fun copyMutable(): Vec2l = vec2l(this)

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2f): Vec2l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2d): Vec2l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2i): Vec2l

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  public operator fun plus(right: Vec2l): Vec2l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Float, y: Float): Vec2l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Double, y: Double): Vec2l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Int, y: Int): Vec2l

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun plus(x: Long, y: Long): Vec2l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Float): Vec2l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Double): Vec2l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Int): Vec2l

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun plus(right: Long): Vec2l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2f): Vec2l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2d): Vec2l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2i): Vec2l

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  public operator fun minus(right: Vec2l): Vec2l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Float, y: Float): Vec2l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Double, y: Double): Vec2l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Int, y: Int): Vec2l

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun minus(x: Long, y: Long): Vec2l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Float): Vec2l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Double): Vec2l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Int): Vec2l

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  public operator fun minus(right: Long): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2f): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2d): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2i): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  public operator fun times(right: Vec2l): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Float, y: Float): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Double, y: Double): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Int, y: Int): Vec2l

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun times(x: Long, y: Long): Vec2l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Float): Vec2l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Double): Vec2l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Int): Vec2l

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  public operator fun times(right: Long): Vec2l

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2f): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2d): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2i): Float

  /**
   * Component-wise dot operation with vectors
   */
  public fun dot(right: Vec2l): Float

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
  public fun dot(x: Float, y: Float): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Double, y: Double): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Int, y: Int): Float

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  public fun dot(x: Long, y: Long): Float

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
