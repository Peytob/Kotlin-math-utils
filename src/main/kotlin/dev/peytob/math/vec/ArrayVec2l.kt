package dev.peytob.math.vec

import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer
import javax.`annotation`.processing.Generated
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

@Generated(date = "2025-12-11")
internal class ArrayVec2l internal constructor(
  public val arr: LongArray,
  public val arrIndex: Int,
) : Vec2l {
  override val mutable: Boolean = true

  override val elementSize: Int
    get() = 8

  override val elementCount: Int
    get() = 2

  override val objectSize: Int
    get() = 16

  override var x: Long
    get() = arr[arrIndex + 0]
    set(`value`) {
      arr[arrIndex + 0] = value
    }

  override var y: Long
    get() = arr[arrIndex + 1]
    set(`value`) {
      arr[arrIndex + 1] = value
    }

  override operator fun `get`(i: Int): Long = when (i) {
    0 -> x
    1 -> y
    else -> throw ArrayIndexOutOfBoundsException()
  }

  override operator fun `set`(i: Int, `value`: Long) {
    when (i) {
      0 -> x
      1 -> y
      else -> throw ArrayIndexOutOfBoundsException()
    }
  }

  override fun toString(): String = "Vec2[$x, $y]"

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec2f): ArrayVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec2d): ArrayVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec2i): ArrayVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec2l): ArrayVec2l {
    this.x = (this.x + right.x).toLong()
    this.y = (this.y + right.y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(x: Float, y: Float): ArrayVec2l {
    this.x = (this.x + x).toLong()
    this.y = (this.y + y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(x: Double, y: Double): ArrayVec2l {
    this.x = (this.x + x).toLong()
    this.y = (this.y + y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(x: Int, y: Int): ArrayVec2l {
    this.x = (this.x + x).toLong()
    this.y = (this.y + y).toLong()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(x: Long, y: Long): ArrayVec2l {
    this.x = (this.x + x).toLong()
    this.y = (this.y + y).toLong()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Float): ArrayVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Double): ArrayVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Int): ArrayVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Long): ArrayVec2l {
    this.x = (this.x + right).toLong()
    this.y = (this.y + right).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec2f): ArrayVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec2d): ArrayVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec2i): ArrayVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec2l): ArrayVec2l {
    this.x = (this.x - right.x).toLong()
    this.y = (this.y - right.y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(x: Float, y: Float): ArrayVec2l {
    this.x = (this.x - x).toLong()
    this.y = (this.y - y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(x: Double, y: Double): ArrayVec2l {
    this.x = (this.x - x).toLong()
    this.y = (this.y - y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(x: Int, y: Int): ArrayVec2l {
    this.x = (this.x - x).toLong()
    this.y = (this.y - y).toLong()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(x: Long, y: Long): ArrayVec2l {
    this.x = (this.x - x).toLong()
    this.y = (this.y - y).toLong()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Float): ArrayVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Double): ArrayVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Int): ArrayVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Long): ArrayVec2l {
    this.x = (this.x - right).toLong()
    this.y = (this.y - right).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec2f): ArrayVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec2d): ArrayVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec2i): ArrayVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec2l): ArrayVec2l {
    this.x = (this.x * right.x).toLong()
    this.y = (this.y * right.y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(x: Float, y: Float): ArrayVec2l {
    this.x = (this.x * x).toLong()
    this.y = (this.y * y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(x: Double, y: Double): ArrayVec2l {
    this.x = (this.x * x).toLong()
    this.y = (this.y * y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(x: Int, y: Int): ArrayVec2l {
    this.x = (this.x * x).toLong()
    this.y = (this.y * y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(x: Long, y: Long): ArrayVec2l {
    this.x = (this.x * x).toLong()
    this.y = (this.y * y).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Float): ArrayVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Double): ArrayVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Int): ArrayVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Long): ArrayVec2l {
    this.x = (this.x * right).toLong()
    this.y = (this.y * right).toLong()
    return this
  }

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec2f): Float = (x * right.x + y * right.y).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Float): Float = (x * right + y * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Double): Float = (x * right + y * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Int): Float = (x * right + y * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Long): Float = (x * right + y * right).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(x: Float, y: Float): Float = (x * x + y * y).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(x: Double, y: Double): Float = (x * x + y * y).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(x: Int, y: Int): Float = (x * x + y * y).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(x: Long, y: Long): Float = (x * x + y * y).toFloat()

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: FloatBuffer) {
    buffer.put(x.toFloat())
    buffer.put(y.toFloat())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: DoubleBuffer) {
    buffer.put(x.toDouble())
    buffer.put(y.toDouble())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: IntBuffer) {
    buffer.put(x.toInt())
    buffer.put(y.toInt())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: LongBuffer) {
    buffer.put(x.toLong())
    buffer.put(y.toLong())
  }

  /**
   * Puts this vector into given buffer
   */
  override fun toBuffer(buffer: ByteBuffer) {
    buffer.putLong(x)
    buffer.putLong(y)
  }
}
