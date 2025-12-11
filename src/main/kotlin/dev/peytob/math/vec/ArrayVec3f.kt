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
import kotlin.FloatArray
import kotlin.Int
import kotlin.Long
import kotlin.String

@Generated(date = "2025-12-11")
internal class ArrayVec3f internal constructor(
  public val arr: FloatArray,
  public val arrIndex: Int,
) : Vec3f {
  override val mutable: Boolean = true

  override val elementSize: Int
    get() = 4

  override val elementCount: Int
    get() = 3

  override val objectSize: Int
    get() = 12

  override var x: Float
    get() = arr[arrIndex + 0]
    set(`value`) {
      arr[arrIndex + 0] = value
    }

  override var y: Float
    get() = arr[arrIndex + 1]
    set(`value`) {
      arr[arrIndex + 1] = value
    }

  override var z: Float
    get() = arr[arrIndex + 2]
    set(`value`) {
      arr[arrIndex + 2] = value
    }

  override operator fun `get`(i: Int): Float = when (i) {
    0 -> x
    1 -> y
    2 -> z
    else -> throw ArrayIndexOutOfBoundsException()
  }

  override operator fun `set`(i: Int, `value`: Float) {
    when (i) {
      0 -> x
      1 -> y
      2 -> z
      else -> throw ArrayIndexOutOfBoundsException()
    }
  }

  override fun toString(): String = "Vec3[$x, $y, $z]"

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec3f): ArrayVec3f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    this.z = (this.z + right.z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec3d): ArrayVec3f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    this.z = (this.z + right.z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec3i): ArrayVec3f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    this.z = (this.z + right.z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Result will be written into left vector
   */
  override operator fun plus(right: Vec3l): ArrayVec3f {
    this.x = (this.x + right.x).toFloat()
    this.y = (this.y + right.y).toFloat()
    this.z = (this.z + right.z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(
    x: Float,
    y: Float,
    z: Float,
  ): ArrayVec3f {
    this.x = (this.x + x).toFloat()
    this.y = (this.y + y).toFloat()
    this.z = (this.z + z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(
    x: Double,
    y: Double,
    z: Double,
  ): ArrayVec3f {
    this.x = (this.x + x).toFloat()
    this.y = (this.y + y).toFloat()
    this.z = (this.z + z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(
    x: Int,
    y: Int,
    z: Int,
  ): ArrayVec3f {
    this.x = (this.x + x).toFloat()
    this.y = (this.y + y).toFloat()
    this.z = (this.z + z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun plus(
    x: Long,
    y: Long,
    z: Long,
  ): ArrayVec3f {
    this.x = (this.x + x).toFloat()
    this.y = (this.y + y).toFloat()
    this.z = (this.z + z).toFloat()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Float): ArrayVec3f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    this.z = (this.z + right).toFloat()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Double): ArrayVec3f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    this.z = (this.z + right).toFloat()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Int): ArrayVec3f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    this.z = (this.z + right).toFloat()
    return this
  }

  /**
   * Component-wise plus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun plus(right: Long): ArrayVec3f {
    this.x = (this.x + right).toFloat()
    this.y = (this.y + right).toFloat()
    this.z = (this.z + right).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec3f): ArrayVec3f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    this.z = (this.z - right.z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec3d): ArrayVec3f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    this.z = (this.z - right.z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec3i): ArrayVec3f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    this.z = (this.z - right.z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Result will be written into left vector
   */
  override operator fun minus(right: Vec3l): ArrayVec3f {
    this.x = (this.x - right.x).toFloat()
    this.y = (this.y - right.y).toFloat()
    this.z = (this.z - right.z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(
    x: Float,
    y: Float,
    z: Float,
  ): ArrayVec3f {
    this.x = (this.x - x).toFloat()
    this.y = (this.y - y).toFloat()
    this.z = (this.z - z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(
    x: Double,
    y: Double,
    z: Double,
  ): ArrayVec3f {
    this.x = (this.x - x).toFloat()
    this.y = (this.y - y).toFloat()
    this.z = (this.z - z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(
    x: Int,
    y: Int,
    z: Int,
  ): ArrayVec3f {
    this.x = (this.x - x).toFloat()
    this.y = (this.y - y).toFloat()
    this.z = (this.z - z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun minus(
    x: Long,
    y: Long,
    z: Long,
  ): ArrayVec3f {
    this.x = (this.x - x).toFloat()
    this.y = (this.y - y).toFloat()
    this.z = (this.z - z).toFloat()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Float): ArrayVec3f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    this.z = (this.z - right).toFloat()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Double): ArrayVec3f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    this.z = (this.z - right).toFloat()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Int): ArrayVec3f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    this.z = (this.z - right).toFloat()
    return this
  }

  /**
   * Component-wise minus operation between vector and scalar. Result will be written into left vector
   */
  override operator fun minus(right: Long): ArrayVec3f {
    this.x = (this.x - right).toFloat()
    this.y = (this.y - right).toFloat()
    this.z = (this.z - right).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec3f): ArrayVec3f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    this.z = (this.z * right.z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec3d): ArrayVec3f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    this.z = (this.z * right.z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec3i): ArrayVec3f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    this.z = (this.z * right.z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Result will be written into left vector
   */
  override operator fun times(right: Vec3l): ArrayVec3f {
    this.x = (this.x * right.x).toFloat()
    this.y = (this.y * right.y).toFloat()
    this.z = (this.z * right.z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(
    x: Float,
    y: Float,
    z: Float,
  ): ArrayVec3f {
    this.x = (this.x * x).toFloat()
    this.y = (this.y * y).toFloat()
    this.z = (this.z * z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(
    x: Double,
    y: Double,
    z: Double,
  ): ArrayVec3f {
    this.x = (this.x * x).toFloat()
    this.y = (this.y * y).toFloat()
    this.z = (this.z * z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(
    x: Int,
    y: Int,
    z: Int,
  ): ArrayVec3f {
    this.x = (this.x * x).toFloat()
    this.y = (this.y * y).toFloat()
    this.z = (this.z * z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun times(
    x: Long,
    y: Long,
    z: Long,
  ): ArrayVec3f {
    this.x = (this.x * x).toFloat()
    this.y = (this.y * y).toFloat()
    this.z = (this.z * z).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Float): ArrayVec3f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    this.z = (this.z * right).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Double): ArrayVec3f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    this.z = (this.z * right).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Int): ArrayVec3f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    this.z = (this.z * right).toFloat()
    return this
  }

  /**
   * Component-wise multiplication operation between vector and scalar. Result will be written into left vector
   */
  override operator fun times(right: Long): ArrayVec3f {
    this.x = (this.x * right).toFloat()
    this.y = (this.y * right).toFloat()
    this.z = (this.z * right).toFloat()
    return this
  }

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec3f): Float = (x * right.x + y * right.y + z * right.z).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec3d): Float = (x * right.x + y * right.y + z * right.z).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec3i): Float = (x * right.x + y * right.y + z * right.z).toFloat()

  /**
   * Component-wise dot operation with vectors
   */
  override fun dot(right: Vec3l): Float = (x * right.x + y * right.y + z * right.z).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Float): Float = (x * right + y * right + z * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Double): Float = (x * right + y * right + z * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Int): Float = (x * right + y * right + z * right).toFloat()

  /**
   * Component-wise dot operation with scalar. Every component will be multiplied by given scalar
   */
  override fun dot(right: Long): Float = (x * right + y * right + z * right).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(
    x: Float,
    y: Float,
    z: Float,
  ): Float = (x * x + y * y + z * z).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(
    x: Double,
    y: Double,
    z: Double,
  ): Float = (x * x + y * y + z * z).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(
    x: Int,
    y: Int,
    z: Int,
  ): Float = (x * x + y * y + z * z).toFloat()

  /**
   * Component-wise dot operation with vectors. Right vector presented as set of scalars. Result will be written into left vector
   */
  override fun dot(
    x: Long,
    y: Long,
    z: Long,
  ): Float = (x * x + y * y + z * z).toFloat()

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: FloatBuffer) {
    buffer.put(x.toFloat())
    buffer.put(y.toFloat())
    buffer.put(z.toFloat())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: DoubleBuffer) {
    buffer.put(x.toDouble())
    buffer.put(y.toDouble())
    buffer.put(z.toDouble())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: IntBuffer) {
    buffer.put(x.toInt())
    buffer.put(y.toInt())
    buffer.put(z.toInt())
  }

  /**
   * Puts this vector into given buffer. Vector values will be cast to vector type
   */
  override fun toBuffer(buffer: LongBuffer) {
    buffer.put(x.toLong())
    buffer.put(y.toLong())
    buffer.put(z.toLong())
  }

  /**
   * Puts this vector into given buffer
   */
  override fun toBuffer(buffer: ByteBuffer) {
    buffer.putFloat(x)
    buffer.putFloat(y)
    buffer.putFloat(z)
  }
}
