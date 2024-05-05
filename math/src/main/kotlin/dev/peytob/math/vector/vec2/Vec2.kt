package dev.peytob.math.vector.vec2

sealed interface Vec2<T : Number> : Vec2Accessor<T> {

    /**
     * Creates mutable copy of this vector
     */
    fun asMutable(): MutVec2<T>

    // Unary operations

    operator fun unaryPlus(): Vec2<T>

    operator fun unaryMinus(): Vec2<T>

    // Double operations

    operator fun plus(right: Vec2d): Vec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Double): Vec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Double, rightY: Double): Vec2<T>

    operator fun minus(right: Vec2d): Vec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Double): Vec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Double, rightY: Double): Vec2<T>

    operator fun times(scalar: Double): Vec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2d): Vec2<T>

    fun dot(right: Vec2d): Float

    // Float operations

    operator fun plus(right: Vec2f): Vec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Float): Vec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Float, rightY: Float): Vec2<T>

    operator fun minus(right: Vec2f): Vec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Float): Vec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Float, rightY: Float): Vec2<T>

    operator fun times(scalar: Float): Vec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2f): Vec2<T>

    fun dot(right: Vec2f): Float

    // Int operations

    operator fun plus(right: Vec2i): Vec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Int): Vec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Int, rightY: Int): Vec2<T>

    operator fun minus(right: Vec2i): Vec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Int): Vec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Int, rightY: Int): Vec2<T>

    operator fun times(scalar: Int): Vec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2i): Vec2<T>

    fun dot(right: Vec2i): Float

    // Long operations

    operator fun plus(right: Vec2l): Vec2<T> = plus(right.x, right.y)

    operator fun plus(rightScalar: Long): Vec2<T> = plus(rightScalar, rightScalar)

    fun plus(rightX: Long, rightY: Long): Vec2<T>

    operator fun minus(right: Vec2l): Vec2<T> = minus(right.x, right.y)

    operator fun minus(rightScalar: Long): Vec2<T> = minus(rightScalar, rightScalar)

    fun minus(rightX: Long, rightY: Long): Vec2<T>

    operator fun times(scalar: Long): Vec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(right: Vec2l): Vec2<T>

    fun dot(right: Vec2l): Float

    // Converts

    fun toDouble(): Vec2<Double>

    fun toFloat(): Vec2<Float>

    fun toInt(): Vec2<Int>

    fun toLong(): Vec2<Long>
}

// Usable realisations

interface Vec2d : Vec2<Double> {

    override fun asMutable(): MutVec2d

    override fun unaryPlus(): Vec2d

    override fun unaryMinus(): Vec2d

    override fun plus(rightX: Double, rightY: Double): Vec2d

    override fun minus(rightX: Double, rightY: Double): Vec2d

    override fun times(scalar: Double): Vec2d

    override fun times(right: Vec2d): Vec2d

    override fun plus(rightX: Float, rightY: Float): Vec2d

    override fun minus(rightX: Float, rightY: Float): Vec2d

    override fun times(scalar: Float): Vec2d

    override fun times(right: Vec2f): Vec2d

    override fun plus(rightX: Int, rightY: Int): Vec2d

    override fun minus(rightX: Int, rightY: Int): Vec2d

    override fun times(scalar: Int): Vec2d

    override fun times(right: Vec2i): Vec2d

    override fun plus(rightX: Long, rightY: Long): Vec2d

    override fun minus(rightX: Long, rightY: Long): Vec2d

    override fun times(scalar: Long): Vec2d

    override fun times(right: Vec2l): Vec2d

    override fun plus(right: Vec2d): Vec2d = plus(right.x, right.y)

    override fun plus(rightScalar: Double): Vec2d = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2d): Vec2d = minus(right.x, right.y)

    override fun minus(rightScalar: Double): Vec2d = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2f): Vec2d = plus(right.x, right.y)

    override fun plus(rightScalar: Float): Vec2d = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2f): Vec2d = minus(right.x, right.y)

    override fun minus(rightScalar: Float): Vec2d = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2i): Vec2d = plus(right.x, right.y)

    override fun plus(rightScalar: Int): Vec2d = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2i): Vec2d = minus(right.x, right.y)

    override fun minus(rightScalar: Int): Vec2d = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2l): Vec2d = plus(right.x, right.y)

    override fun plus(rightScalar: Long): Vec2d = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2l): Vec2d = minus(right.x, right.y)

    override fun minus(rightScalar: Long): Vec2d = minus(rightScalar, rightScalar)

    override fun toDouble(): Vec2d

    override fun toFloat(): Vec2f

    override fun toInt(): Vec2i

    override fun toLong(): Vec2l
}

interface Vec2i : Vec2<Int> {

    override fun asMutable(): MutVec2i

    override fun unaryPlus(): Vec2i

    override fun unaryMinus(): Vec2i

    override fun plus(rightX: Double, rightY: Double): Vec2i

    override fun minus(rightX: Double, rightY: Double): Vec2i

    override fun times(scalar: Double): Vec2i

    override fun times(right: Vec2d): Vec2i

    override fun plus(rightX: Float, rightY: Float): Vec2i

    override fun minus(rightX: Float, rightY: Float): Vec2i

    override fun times(scalar: Float): Vec2i

    override fun times(right: Vec2f): Vec2i

    override fun plus(rightX: Int, rightY: Int): Vec2i

    override fun minus(rightX: Int, rightY: Int): Vec2i

    override fun times(scalar: Int): Vec2i

    override fun times(right: Vec2i): Vec2i

    override fun plus(rightX: Long, rightY: Long): Vec2i

    override fun minus(rightX: Long, rightY: Long): Vec2i

    override fun times(scalar: Long): Vec2i

    override fun times(right: Vec2l): Vec2i

    override fun plus(right: Vec2d): Vec2i = plus(right.x, right.y)

    override fun plus(rightScalar: Double): Vec2i = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2d): Vec2i = minus(right.x, right.y)

    override fun minus(rightScalar: Double): Vec2i = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2f): Vec2i = plus(right.x, right.y)

    override fun plus(rightScalar: Float): Vec2i = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2f): Vec2i = minus(right.x, right.y)

    override fun minus(rightScalar: Float): Vec2i = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2i): Vec2i = plus(right.x, right.y)

    override fun plus(rightScalar: Int): Vec2i = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2i): Vec2i = minus(right.x, right.y)

    override fun minus(rightScalar: Int): Vec2i = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2l): Vec2i = plus(right.x, right.y)

    override fun plus(rightScalar: Long): Vec2i = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2l): Vec2i = minus(right.x, right.y)

    override fun minus(rightScalar: Long): Vec2i = minus(rightScalar, rightScalar)

    override fun toDouble(): Vec2d

    override fun toFloat(): Vec2f

    override fun toInt(): Vec2i

    override fun toLong(): Vec2l
}

interface Vec2f : Vec2<Float> {

    override fun asMutable(): MutVec2f

    override fun unaryPlus(): Vec2f

    override fun unaryMinus(): Vec2f

    override fun plus(rightX: Double, rightY: Double): Vec2f

    override fun minus(rightX: Double, rightY: Double): Vec2f

    override fun times(scalar: Double): Vec2f

    override fun times(right: Vec2d): Vec2f

    override fun plus(rightX: Float, rightY: Float): Vec2f

    override fun minus(rightX: Float, rightY: Float): Vec2f

    override fun times(scalar: Float): Vec2f

    override fun times(right: Vec2f): Vec2f

    override fun plus(rightX: Int, rightY: Int): Vec2f

    override fun minus(rightX: Int, rightY: Int): Vec2f

    override fun times(scalar: Int): Vec2f

    override fun times(right: Vec2i): Vec2f

    override fun plus(rightX: Long, rightY: Long): Vec2f

    override fun minus(rightX: Long, rightY: Long): Vec2f

    override fun times(scalar: Long): Vec2f

    override fun times(right: Vec2l): Vec2f

    override fun plus(right: Vec2d): Vec2f = plus(right.x, right.y)

    override fun plus(rightScalar: Double): Vec2f = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2d): Vec2f = minus(right.x, right.y)

    override fun minus(rightScalar: Double): Vec2f = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2f): Vec2f = plus(right.x, right.y)

    override fun plus(rightScalar: Float): Vec2f = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2f): Vec2f = minus(right.x, right.y)

    override fun minus(rightScalar: Float): Vec2f = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2i): Vec2f = plus(right.x, right.y)

    override fun plus(rightScalar: Int): Vec2f = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2i): Vec2f = minus(right.x, right.y)

    override fun minus(rightScalar: Int): Vec2f = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2l): Vec2f = plus(right.x, right.y)

    override fun plus(rightScalar: Long): Vec2f = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2l): Vec2f = minus(right.x, right.y)

    override fun minus(rightScalar: Long): Vec2f = minus(rightScalar, rightScalar)

    override fun toDouble(): Vec2d

    override fun toFloat(): Vec2f

    override fun toInt(): Vec2i

    override fun toLong(): Vec2l
}

interface Vec2l : Vec2<Long> {

    override fun asMutable(): MutVec2l

    override fun unaryPlus(): Vec2l

    override fun unaryMinus(): Vec2l

    override fun plus(rightX: Double, rightY: Double): Vec2l

    override fun minus(rightX: Double, rightY: Double): Vec2l

    override fun times(scalar: Double): Vec2l

    override fun times(right: Vec2d): Vec2l

    override fun plus(rightX: Float, rightY: Float): Vec2l

    override fun minus(rightX: Float, rightY: Float): Vec2l

    override fun times(scalar: Float): Vec2l

    override fun times(right: Vec2f): Vec2l

    override fun plus(rightX: Int, rightY: Int): Vec2l

    override fun minus(rightX: Int, rightY: Int): Vec2l

    override fun times(scalar: Int): Vec2l

    override fun times(right: Vec2i): Vec2l

    override fun plus(rightX: Long, rightY: Long): Vec2l

    override fun minus(rightX: Long, rightY: Long): Vec2l

    override fun times(scalar: Long): Vec2l

    override fun times(right: Vec2l): Vec2l

    override fun plus(right: Vec2d): Vec2l =plus(right.x, right.y)

    override fun plus(rightScalar: Double): Vec2l = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2d): Vec2l = minus(right.x, right.y)

    override fun minus(rightScalar: Double): Vec2l = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2f): Vec2l = plus(right.x, right.y)

    override fun plus(rightScalar: Float): Vec2l = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2f): Vec2l = minus(right.x, right.y)

    override fun minus(rightScalar: Float): Vec2l = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2i): Vec2l = plus(right.x, right.y)

    override fun plus(rightScalar: Int): Vec2l = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2i): Vec2l = minus(right.x, right.y)

    override fun minus(rightScalar: Int): Vec2l = minus(rightScalar, rightScalar)

    override fun plus(right: Vec2l): Vec2l = plus(right.x, right.y)

    override fun plus(rightScalar: Long): Vec2l = plus(rightScalar, rightScalar)

    override fun minus(right: Vec2l): Vec2l = minus(right.x, right.y)

    override fun minus(rightScalar: Long): Vec2l = minus(rightScalar, rightScalar)

    override fun toDouble(): Vec2d

    override fun toFloat(): Vec2f

    override fun toInt(): Vec2i

    override fun toLong(): Vec2l
}
