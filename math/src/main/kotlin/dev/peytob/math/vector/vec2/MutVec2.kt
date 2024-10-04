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

    fun dot(right: Vec2d): Float

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

    fun dot(right: Vec2f): Float

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

    fun dot(right: Vec2i): Float

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

    fun dot(right: Vec2l): Float
}

interface MutVec2d : MutVec2<Double> {

    override fun asImmutable(): Vec2d

    // Unary operations

    override operator fun unaryPlus(): MutVec2d

    override operator fun unaryMinus(): MutVec2d

    // Double operations

    override operator fun plus(right: Vec2d): MutVec2d = plus(right.x, right.y)

    override operator fun plus(rightScalar: Double): MutVec2d = plus(rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double): MutVec2d

    override operator fun minus(right: Vec2d): MutVec2d = minus(right.x, right.y)

    override operator fun minus(rightScalar: Double): MutVec2d = minus(rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double): MutVec2d

    override operator fun times(scalar: Double): MutVec2d

    override operator fun times(right: Vec2d): MutVec2d

    // Float operations

    override operator fun plus(right: Vec2f): MutVec2d = plus(right.x, right.y)

    override operator fun plus(rightScalar: Float): MutVec2d = plus(rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float): MutVec2d

    override operator fun minus(right: Vec2f): MutVec2d = minus(right.x, right.y)

    override operator fun minus(rightScalar: Float): MutVec2d = minus(rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float): MutVec2d

    override operator fun times(scalar: Float): MutVec2d

    override operator fun times(right: Vec2f): MutVec2d

    override fun dot(right: Vec2f): Float

    override operator fun plus(right: Vec2i): MutVec2d = plus(right.x, right.y)

    override operator fun plus(rightScalar: Int): MutVec2d = plus(rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int): MutVec2d

    override operator fun minus(right: Vec2i): MutVec2d = minus(right.x, right.y)

    override operator fun minus(rightScalar: Int): MutVec2d = minus(rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int): MutVec2d

    override operator fun times(scalar: Int): MutVec2d

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    override operator fun times(right: Vec2i): MutVec2d

    // Long operations

    override operator fun plus(right: Vec2l): MutVec2d = plus(right.x, right.y)

    override operator fun plus(rightScalar: Long): MutVec2d = plus(rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long): MutVec2d

    override operator fun minus(right: Vec2l): MutVec2d = minus(right.x, right.y)

    override operator fun minus(rightScalar: Long): MutVec2d = minus(rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long): MutVec2d

    override operator fun times(scalar: Long): MutVec2d

    override operator fun times(right: Vec2l): MutVec2d
}

interface MutVec2i : MutVec2<Int> {

    override fun asImmutable(): Vec2i

    // Unary operations

    override operator fun unaryPlus(): MutVec2i

    override operator fun unaryMinus(): MutVec2i

    // Double operations

    override operator fun plus(right: Vec2d): MutVec2i = plus(right.x, right.y)

    override operator fun plus(rightScalar: Double): MutVec2i = plus(rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double): MutVec2i

    override operator fun minus(right: Vec2d): MutVec2i = minus(right.x, right.y)

    override operator fun minus(rightScalar: Double): MutVec2i = minus(rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double): MutVec2i

    override operator fun times(scalar: Double): MutVec2i

    override operator fun times(right: Vec2d): MutVec2i

    // Float operations

    override operator fun plus(right: Vec2f): MutVec2i = plus(right.x, right.y)

    override operator fun plus(rightScalar: Float): MutVec2i = plus(rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float): MutVec2i

    override operator fun minus(right: Vec2f): MutVec2i = minus(right.x, right.y)

    override operator fun minus(rightScalar: Float): MutVec2i = minus(rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float): MutVec2i

    override operator fun times(scalar: Float): MutVec2i

    override operator fun times(right: Vec2f): MutVec2i

    override fun dot(right: Vec2f): Float

    override operator fun plus(right: Vec2i): MutVec2i = plus(right.x, right.y)

    override operator fun plus(rightScalar: Int): MutVec2i = plus(rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int): MutVec2i

    override operator fun minus(right: Vec2i): MutVec2i = minus(right.x, right.y)

    override operator fun minus(rightScalar: Int): MutVec2i = minus(rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int): MutVec2i

    override operator fun times(scalar: Int): MutVec2i

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    override operator fun times(right: Vec2i): MutVec2i

    // Long operations

    override operator fun plus(right: Vec2l): MutVec2i = plus(right.x, right.y)

    override operator fun plus(rightScalar: Long): MutVec2i = plus(rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long): MutVec2i

    override operator fun minus(right: Vec2l): MutVec2i = minus(right.x, right.y)

    override operator fun minus(rightScalar: Long): MutVec2i = minus(rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long): MutVec2i

    override operator fun times(scalar: Long): MutVec2i

    override operator fun times(right: Vec2l): MutVec2i
}

interface MutVec2f : MutVec2<Float> {
    override fun asImmutable(): Vec2f

    // Unary operations

    override operator fun unaryPlus(): MutVec2f

    override operator fun unaryMinus(): MutVec2f

    // Double operations

    override operator fun plus(right: Vec2d): MutVec2f = plus(right.x, right.y)

    override operator fun plus(rightScalar: Double): MutVec2f = plus(rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double): MutVec2f

    override operator fun minus(right: Vec2d): MutVec2f = minus(right.x, right.y)

    override operator fun minus(rightScalar: Double): MutVec2f = minus(rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double): MutVec2f

    override operator fun times(scalar: Double): MutVec2f

    override operator fun times(right: Vec2d): MutVec2f

    // Float operations

    override operator fun plus(right: Vec2f): MutVec2f = plus(right.x, right.y)

    override operator fun plus(rightScalar: Float): MutVec2f = plus(rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float): MutVec2f

    override operator fun minus(right: Vec2f): MutVec2f = minus(right.x, right.y)

    override operator fun minus(rightScalar: Float): MutVec2f = minus(rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float): MutVec2f

    override operator fun times(scalar: Float): MutVec2f

    override operator fun times(right: Vec2f): MutVec2f

    override fun dot(right: Vec2f): Float

    override operator fun plus(right: Vec2i): MutVec2f = plus(right.x, right.y)

    override operator fun plus(rightScalar: Int): MutVec2f = plus(rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int): MutVec2f

    override operator fun minus(right: Vec2i): MutVec2f = minus(right.x, right.y)

    override operator fun minus(rightScalar: Int): MutVec2f = minus(rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int): MutVec2f

    override operator fun times(scalar: Int): MutVec2f

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    override operator fun times(right: Vec2i): MutVec2f

    // Long operations

    override operator fun plus(right: Vec2l): MutVec2f = plus(right.x, right.y)

    override operator fun plus(rightScalar: Long): MutVec2f = plus(rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long): MutVec2f

    override operator fun minus(right: Vec2l): MutVec2f = minus(right.x, right.y)

    override operator fun minus(rightScalar: Long): MutVec2f = minus(rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long): MutVec2f

    override operator fun times(scalar: Long): MutVec2f

    override operator fun times(right: Vec2l): MutVec2f
}

interface MutVec2l : MutVec2<Long> {

    override fun asImmutable(): Vec2l

    // Unary operations

    override operator fun unaryPlus(): MutVec2l

    override operator fun unaryMinus(): MutVec2l

    // Double operations

    override operator fun plus(right: Vec2d): MutVec2l = plus(right.x, right.y)

    override operator fun plus(rightScalar: Double): MutVec2l = plus(rightScalar, rightScalar)

    override fun plus(rightX: Double, rightY: Double): MutVec2l

    override operator fun minus(right: Vec2d): MutVec2l = minus(right.x, right.y)

    override operator fun minus(rightScalar: Double): MutVec2l = minus(rightScalar, rightScalar)

    override fun minus(rightX: Double, rightY: Double): MutVec2l

    override operator fun times(scalar: Double): MutVec2l

    override operator fun times(right: Vec2d): MutVec2l

    // Float operations

    override operator fun plus(right: Vec2f): MutVec2l = plus(right.x, right.y)

    override operator fun plus(rightScalar: Float): MutVec2l = plus(rightScalar, rightScalar)

    override fun plus(rightX: Float, rightY: Float): MutVec2l

    override operator fun minus(right: Vec2f): MutVec2l = minus(right.x, right.y)

    override operator fun minus(rightScalar: Float): MutVec2l = minus(rightScalar, rightScalar)

    override fun minus(rightX: Float, rightY: Float): MutVec2l

    override operator fun times(scalar: Float): MutVec2l

    override operator fun times(right: Vec2f): MutVec2l

    override fun dot(right: Vec2f): Float

    override operator fun plus(right: Vec2i): MutVec2l = plus(right.x, right.y)

    override operator fun plus(rightScalar: Int): MutVec2l = plus(rightScalar, rightScalar)

    override fun plus(rightX: Int, rightY: Int): MutVec2l

    override operator fun minus(right: Vec2i): MutVec2l = minus(right.x, right.y)

    override operator fun minus(rightScalar: Int): MutVec2l = minus(rightScalar, rightScalar)

    override fun minus(rightX: Int, rightY: Int): MutVec2l

    override operator fun times(scalar: Int): MutVec2l

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    override operator fun times(right: Vec2i): MutVec2l

    // Long operations

    override operator fun plus(right: Vec2l): MutVec2l = plus(right.x, right.y)

    override operator fun plus(rightScalar: Long): MutVec2l = plus(rightScalar, rightScalar)

    override fun plus(rightX: Long, rightY: Long): MutVec2l

    override operator fun minus(right: Vec2l): MutVec2l = minus(right.x, right.y)

    override operator fun minus(rightScalar: Long): MutVec2l = minus(rightScalar, rightScalar)

    override fun minus(rightX: Long, rightY: Long): MutVec2l

    override operator fun times(scalar: Long): MutVec2l

    override operator fun times(right: Vec2l): MutVec2l
}
