package dev.peytob.math.field

import dev.peytob.math.vec.Vec2f

/**
 * Returns noise vector value for given 2d vector. Value should be same for same points (x, y).
 * Value components should be in range [0, 1].
 */
interface Field22D {

    fun getPoint(point: Vec2f): Vec2f

    fun getPoint(x: Float, y: Float): Vec2f
}
