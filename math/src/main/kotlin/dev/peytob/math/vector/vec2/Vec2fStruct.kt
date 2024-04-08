package dev.peytob.math.vector.vec2

internal data class Vec2fStruct(
    override val x: Float,
    override val y: Float
) : Vec2f {
    override fun asMutable(): MutVec2f = MutVec2fStruct(x, y)

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * 2

    override fun unaryPlus(): Vec2f = this

    override fun unaryMinus(): Vec2f = Vec2fStruct(-x, -y)

    override fun plus(rightX: Double, rightY: Double): Vec2f = Vec2fStruct(x + rightX.toFloat(), y + rightY.toFloat())

    override fun minus(rightX: Double, rightY: Double): Vec2f = Vec2fStruct(x - rightX.toFloat(), y - rightY.toFloat())

    override fun times(scalar: Double): Vec2f {
        val floatScalar = scalar.toFloat()
        return Vec2fStruct(x * floatScalar, y * floatScalar)
    }

    override fun times(right: Vec2d): Vec2f = Vec2fStruct(x * right.x.toFloat(), y * right.y.toFloat())

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): Vec2f = Vec2fStruct(x + rightX, y + rightY)

    override fun minus(rightX: Float, rightY: Float): Vec2f = Vec2fStruct(x - rightX, y - rightY)

    override fun times(scalar: Float): Vec2f = Vec2fStruct(x * scalar, y * scalar)

    override fun times(right: Vec2f): Vec2f = Vec2fStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): Vec2f = Vec2fStruct(x + rightX, y + rightY)

    override fun minus(rightX: Int, rightY: Int): Vec2f = Vec2fStruct(x - rightX, y - rightY)

    override fun times(scalar: Int): Vec2f = Vec2fStruct(x * scalar, y * scalar)

    override fun times(right: Vec2i): Vec2f = Vec2fStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2<Int>): Float = x * right.x + y * right.y

    override fun plus(rightX: Long, rightY: Long): Vec2f = Vec2fStruct(x + rightX, y + rightY)

    override fun minus(rightX: Long, rightY: Long): Vec2f = Vec2fStruct(x - rightX, y - rightY)

    override fun times(scalar: Long): Vec2f = Vec2fStruct(x * scalar, y * scalar)

    override fun times(right: Vec2l): Vec2f = Vec2fStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2l): Float = x * right.x + y * right.y

    override fun toString(): String = "Vec2fs(x=$x, y=$y)"
}
