package dev.peytob.math.vector.vec2

internal class MutVec2lStruct(
    override var x: Long,
    override var y: Long
) : MutVec2l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * 2

    override fun asImmutable(): Vec2l = Vec2lStruct(x, y)

    override fun unaryPlus(): MutVec2l {
        return this
    }

    override fun unaryMinus(): MutVec2l {
        x = -x
        y = -y
        return this
    }

    override fun plus(rightX: Double, rightY: Double): MutVec2l {
        x += rightX.toLong()
        y += rightY.toLong()
        return this
    }

    override fun minus(rightX: Double, rightY: Double): MutVec2l {
        x -= rightX.toLong()
        y -= rightY.toLong()
        return this
    }

    override fun times(scalar: Double): MutVec2l {
        x *= scalar.toLong()
        y *= scalar.toLong()
        return this
    }

    override fun times(right: Vec2d): MutVec2l {
        x *= right.x.toLong()
        y *= right.y.toLong()
        return this
    }

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): MutVec2l {
        x += rightX.toLong()
        y += rightY.toLong()
        return this
    }

    override fun minus(rightX: Float, rightY: Float): MutVec2l {
        x -= rightX.toLong()
        y -= rightY.toLong()
        return this
    }

    override fun times(scalar: Float): MutVec2l {
        x *= scalar.toLong()
        y *= scalar.toLong()
        return this
    }

    override fun times(right: Vec2f): MutVec2l {
        x *= right.x.toLong()
        y *= right.y.toLong()
        return this
    }

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): MutVec2l {
        x += rightX
        y += rightY
        return this

    }

    override fun minus(rightX: Int, rightY: Int): MutVec2l {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Int): MutVec2l {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2i): MutVec2l {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): MutVec2l {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Long, rightY: Long): MutVec2l {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Long): MutVec2l {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2l): MutVec2l {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutVec2lStruct

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String = "MutVec2ls(x=$x, y=$y)"
}
