package dev.peytob.math.matrix.mat4

import dev.peytob.math.matrix.MAT4_ELEMENTS_COUNT
import dev.peytob.math.matrix.MAT4_SIZE
import dev.peytob.math.matrix.MAT4_SIZES
import dev.peytob.math.vector.vec2.Vec2i

sealed interface Mat4<T : Number, ArrayT> : Mat4Accessor<T> {

    fun withRaw(supplier: (ArrayT) -> Unit)

    override val size: Int
        get() = MAT4_SIZE

    override val sizes: Vec2i
        get() = MAT4_SIZES

    override val elementsCount: Int
        get() = MAT4_ELEMENTS_COUNT

    operator fun plus(mat4: Mat4d): Mat4<T, ArrayT>

    operator fun minus(mat4: Mat4d): Mat4<T, ArrayT>

    operator fun times(mat4: Mat4d): Mat4<T, ArrayT>

    operator fun times(scalar: Double): Mat4<T, ArrayT>

    operator fun plus(mat4: Mat4f): Mat4<T, ArrayT>

    operator fun minus(mat4: Mat4f): Mat4<T, ArrayT>

    operator fun times(mat4: Mat4f): Mat4<T, ArrayT>

    operator fun times(scalar: Float): Mat4<T, ArrayT>

    operator fun plus(mat4: Mat4i): Mat4<T, ArrayT>

    operator fun minus(mat4: Mat4i): Mat4<T, ArrayT>

    operator fun times(mat4: Mat4i): Mat4<T, ArrayT>

    operator fun times(scalar: Int): Mat4<T, ArrayT>

    operator fun plus(mat4: Mat4l): Mat4<T, ArrayT>

    operator fun minus(mat4: Mat4l): Mat4<T, ArrayT>

    operator fun times(mat4: Mat4l): Mat4<T, ArrayT>

    operator fun times(scalar: Long): Mat4<T, ArrayT>
}

interface Mat4d : Mat4<Double, DoubleArray> {
    override operator fun plus(mat4: Mat4d): Mat4d

    override operator fun minus(mat4: Mat4d): Mat4d

    override operator fun times(mat4: Mat4d): Mat4d

    override operator fun times(scalar: Double): Mat4d

    override operator fun plus(mat4: Mat4f): Mat4d

    override operator fun minus(mat4: Mat4f): Mat4d

    override operator fun times(mat4: Mat4f): Mat4d

    override operator fun times(scalar: Float): Mat4d

    override operator fun plus(mat4: Mat4i): Mat4d

    override operator fun minus(mat4: Mat4i): Mat4d

    override operator fun times(mat4: Mat4i): Mat4d

    override operator fun times(scalar: Int): Mat4d

    override operator fun plus(mat4: Mat4l): Mat4d

    override operator fun minus(mat4: Mat4l): Mat4d

    override operator fun times(mat4: Mat4l): Mat4d

    override operator fun times(scalar: Long): Mat4d
}

interface Mat4f : Mat4<Float, FloatArray> {
    override operator fun plus(mat4: Mat4d): Mat4f

    override operator fun minus(mat4: Mat4d): Mat4f

    override operator fun times(mat4: Mat4d): Mat4f

    override operator fun times(scalar: Double): Mat4f

    override operator fun plus(mat4: Mat4f): Mat4f

    override operator fun minus(mat4: Mat4f): Mat4f

    override operator fun times(mat4: Mat4f): Mat4f

    override operator fun times(scalar: Float): Mat4f

    override operator fun plus(mat4: Mat4i): Mat4f

    override operator fun minus(mat4: Mat4i): Mat4f

    override operator fun times(mat4: Mat4i): Mat4f

    override operator fun times(scalar: Int): Mat4f

    override operator fun plus(mat4: Mat4l): Mat4f

    override operator fun minus(mat4: Mat4l): Mat4f

    override operator fun times(mat4: Mat4l): Mat4f

    override operator fun times(scalar: Long): Mat4f
}

interface Mat4i : Mat4<Int, IntArray> {
    override operator fun plus(mat4: Mat4d): Mat4i

    override operator fun minus(mat4: Mat4d): Mat4i

    override operator fun times(mat4: Mat4d): Mat4i

    override operator fun times(scalar: Double): Mat4i

    override operator fun plus(mat4: Mat4f): Mat4i

    override operator fun minus(mat4: Mat4f): Mat4i

    override operator fun times(mat4: Mat4f): Mat4i

    override operator fun times(scalar: Float): Mat4i

    override operator fun plus(mat4: Mat4i): Mat4i

    override operator fun minus(mat4: Mat4i): Mat4i

    override operator fun times(mat4: Mat4i): Mat4i

    override operator fun times(scalar: Int): Mat4i

    override operator fun plus(mat4: Mat4l): Mat4i

    override operator fun minus(mat4: Mat4l): Mat4i

    override operator fun times(mat4: Mat4l): Mat4i

    override operator fun times(scalar: Long): Mat4i
}

interface Mat4l : Mat4<Long, LongArray> {
    override operator fun plus(mat4: Mat4d): Mat4l

    override operator fun minus(mat4: Mat4d): Mat4l

    override operator fun times(mat4: Mat4d): Mat4l

    override operator fun times(scalar: Double): Mat4l

    override operator fun plus(mat4: Mat4f): Mat4l

    override operator fun minus(mat4: Mat4f): Mat4l

    override operator fun times(mat4: Mat4f): Mat4l

    override operator fun times(scalar: Float): Mat4l

    override operator fun plus(mat4: Mat4i): Mat4l

    override operator fun minus(mat4: Mat4i): Mat4l

    override operator fun times(mat4: Mat4i): Mat4l

    override operator fun times(scalar: Int): Mat4l

    override operator fun plus(mat4: Mat4l): Mat4l

    override operator fun minus(mat4: Mat4l): Mat4l

    override operator fun times(mat4: Mat4l): Mat4l

    override operator fun times(scalar: Long): Mat4l
}
