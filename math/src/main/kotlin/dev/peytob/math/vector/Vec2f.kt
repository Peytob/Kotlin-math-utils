package dev.peytob.math.vector

class Vec2f internal constructor(
    override val x: Float,
    override val y: Float
) : Vec2<Float> {

    override fun plus(x: Float, y: Float): Vec2f = Vec2f(this.x + x, this.y + y)

    override fun minus(x: Float, y: Float): Vec2f = Vec2f(this.x - x, this.y - y)

    override fun div(x: Float, y: Float): Vec2f = Vec2f(this.x / x, this.y / y)

    override fun times(scalar: Number): Vec2f = times(scalar.toFloat())

    fun times(scalar: Float): Vec2f = Vec2f(this.x * scalar, this.y * scalar)

    override fun times(vec2: Vec2<Float>): Vec2f = Vec2f(this.x * vec2.x, this.y * vec2.y)

    override fun dot(vec2: Vec2<Float>): Float = x * vec2.x + y * vec2.y

    override fun isImmutable(): Boolean = true

    override fun toImmutable(): Vec2f = this

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vec2f

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String {
        return "vec2f($x, $y)"
    }
}
