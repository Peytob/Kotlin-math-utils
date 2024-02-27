package dev.peytob.math.vector

import kotlin.math.roundToInt

class Vec2i internal constructor(
    override val x: Int,
    override val y: Int
) : Vec2<Int> {

    override fun plus(x: Int, y: Int): Vec2i = Vec2i(this.x + x, this.y + y)

    override fun minus(x: Int, y: Int): Vec2i = Vec2i(this.x - x, this.y - y)

    override fun div(x: Int, y: Int): Vec2i = Vec2i(this.x / x, this.y / y)

    override fun times(scalar: Number): Vec2i = times(scalar.toFloat())

    fun times(scalar: Float): Vec2i {
        val floatX = this.x * scalar
        val floatY = this.y * scalar
        return Vec2i(floatX.roundToInt(), floatY.roundToInt())
    }

    override fun times(vec2: Vec2<Int>): Vec2i = Vec2i(x * vec2.x, y * vec2.y)

    override fun dot(vec2: Vec2<Int>): Int = x * vec2.x + y * vec2.y

    override fun isImmutable(): Boolean = true

    override fun toImmutable(): Vec2i = this

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vec2i

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String {
        return "vec2i($x, $y)"
    }
}
