package dev.peytob.math.field

import dev.peytob.math.vector.vec2.Vec2f

interface Field2D {

    fun getPoint(point: Vec2f): Vec2f

    /**
     * Returns noise value for given point. Value should be same for same points (x, y).
     * Values should be in range [0, 1].
     */
    fun getPoint(x: Float, y: Float): Vec2f
}