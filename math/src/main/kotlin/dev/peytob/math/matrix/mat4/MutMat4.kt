package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.MAT4_ELEMENTS_COUNT
import dev.peytob.math.matrix.MAT4_SIZE
import dev.peytob.math.matrix.MAT4_SIZES
import dev.peytob.math.vector.vec2.Vec2i

sealed interface MutMat4<T : Number, ArrayT> : Mat4Accessor<T> {

    fun withRaw(supplier: (ArrayT) -> Unit)

    override val size: Int
        get() = MAT4_SIZE

    override val sizes: Vec2i
        get() = MAT4_SIZES

    override val elementsCount: Int
        get() = MAT4_ELEMENTS_COUNT

    operator fun plus(right: MutMat4d): MutMat4<T, ArrayT>

    operator fun minus(right: MutMat4d): MutMat4<T, ArrayT>

    operator fun times(right: MutMat4d): MutMat4<T, ArrayT>

    operator fun times(scalar: Double): MutMat4<T, ArrayT>

    operator fun plus(right: MutMat4f): MutMat4<T, ArrayT>

    operator fun minus(right: MutMat4f): MutMat4<T, ArrayT>

    operator fun times(right: MutMat4f): MutMat4<T, ArrayT>

    operator fun times(scalar: Float): MutMat4<T, ArrayT>

    operator fun plus(right: MutMat4i): MutMat4<T, ArrayT>

    operator fun minus(right: MutMat4i): MutMat4<T, ArrayT>

    operator fun times(right: MutMat4i): MutMat4<T, ArrayT>

    operator fun times(scalar: Int): MutMat4<T, ArrayT>

    operator fun plus(right: MutMat4l): MutMat4<T, ArrayT>

    operator fun minus(right: MutMat4l): MutMat4<T, ArrayT>

    operator fun times(right: MutMat4l): MutMat4<T, ArrayT>

    operator fun times(scalar: Long): MutMat4<T, ArrayT>

    operator fun set(row: Int, column: Int, value: T)
}

interface MutMat4d : MutMat4<Double, DoubleArray> {
    override operator fun plus(right: MutMat4d): MutMat4d

    override operator fun minus(right: MutMat4d): MutMat4d

    override operator fun times(right: MutMat4d): MutMat4d

    override operator fun times(scalar: Double): MutMat4d

    override operator fun plus(right: MutMat4f): MutMat4d

    override operator fun minus(right: MutMat4f): MutMat4d

    override operator fun times(right: MutMat4f): MutMat4d

    override operator fun times(scalar: Float): MutMat4d

    override operator fun plus(right: MutMat4i): MutMat4d

    override operator fun minus(right: MutMat4i): MutMat4d

    override operator fun times(right: MutMat4i): MutMat4d

    override operator fun times(scalar: Int): MutMat4d

    override operator fun plus(right: MutMat4l): MutMat4d

    override operator fun minus(right: MutMat4l): MutMat4d

    override operator fun times(right: MutMat4l): MutMat4d

    override operator fun times(scalar: Long): MutMat4d
}

interface MutMat4f : MutMat4<Float, FloatArray> {
    override operator fun plus(right: MutMat4d): MutMat4f

    override operator fun minus(right: MutMat4d): MutMat4f

    override operator fun times(right: MutMat4d): MutMat4f

    override operator fun times(scalar: Double): MutMat4f

    override operator fun plus(right: MutMat4f): MutMat4f

    override operator fun minus(right: MutMat4f): MutMat4f

    override operator fun times(right: MutMat4f): MutMat4f

    override operator fun times(scalar: Float): MutMat4f

    override operator fun plus(right: MutMat4i): MutMat4f

    override operator fun minus(right: MutMat4i): MutMat4f

    override operator fun times(right: MutMat4i): MutMat4f

    override operator fun times(scalar: Int): MutMat4f

    override operator fun plus(right: MutMat4l): MutMat4f

    override operator fun minus(right: MutMat4l): MutMat4f

    override operator fun times(right: MutMat4l): MutMat4f

    override operator fun times(scalar: Long): MutMat4f
}

interface MutMat4i : MutMat4<Int, IntArray> {
    override operator fun plus(right: MutMat4d): MutMat4i

    override operator fun minus(right: MutMat4d): MutMat4i

    override operator fun times(right: MutMat4d): MutMat4i

    override operator fun times(scalar: Double): MutMat4i

    override operator fun plus(right: MutMat4f): MutMat4i

    override operator fun minus(right: MutMat4f): MutMat4i

    override operator fun times(right: MutMat4f): MutMat4i

    override operator fun times(scalar: Float): MutMat4i

    override operator fun plus(right: MutMat4i): MutMat4i

    override operator fun minus(right: MutMat4i): MutMat4i

    override operator fun times(right: MutMat4i): MutMat4i

    override operator fun times(scalar: Int): MutMat4i

    override operator fun plus(right: MutMat4l): MutMat4i

    override operator fun minus(right: MutMat4l): MutMat4i

    override operator fun times(right: MutMat4l): MutMat4i

    override operator fun times(scalar: Long): MutMat4i
}

interface MutMat4l : MutMat4<Long, LongArray> {
    override operator fun plus(right: MutMat4d): MutMat4l

    override operator fun minus(right: MutMat4d): MutMat4l

    override operator fun times(right: MutMat4d): MutMat4l

    override operator fun times(scalar: Double): MutMat4l

    override operator fun plus(right: MutMat4f): MutMat4l

    override operator fun minus(right: MutMat4f): MutMat4l

    override operator fun times(right: MutMat4f): MutMat4l

    override operator fun times(scalar: Float): MutMat4l

    override operator fun plus(right: MutMat4i): MutMat4l

    override operator fun minus(right: MutMat4i): MutMat4l

    override operator fun times(right: MutMat4i): MutMat4l

    override operator fun times(scalar: Int): MutMat4l

    override operator fun plus(right: MutMat4l): MutMat4l

    override operator fun minus(right: MutMat4l): MutMat4l

    override operator fun times(right: MutMat4l): MutMat4l

    override operator fun times(scalar: Long): MutMat4l
}
