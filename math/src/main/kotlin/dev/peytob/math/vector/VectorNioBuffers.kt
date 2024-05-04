package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.Vec2Accessor
import dev.peytob.math.vector.vec3.Vec3Accessor
import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.FloatBuffer
import java.nio.IntBuffer
import java.nio.LongBuffer

// vec2

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

// vec3

@JvmName("toByteBuffer3d")
infix fun Vec3Accessor<Double>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putDouble(x)
    byteBuffer.putDouble(y)
    byteBuffer.putDouble(z)
}

@JvmName("toByteBuffer3f")
infix fun Vec3Accessor<Float>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putFloat(x)
    byteBuffer.putFloat(y)
    byteBuffer.putFloat(z)
}

@JvmName("toByteBuffer3i")
infix fun Vec3Accessor<Int>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putInt(x)
    byteBuffer.putInt(y)
    byteBuffer.putInt(z)
}

@JvmName("toByteBuffer3l")
infix fun Vec3Accessor<Long>.to(byteBuffer: ByteBuffer) {
    byteBuffer.putLong(x)
    byteBuffer.putLong(y)
    byteBuffer.putLong(z)
}

@JvmName("toDoubleBuffer3d")
infix fun Vec3Accessor<Double>.to(doubleBuffer: DoubleBuffer) {
    doubleBuffer.put(x)
    doubleBuffer.put(y)
    doubleBuffer.put(z)
}

@JvmName("toDoubleBuffer3f")
infix fun Vec3Accessor<Float>.to(floatBuffer: FloatBuffer) {
    floatBuffer.put(x)
    floatBuffer.put(y)
    floatBuffer.put(z)
}

@JvmName("toDoubleBuffer3i")
infix fun Vec3Accessor<Int>.to(intBuffer: IntBuffer) {
    intBuffer.put(x)
    intBuffer.put(y)
    intBuffer.put(z)
}

@JvmName("toDoubleBuffer3l")
infix fun Vec3Accessor<Long>.to(longBuffer: LongBuffer) {
    longBuffer.put(x)
    longBuffer.put(y)
    longBuffer.put(z)
}
