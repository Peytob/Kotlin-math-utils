package dev.peytob.math.noise

import dev.peytob.math.vec.Vec2f

/**
 * Returns noise value for given point. Value should be same for same points (x, y).
 * Values should be in range [0, 1].
 */
interface Noise2D {

    fun getPoint(point: Vec2f): Float

    fun getPoint(x: Float, y: Float): Float
}