package dev.peytob.math.vector.vec2

internal data class Vec2iStruct(
    override val x: Int,
    override val y: Int
) : Vec2i {
    override fun asMutable(): MutVec2i = MutVec2iStruct(x, y)

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 2

    override fun unaryPlus(): Vec2i = this

    override fun unaryMinus(): Vec2i = Vec2iStruct(-x, -y)

    override fun plus(rightX: Double, rightY: Double): Vec2i = Vec2iStruct((x + rightX).toInt(), (y + rightY).toInt())

    override fun minus(rightX: Double, rightY: Double): Vec2i = Vec2iStruct((x - rightX).toInt(), (y - rightY).toInt())

    override fun times(scalar: Double): Vec2i = Vec2iStruct((x * scalar).toInt(), (y * scalar).toInt())

    override fun times(right: Vec2d): Vec2i = Vec2iStruct((x * right.x).toInt(), (y * right.y).toInt())

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): Vec2i = Vec2iStruct((x + rightX).toInt(), (y + rightY).toInt())

    override fun minus(rightX: Float, rightY: Float): Vec2i = Vec2iStruct((x - rightX).toInt(), (y - rightY).toInt())

    override fun times(scalar: Float): Vec2i = Vec2iStruct((x * scalar).toInt(), (y * scalar).toInt())

    override fun times(right: Vec2f): Vec2i = Vec2iStruct((x * right.x).toInt(), (y * right.y).toInt())

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): Vec2i = Vec2iStruct(x + rightX, y + rightY)

    override fun minus(rightX: Int, rightY: Int): Vec2i = Vec2iStruct(x - rightX, y - rightY)

    override fun times(scalar: Int): Vec2i = Vec2iStruct(x * scalar, y * scalar)

    override fun times(right: Vec2i): Vec2i = Vec2iStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): Vec2i = Vec2iStruct(x + rightX.toInt(), y + rightY.toInt())

    override fun minus(rightX: Long, rightY: Long): Vec2i = Vec2iStruct(x - rightX.toInt(), y - rightY.toInt())

    override fun times(scalar: Long): Vec2i = Vec2iStruct(x * scalar.toInt(), y * scalar.toInt())

    override fun times(right: Vec2l): Vec2i = Vec2iStruct(x * right.x.toInt(), y * right.y.toInt())

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun toDouble(): Vec2d = Vec2dStruct(x.toDouble(), y.toDouble())

    override fun toFloat(): Vec2f = Vec2fStruct(x.toFloat(), y.toFloat())

    override fun toInt(): Vec2i = this

    override fun toLong(): Vec2l = Vec2lStruct(x.toLong(), y.toLong())

    override fun toString(): String = "Vec2is(x=$x, y=$y)"
}
