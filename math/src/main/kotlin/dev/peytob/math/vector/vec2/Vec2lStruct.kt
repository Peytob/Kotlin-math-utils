package dev.peytob.math.vector.vec2

internal data class Vec2lStruct(
    override val x: Long,
    override val y: Long
) : Vec2l {
    override fun asMutable(): MutVec2<Long> = MutVec2lStruct(x, y)

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * 2

    override fun unaryPlus(): Vec2l = this

    override fun unaryMinus(): Vec2l = Vec2lStruct(-x, -y)

    override fun plus(rightX: Double, rightY: Double): Vec2l = Vec2lStruct((x + rightX).toLong(), (y + rightY).toLong())

    override fun minus(rightX: Double, rightY: Double): Vec2l = Vec2lStruct((x - rightX).toLong(), (y - rightY).toLong())

    override fun times(scalar: Double): Vec2l = Vec2lStruct((x * scalar).toLong(), (y * scalar).toLong())

    override fun times(right: Vec2d): Vec2l = Vec2lStruct((x * right.x).toLong(), (y * right.y).toLong())

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): Vec2l = Vec2lStruct((x + rightX).toLong(), (y + rightY).toLong())

    override fun minus(rightX: Float, rightY: Float): Vec2l = Vec2lStruct((x - rightX).toLong(), (y - rightY).toLong())

    override fun times(scalar: Float): Vec2l = Vec2lStruct((x * scalar).toLong(), (y * scalar).toLong())

    override fun times(right: Vec2f): Vec2l = Vec2lStruct((x * right.x).toLong(), (y * right.y).toLong())

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): Vec2l = Vec2lStruct(x + rightX, y + rightY)

    override fun minus(rightX: Int, rightY: Int): Vec2l = Vec2lStruct(x - rightX, y - rightY)

    override fun times(scalar: Int): Vec2l = Vec2lStruct(x * scalar, y * scalar)

    override fun times(right: Vec2i): Vec2l = Vec2lStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2<Int>): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): Vec2l = Vec2lStruct(x + rightX, y + rightY)

    override fun minus(rightX: Long, rightY: Long): Vec2l = Vec2lStruct(x - rightX, y - rightY)

    override fun times(scalar: Long): Vec2l = Vec2lStruct(x * scalar, y * scalar)

    override fun times(right: Vec2l): Vec2l = Vec2lStruct(x * right.x, y * right.y)

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun toString(): String = "Vec2ls(x=$x, y=$y)"
}
