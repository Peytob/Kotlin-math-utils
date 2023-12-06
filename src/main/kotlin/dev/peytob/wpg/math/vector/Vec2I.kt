package dev.peytob.wpg.math.vector

import kotlin.math.roundToInt

class Vec2I internal constructor(
    override val x: Int,
    override val y: Int
) : Vec2<Int> {

    override fun plus(x: Int, y: Int): Vec2I = Vec2I(this.x + x, this.y + y)

    override fun minus(x: Int, y: Int): Vec2I = Vec2I(this.x - x, this.y - y)

    override fun div(x: Int, y: Int): Vec2I = Vec2I(this.x / x, this.y / y)

    override fun times(scalar: Number): Vec2I = times(scalar.toFloat())

    fun times(scalar: Float): Vec2I {
        val floatX = this.x * scalar
        val floatY = this.y * scalar
        return Vec2I(floatX.roundToInt(), floatY.roundToInt())
    }

    override fun isImmutable(): Boolean = true

    override fun toImmutable(): Vec2I = this

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vec2I

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }
}
