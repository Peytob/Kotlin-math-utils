package dev.peytob.math.noise

interface Noise2D {

    fun getPoint(point: Vec2f): Float

    /**
     * Returns noise value for given point. Value should be same for same points (x, y).
     * Values should be in range [0, 1].
     */
    fun getPoint(x: Float, y: Float): Float
}
