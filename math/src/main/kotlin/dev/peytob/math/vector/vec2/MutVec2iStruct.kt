package dev.peytob.math.vector.vec2

internal class MutVec2iStruct(
    override var x: Int,
    override var y: Int
) : MutVec2i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 2

    override fun asImmutable(): Vec2<Int> = Vec2iStruct(x, y)

    override fun unaryPlus(): MutVec2<Int> {
        return this
    }

    override fun unaryMinus(): MutVec2<Int> {
        x = -x
        y = -y
        return this
    }

    override fun plus(rightX: Double, rightY: Double): MutVec2<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Double, rightY: Double): MutVec2<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Double): MutVec2<Int> {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2d): MutVec2<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

    override fun plus(rightX: Float, rightY: Float): MutVec2<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Float, rightY: Float): MutVec2<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Float): MutVec2<Int> {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2f): MutVec2<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

    override fun plus(rightX: Int, rightY: Int): MutVec2<Int> {
        x += rightX
        y += rightY
        return this

    }

    override fun minus(rightX: Int, rightY: Int): MutVec2<Int> {
        x -= rightX
        y -= rightY
        return this
    }

    override fun times(scalar: Int): MutVec2<Int> {
        x *= scalar
        y *= scalar
        return this
    }

    override fun times(right: Vec2i): MutVec2<Int> {
        x *= right.x
        y *= right.y
        return this
    }

    override fun plus(rightX: Long, rightY: Long): MutVec2<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        return this
    }

    override fun minus(rightX: Long, rightY: Long): MutVec2<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        return this
    }

    override fun times(scalar: Long): MutVec2<Int> {
        x *= scalar.toInt()
        y *= scalar.toInt()
        return this
    }

    override fun times(right: Vec2l): MutVec2<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        return this
    }

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

    override fun toString(): String {
        return "MutVec2is(x=$x, y=$y)"
    }
}
