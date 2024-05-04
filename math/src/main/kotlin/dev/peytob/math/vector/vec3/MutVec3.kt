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

interface MutVec3d : MutVec3<Double>
interface MutVec3i : MutVec3<Int>
interface MutVec3f : MutVec3<Float>
interface MutVec3l : MutVec3<Long>
