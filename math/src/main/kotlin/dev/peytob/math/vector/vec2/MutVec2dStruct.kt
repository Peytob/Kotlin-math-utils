package dev.peytob.math.vector.vec2

internal class MutVec2dStruct(
    override var x: Double,
    override var y: Double
) : MutVec2d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * 2

    override fun asImmutable(): Vec2d = Vec2dStruct(x, y)

    override fun unaryPlus(): MutVec2d {
        return this
    }

    override fun unaryMinus(): MutVec2d {
        x = -x
        y = -y
        return this
    }

    override fun plus(rightX: Double, rightY: Double): MutVec2d {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Double, rightY: Double): MutVec2d {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Double): MutVec2d {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2d): MutVec2d {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): MutVec2d {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Float, rightY: Float): MutVec2d {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Float): MutVec2d {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2f): MutVec2d {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2f): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Int, rightY: Int): MutVec2d {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Int, rightY: Int): MutVec2d {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Int): MutVec2d {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2i): MutVec2d {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): MutVec2d {
        x += rightX
        y += rightY
        return this
    }

    override fun minus(rightX: Long, rightY: Long): MutVec2d {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Long): MutVec2d {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2l): MutVec2d {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutVec2dStruct

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String = "MutVec2ds(x=$x, y=$y)"
}
