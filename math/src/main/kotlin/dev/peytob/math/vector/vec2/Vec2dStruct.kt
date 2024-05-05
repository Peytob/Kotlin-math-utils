package dev.peytob.math.vector.vec2

internal data class Vec2dStruct(
    override val x: Double,
    override val y: Double
): Vec2d {
    override fun asMutable(): MutVec2d = MutVec2dStruct(x, y)

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * 2

    override fun unaryPlus(): Vec2d = this

    override fun unaryMinus(): Vec2d = Vec2dStruct(-x, -y)

    override fun plus(rightX: Double, rightY: Double): Vec2d = Vec2dStruct(x + rightX, y + rightY)

    override fun minus(rightX: Double, rightY: Double): Vec2d = Vec2dStruct(x - rightX, y - rightY)

    override fun times(scalar: Double): Vec2d = Vec2dStruct(x * scalar, y * scalar)

    override fun times(right: Vec2d): Vec2d = Vec2dStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): Vec2d = Vec2dStruct(x + rightX, y + rightY)

    override fun minus(rightX: Float, rightY: Float): Vec2d = Vec2dStruct(x - rightX, y - rightY)

    override fun times(scalar: Float): Vec2d = Vec2dStruct(x * scalar, y * scalar)

    override fun times(right: Vec2f): Vec2d = Vec2dStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2f): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Int, rightY: Int): Vec2d = Vec2dStruct(x + rightX, y + rightY)

    override fun minus(rightX: Int, rightY: Int): Vec2d = Vec2dStruct(x - rightX, y - rightY)

    override fun times(scalar: Int): Vec2d = Vec2dStruct(x * scalar, y * scalar)

    override fun times(right: Vec2i): Vec2d = Vec2dStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): Vec2d = Vec2dStruct(x + rightX, y + rightY)

    override fun minus(rightX: Long, rightY: Long): Vec2d = Vec2dStruct(x - rightX, y - rightY)

    override fun times(scalar: Long): Vec2d = Vec2dStruct(x * scalar, y * scalar)

    override fun times(right: Vec2l): Vec2d = Vec2dStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun toDouble(): Vec2d = this

    override fun toFloat(): Vec2f = Vec2fStruct(x.toFloat(), y.toFloat())

    override fun toInt(): Vec2i = Vec2iStruct(x.toInt(), y.toInt())

    override fun toLong(): Vec2l = Vec2lStruct(x.toLong(), y.toLong())

    override fun toString(): String = "Vec2ds(x=$x, y=$y)"
}
