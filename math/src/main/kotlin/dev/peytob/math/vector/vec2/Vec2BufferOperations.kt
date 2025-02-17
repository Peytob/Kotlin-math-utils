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
  date = "2025-02-17",
)
@JvmName(name = "toByteBuffer2d")
infix fun Vec2Accessor<Double>.to(buffer: ByteBuffer) {
  buffer.putDouble(x)
  buffer.putDouble(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toByteBuffer2f")
infix fun Vec2Accessor<Float>.to(buffer: ByteBuffer) {
  buffer.putFloat(x)
  buffer.putFloat(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toByteBuffer2l")
infix fun Vec2Accessor<Long>.to(buffer: ByteBuffer) {
  buffer.putLong(x)
  buffer.putLong(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toBuffer2d")
infix fun Vec2Accessor<Double>.to(buffer: DoubleBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toByteBuffer2i")
infix fun Vec2Accessor<Int>.to(buffer: ByteBuffer) {
  buffer.putInt(x)
  buffer.putInt(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toBuffer2i")
infix fun Vec2Accessor<Int>.to(buffer: IntBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toBuffer2f")
infix fun Vec2Accessor<Float>.to(buffer: FloatBuffer) {
  buffer.put(x)
  buffer.put(y)
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-02-17",
)
@JvmName(name = "toBuffer2l")
infix fun Vec2Accessor<Long>.to(buffer: LongBuffer) {
  buffer.put(x)
  buffer.put(y)
}
