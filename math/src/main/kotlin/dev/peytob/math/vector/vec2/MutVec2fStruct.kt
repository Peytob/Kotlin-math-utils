package dev.peytob.math.vector.vec2

internal class MutVec2fStruct(
    override var x: Float,
    override var y: Float
) : MutVec2f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * 2

    override fun asImmutable(): Vec2f = Vec2fStruct(x, y)

    override fun unaryPlus(): MutVec2f {
        return this
    }

    override fun unaryMinus(): MutVec2f {
        x = -x
        y = -y
        return this
    }

    override fun plus(rightX: Double, rightY: Double): MutVec2f {
        x += rightX.toFloat()
        y += rightY.toFloat()
        return this
    }

    override fun minus(rightX: Double, rightY: Double): MutVec2f {
        x -= rightX.toFloat()
        y -= rightY.toFloat()
        return this
    }

    override fun times(scalar: Double): MutVec2f {
        x *= scalar.toFloat()
        y *= scalar.toFloat()
        return this
    }

    override fun times(right: Vec2d): MutVec2f {
        x *= right.x.toFloat()
        y *= right.y.toFloat()
        return this
    }

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): MutVec2f {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Float, rightY: Float): MutVec2f {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Float): MutVec2f {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2f): MutVec2f {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): MutVec2f {
        x += rightX
        y += rightY
        return this

    }

    override fun minus(rightX: Int, rightY: Int): MutVec2f {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Int): MutVec2f {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2i): MutVec2f {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2i): Float = x * right.x + y * right.y

    override fun plus(rightX: Long, rightY: Long): MutVec2f {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Long, rightY: Long): MutVec2f {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Long): MutVec2f {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2l): MutVec2f {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2l): Float = x * right.x + y * right.y

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutVec2fStruct

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String = "MutVec2fs(x=$x, y=$y)"
}
