package dev.peytob.math.vector.vec3

sealed interface Vec3<T : Number> : Vec3Accessor<T> {

    /**
     * Creates mutable copy of this vector
     */
    fun asMutable(): MutVec3<T>

    // Unary operations

    operator fun unaryPlus(): Vec3<T>

    operator fun unaryMinus(): Vec3<T>

    // Double operations

    operator fun plus(right: Vec3d): Vec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Double): Vec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3<T>

    operator fun minus(right: Vec3d): Vec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Double): Vec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3<T>

    operator fun times(scalar: Double): Vec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3d): Vec3<T>

    fun dot(right: Vec3d): Float

    // Float operations

    operator fun plus(right: Vec3f): Vec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Float): Vec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3<T>

    operator fun minus(right: Vec3f): Vec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Float): Vec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3<T>

    operator fun times(scalar: Float): Vec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3f): Vec3<T>

    fun dot(right: Vec3f): Float

    // Int operations

    operator fun plus(right: Vec3i): Vec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Int): Vec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3<T>

    operator fun minus(right: Vec3i): Vec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Int): Vec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3<T>

    operator fun times(scalar: Int): Vec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3i): Vec3<T>

    fun dot(right: Vec3<Int>): Float

    // Long operations

    operator fun plus(right: Vec3l): Vec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Long): Vec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3<T>

    operator fun minus(right: Vec3l): Vec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Long): Vec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3<T>

    operator fun times(scalar: Long): Vec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3l): Vec3<T>

    fun dot(right: Vec3l): Float
}

// Usable realisations

interface Vec3d : Vec3<Double> {

    override fun unaryPlus(): Vec3d

    override fun unaryMinus(): Vec3d

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3d

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3d

    override fun times(scalar: Double): Vec3d

    override fun times(right: Vec3d): Vec3d

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3d

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3d

    override fun times(scalar: Float): Vec3d

    override fun times(right: Vec3f): Vec3d

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3d

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3d

    override fun times(scalar: Int): Vec3d

    override fun times(right: Vec3i): Vec3d

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3d

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3d

    override fun times(scalar: Long): Vec3d

    override fun times(right: Vec3l): Vec3d
}

interface Vec3i : Vec3<Int> {

    override fun unaryPlus(): Vec3i

    override fun unaryMinus(): Vec3i

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3i

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3i

    override fun times(scalar: Double): Vec3i

    override fun times(right: Vec3d): Vec3i

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3i

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3i

    override fun times(scalar: Float): Vec3i

    override fun times(right: Vec3f): Vec3i

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3i

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3i

    override fun times(scalar: Int): Vec3i

    override fun times(right: Vec3i): Vec3i

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3i

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3i

    override fun times(scalar: Long): Vec3i

    override fun times(right: Vec3l): Vec3i
}

interface Vec3f : Vec3<Float> {

    override fun unaryPlus(): Vec3f

    override fun unaryMinus(): Vec3f

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3f

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3f

    override fun times(scalar: Double): Vec3f

    override fun times(right: Vec3d): Vec3f

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3f

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3f

    override fun times(scalar: Float): Vec3f

    override fun times(right: Vec3f): Vec3f

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3f

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3f

    override fun times(scalar: Int): Vec3f

    override fun times(right: Vec3i): Vec3f

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3f

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3f

    override fun times(scalar: Long): Vec3f

    override fun times(right: Vec3l): Vec3f
}

interface Vec3l : Vec3<Long> {

    override fun unaryPlus(): Vec3l

    override fun unaryMinus(): Vec3l

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3l

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3l

    override fun times(scalar: Double): Vec3l

    override fun times(right: Vec3d): Vec3l

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3l

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3l

    override fun times(scalar: Float): Vec3l

    override fun times(right: Vec3f): Vec3l

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3l

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3l

    override fun times(scalar: Int): Vec3l

    override fun times(right: Vec3i): Vec3l

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3l

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3l

    override fun times(scalar: Long): Vec3l

    override fun times(right: Vec3l): Vec3l
}
