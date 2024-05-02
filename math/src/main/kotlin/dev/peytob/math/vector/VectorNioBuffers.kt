package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.Vec2Accessor
import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer

@JvmName("toByteBuffer2d")
infix fun Vec2Accessor<Double>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putDouble(x)
    byteBuffer.putDouble(y)
}

@JvmName("toByteBuffer2f")
infix fun Vec2Accessor<Float>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putFloat(x)
    byteBuffer.putFloat(y)
}

@JvmName("toByteBuffer2i")
infix fun Vec2Accessor<Int>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putInt(x)
    byteBuffer.putInt(y)
}

@JvmName("toByteBuffer2l")
infix fun Vec2Accessor<Long>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putLong(x)
    byteBuffer.putLong(y)
}

@JvmName("toDoubleBuffer2d")
infix fun Vec2Accessor<Double>.to(doubleBuffer: DoubleBuffer) {
    doubleBuffer.put(x)
    doubleBuffer.put(y)
}

@JvmName("toDoubleBuffer2f")
infix fun Vec2Accessor<Float>.to(floatBuffer: FloatBuffer) {
    floatBuffer.put(x)
    floatBuffer.put(y)
}

@JvmName("toDoubleBuffer2i")
infix fun Vec2Accessor<Int>.to(intBuffer: IntBuffer) {
    intBuffer.put(x)
    intBuffer.put(y)
}

@JvmName("toDoubleBuffer2l")
infix fun Vec2Accessor<Long>.to(longBuffer: LongBuffer) {
    longBuffer.put(x)
    longBuffer.put(y)
}
