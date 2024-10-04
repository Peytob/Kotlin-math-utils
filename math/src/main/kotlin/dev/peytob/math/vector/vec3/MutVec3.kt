package dev.peytob.math.vector.vec3

interface MutVec3<T : Number> : Vec3Accessor<T> {

    override var x: T

    override var y: T

    override var z: T

    /**
     * Creates immutable copy of this mutable vector
     */
    fun asImmutable(): Vec3<T>

    // Unary operations

    operator fun unaryPlus(): MutVec3<T>

    operator fun unaryMinus(): MutVec3<T>

    // Double operations

    operator fun plus(right: Vec3d): MutVec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Double): MutVec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<T>

    operator fun minus(right: Vec3d): MutVec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Double): MutVec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<T>

    operator fun times(scalar: Double): MutVec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3d): MutVec3<T>

    fun dot(right: Vec3d): Float

    // Float operations

    operator fun plus(right: Vec3f): MutVec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Float): MutVec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<T>

    operator fun minus(right: Vec3f): MutVec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Float): MutVec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<T>

    operator fun times(scalar: Float): MutVec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3f): MutVec3<T>

    fun dot(right: Vec3f): Float

    // Int operations

    operator fun plus(right: Vec3i): MutVec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Int): MutVec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<T>

    operator fun minus(right: Vec3i): MutVec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Int): MutVec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<T>

    operator fun times(scalar: Int): MutVec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3i): MutVec3<T>

    fun dot(right: Vec3i): Float

    // Long operations

    operator fun plus(right: Vec3l): MutVec3<T> = plus(right.x, right.y, right.z)

    operator fun plus(rightScalar: Long): MutVec3<T> = plus(rightScalar, rightScalar, rightScalar)

    fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<T>

    operator fun minus(right: Vec3l): MutVec3<T> = minus(right.x, right.y, right.z)

    operator fun minus(rightScalar: Long): MutVec3<T> = minus(rightScalar, rightScalar, rightScalar)

    fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<T>

    operator fun times(scalar: Long): MutVec3<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec3l): MutVec3<T>

    fun dot(right: Vec3l): Float
}

interface MutVec3d : MutVec3<Double> {

    override fun asImmutable(): Vec3d

    // Unary operations

    override operator fun unaryPlus(): MutVec3d

    override operator fun unaryMinus(): MutVec3d

    // Double operations

    override operator fun plus(right: Vec3d): MutVec3d = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Double): MutVec3d = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3d

    override operator fun minus(right: Vec3d): MutVec3d = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Double): MutVec3d = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3d

    override operator fun times(scalar: Double): MutVec3d

    override operator fun times(right: Vec3d): MutVec3d

    // Float operations

    override operator fun plus(right: Vec3f): MutVec3d = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Float): MutVec3d = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3d

    override operator fun minus(right: Vec3f): MutVec3d = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Float): MutVec3d = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3d

    override operator fun times(scalar: Float): MutVec3d

    override operator fun times(right: Vec3f): MutVec3d

    // Int operations

    override operator fun plus(right: Vec3i): MutVec3d = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Int): MutVec3d = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3d

    override operator fun minus(right: Vec3i): MutVec3d = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Int): MutVec3d = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3d

    override operator fun times(scalar: Int): MutVec3d

    override operator fun times(right: Vec3i): MutVec3d

    // Long operations

    override operator fun plus(right: Vec3l): MutVec3d = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Long): MutVec3d = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3d

    override operator fun minus(right: Vec3l): MutVec3d = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Long): MutVec3d = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3d

    override operator fun times(scalar: Long): MutVec3d

    override operator fun times(right: Vec3l): MutVec3d
}

interface MutVec3i : MutVec3<Int> {

    override fun asImmutable(): Vec3i

    // Unary operations

    override operator fun unaryPlus(): MutVec3i

    override operator fun unaryMinus(): MutVec3i

    // Double operations

    override operator fun plus(right: Vec3d): MutVec3i = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Double): MutVec3i = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3i

    override operator fun minus(right: Vec3d): MutVec3i = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Double): MutVec3i = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3i

    override operator fun times(scalar: Double): MutVec3i

    override operator fun times(right: Vec3d): MutVec3i

    // Float operations

    override operator fun plus(right: Vec3f): MutVec3i = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Float): MutVec3i = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3i

    override operator fun minus(right: Vec3f): MutVec3i = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Float): MutVec3i = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3i

    override operator fun times(scalar: Float): MutVec3i

    override operator fun times(right: Vec3f): MutVec3i

    // Int operations

    override operator fun plus(right: Vec3i): MutVec3i = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Int): MutVec3i = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3i

    override operator fun minus(right: Vec3i): MutVec3i = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Int): MutVec3i = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3i

    override operator fun times(scalar: Int): MutVec3i

    override operator fun times(right: Vec3i): MutVec3i

    // Long operations

    override operator fun plus(right: Vec3l): MutVec3i = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Long): MutVec3i = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3i

    override operator fun minus(right: Vec3l): MutVec3i = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Long): MutVec3i = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3i

    override operator fun times(scalar: Long): MutVec3i

    override operator fun times(right: Vec3l): MutVec3i
}

interface MutVec3f : MutVec3<Float> {

    override fun asImmutable(): Vec3f

    // Unary operations

    override operator fun unaryPlus(): MutVec3f

    override operator fun unaryMinus(): MutVec3f

    // Double operations

    override operator fun plus(right: Vec3d): MutVec3f = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Double): MutVec3f = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3f

    override operator fun minus(right: Vec3d): MutVec3f = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Double): MutVec3f = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3f

    override operator fun times(scalar: Double): MutVec3f

    override operator fun times(right: Vec3d): MutVec3f

    // Float operations

    override operator fun plus(right: Vec3f): MutVec3f = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Float): MutVec3f = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3f

    override operator fun minus(right: Vec3f): MutVec3f = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Float): MutVec3f = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3f

    override operator fun times(scalar: Float): MutVec3f

    override operator fun times(right: Vec3f): MutVec3f

    // Int operations

    override operator fun plus(right: Vec3i): MutVec3f = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Int): MutVec3f = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3f

    override operator fun minus(right: Vec3i): MutVec3f = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Int): MutVec3f = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3f

    override operator fun times(scalar: Int): MutVec3f

    override operator fun times(right: Vec3i): MutVec3f

    // Long operations

    override operator fun plus(right: Vec3l): MutVec3f = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Long): MutVec3f = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3f

    override operator fun minus(right: Vec3l): MutVec3f = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Long): MutVec3f = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3f

    override operator fun times(scalar: Long): MutVec3f

    override operator fun times(right: Vec3l): MutVec3f
}

interface MutVec3l : MutVec3<Long> {

    override fun asImmutable(): Vec3l

    // Unary operations

    override operator fun unaryPlus(): MutVec3l

    override operator fun unaryMinus(): MutVec3l

    // Double operations

    override operator fun plus(right: Vec3d): MutVec3l = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Double): MutVec3l = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3l

    override operator fun minus(right: Vec3d): MutVec3l = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Double): MutVec3l = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3l

    override operator fun times(scalar: Double): MutVec3l

    override operator fun times(right: Vec3d): MutVec3l

    // Float operations

    override operator fun plus(right: Vec3f): MutVec3l = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Float): MutVec3l = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3l

    override operator fun minus(right: Vec3f): MutVec3l = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Float): MutVec3l = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3l

    override operator fun times(scalar: Float): MutVec3l

    override operator fun times(right: Vec3f): MutVec3l

    // Int operations

    override operator fun plus(right: Vec3i): MutVec3l = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Int): MutVec3l = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3l

    override operator fun minus(right: Vec3i): MutVec3l = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Int): MutVec3l = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3l

    override operator fun times(scalar: Int): MutVec3l

    override operator fun times(right: Vec3i): MutVec3l

    // Long operations

    override operator fun plus(right: Vec3l): MutVec3l = plus(right.x, right.y, right.z)

    override operator fun plus(rightScalar: Long): MutVec3l = plus(rightScalar, rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3l

    override operator fun minus(right: Vec3l): MutVec3l = minus(right.x, right.y, right.z)

    override operator fun minus(rightScalar: Long): MutVec3l = minus(rightScalar, rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3l

    override operator fun times(scalar: Long): MutVec3l

    override operator fun times(right: Vec3l): MutVec3l
}
