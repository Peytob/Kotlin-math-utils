package dev.peytob.wpg.math.vector

interface Vec2<T : Number> {

    val x: T

    val y: T

    operator fun plus(right: Vec2<T>): Vec2<T> {
        return plus(right.x, right.y)
    }

    fun plus(x: T, y: T): Vec2<T>

    operator fun minus(right: Vec2<T>): Vec2<T> {
        return minus(right.x, right.y)
    }

    fun minus(x: T, y: T): Vec2<T>

    operator fun div(right: Vec2<T>): Vec2<T> {
        return div(right.x, right.y)
    }

    /**
     * Component-wise division.
     * @return Returns vector (l.x / r.x, l.y / r.x)
     */
    fun div(x: T, y: T): Vec2<T>

    operator fun times(scalar: Number): Vec2<T>

    /**
     * Implements scalar (component-wise) vector multiplication.
     */
    operator fun times(vec2: Vec2<T>): Vec2<T>

    fun dot(vec2: Vec2<T>): T

    fun isImmutable(): Boolean

    fun toImmutable(): Vec2<T>
}