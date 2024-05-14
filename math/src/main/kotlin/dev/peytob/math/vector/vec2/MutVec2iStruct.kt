package dev.peytob.math.vector.vec2

internal class MutVec2iStruct(
    override var x: Int,
    override var y: Int
) : MutVec2i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 2

    override fun asImmutable(): Vec2i = Vec2iStruct(x, y)

    override fun unaryPlus(): MutVec2i {
        return this
    }

    override fun unaryMinus(): MutVec2i {
        x = -x
        y = -y
        return this
    }

    override fun plus(rightX: Double, rightY: Double): MutVec2i {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Double, rightY: Double): MutVec2i {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Double): MutVec2i {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2d): MutVec2i {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

    override fun dot(right: Vec2d): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Float, rightY: Float): MutVec2i {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Float, rightY: Float): MutVec2i {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Float): MutVec2i {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2f): MutVec2i {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

    override fun dot(right: Vec2f): Float = x * right.x + y * right.y

    override fun plus(rightX: Int, rightY: Int): MutVec2i {
        x += rightX
        y += rightY
        return this

    }

    override fun minus(rightX: Int, rightY: Int): MutVec2i {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Int): MutVec2i {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2i): MutVec2i {
        x *= right.x
        y *= right.y
        return this
    }

    override fun dot(right: Vec2i): Float = (x * right.x + y * right.y).toFloat()

    override fun plus(rightX: Long, rightY: Long): MutVec2i {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Long, rightY: Long): MutVec2i {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Long): MutVec2i {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2l): MutVec2i {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

    override fun dot(right: Vec2l): Float = (x * right.x + y * right.y).toFloat()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as MutVec2iStruct

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String = "MutVec2is(x=$x, y=$y)"
}
