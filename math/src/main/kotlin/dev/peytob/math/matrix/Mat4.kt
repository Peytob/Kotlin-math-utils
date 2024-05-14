package dev.peytob.math.matrix

import dev.peytob.math.vector.vec2.Vec2i

sealed interface Mat4<T : Number, ArrayT> : Mat4Accessor<T> {

    /**
     * Raw flat array data for low-level operations. Must be not modified directly.
     */
    val raw: ArrayT

    override val size: Int
        get() = MAT4_SIZE

    override val sizes: Vec2i
        get() = MAT4_SIZES

    override val elementsCount: Int
        get() = MAT4_ELEMENTS_COUNT
}

interface Mat4d : Mat4<Double, DoubleArray>
interface Mat4f : Mat4<Float, FloatArray>
interface Mat4i : Mat4<Int, IntArray>
interface Mat4l : Mat4<Long, LongArray>
