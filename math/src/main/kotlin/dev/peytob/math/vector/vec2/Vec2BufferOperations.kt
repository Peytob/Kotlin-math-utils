package dev.peytob.math.vector.vec2

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
@JvmName(name = "toByteBufferVec2Accessor<Double>d")
public infix fun Vec2Accessor<Double>.to(buffer: ByteBuffer) {
  buffer.putDouble(x)
  buffer.putDouble(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec2Accessor<Double>d")
public infix fun Vec2Accessor<Double>.to(buffer: DoubleBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec2Accessor<Float>f")
public infix fun Vec2Accessor<Float>.to(buffer: ByteBuffer) {
  buffer.putFloat(x)
  buffer.putFloat(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec2Accessor<Float>f")
public infix fun Vec2Accessor<Float>.to(buffer: FloatBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec2Accessor<Int>i")
public infix fun Vec2Accessor<Int>.to(buffer: ByteBuffer) {
  buffer.putInt(x)
  buffer.putInt(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec2Accessor<Int>i")
public infix fun Vec2Accessor<Int>.to(buffer: IntBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toByteBufferVec2Accessor<Long>l")
public infix fun Vec2Accessor<Long>.to(buffer: ByteBuffer) {
  buffer.putLong(x)
  buffer.putLong(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "toBufferVec2Accessor<Long>l")
public infix fun Vec2Accessor<Long>.to(buffer: LongBuffer) {
  buffer.put(x)
  buffer.put(y)
}
