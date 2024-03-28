package dev.peytob.math.vector.vec2

interface MutVec2<T : Number> : Vec2Accessor<T> {

    override var x: T

    override var y: T

    /**
     * Creates immutable copy of this mutable vector
     */
    fun asImmutable(): Vec2<T>

    // Unary operations

    operator fun unaryPlus(): MutVec2<T>

    operator fun unaryMinus(): MutVec2<T>

    // Double operations

    operator fun plus(right: Vec2d): MutVec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Double): MutVec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Double, rightY: Double): MutVec2<T>

    operator fun minus(right: Vec2d): MutVec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Double): MutVec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Double, rightY: Double): MutVec2<T>

    operator fun times(scalar: Double): MutVec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2d): MutVec2<T>

    // Float operations

    operator fun plus(right: Vec2f): MutVec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Float): MutVec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Float, rightY: Float): MutVec2<T>

    operator fun minus(right: Vec2f): MutVec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Float): MutVec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Float, rightY: Float): MutVec2<T>

    operator fun times(scalar: Float): MutVec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2f): MutVec2<T>

    // Int operations

    operator fun plus(right: Vec2i): MutVec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Int): MutVec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Int, rightY: Int): MutVec2<T>

    operator fun minus(right: Vec2i): MutVec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Int): MutVec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Int, rightY: Int): MutVec2<T>

    operator fun times(scalar: Int): MutVec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2i): MutVec2<T>

    // Long operations

    operator fun plus(right: Vec2l): MutVec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Long): MutVec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Long, rightY: Long): MutVec2<T>

    operator fun minus(right: Vec2l): MutVec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Long): MutVec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Long, rightY: Long): MutVec2<T>

    operator fun times(scalar: Long): MutVec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2l): MutVec2<T>
}

interface MutVec2d : MutVec2<Double>
interface MutVec2i : MutVec2<Int>
interface MutVec2f : MutVec2<Float>
interface MutVec2l : MutVec2<Long>
