package dev.peytob.math.vector.vec3

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
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec3Accessor<Double>d")
public infix fun Vec3Accessor<Double>.to(buffer: ByteBuffer) {
  buffer.putDouble(x)
  buffer.putDouble(y)
  buffer.putDouble(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec3Accessor<Double>d")
public infix fun Vec3Accessor<Double>.to(buffer: DoubleBuffer) {
  buffer.put(x)
  buffer.put(y)
  buffer.put(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec3Accessor<Float>f")
public infix fun Vec3Accessor<Float>.to(buffer: ByteBuffer) {
  buffer.putFloat(x)
  buffer.putFloat(y)
  buffer.putFloat(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec3Accessor<Float>f")
public infix fun Vec3Accessor<Float>.to(buffer: FloatBuffer) {
  buffer.put(x)
  buffer.put(y)
  buffer.put(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec3Accessor<Int>i")
public infix fun Vec3Accessor<Int>.to(buffer: ByteBuffer) {
  buffer.putInt(x)
  buffer.putInt(y)
  buffer.putInt(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec3Accessor<Int>i")
public infix fun Vec3Accessor<Int>.to(buffer: IntBuffer) {
  buffer.put(x)
  buffer.put(y)
  buffer.put(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec3Accessor<Long>l")
public infix fun Vec3Accessor<Long>.to(buffer: ByteBuffer) {
  buffer.putLong(x)
  buffer.putLong(y)
  buffer.putLong(z)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec3Accessor<Long>l")
public infix fun Vec3Accessor<Long>.to(buffer: LongBuffer) {
  buffer.put(x)
  buffer.put(y)
  buffer.put(z)
}
