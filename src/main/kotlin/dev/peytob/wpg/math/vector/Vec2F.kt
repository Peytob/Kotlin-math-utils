package dev.peytob.wpg.math.vector

class Vec2F internal constructor(
    override val x: Float,
    override val y: Float
) : Vec2<Float> {

    override fun plus(x: Float, y: Float): Vec2F = Vec2F(this.x + x, this.y + y)

    override fun minus(x: Float, y: Float): Vec2F = Vec2F(this.x - x, this.y - y)

    override fun div(x: Float, y: Float): Vec2F = Vec2F(this.x / x, this.y / y)

    override fun times(scalar: Number): Vec2F = times(scalar.toFloat())

    fun times(scalar: Float): Vec2F = Vec2F(this.x * scalar, this.y * scalar)

    override fun isImmutable(): Boolean = true

    override fun toImmutable(): Vec2F = this

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vec2F

        if (x != other.x) return false
        return y == other.y
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }
}
