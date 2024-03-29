package dev.peytob.math.noise

import dev.peytob.math.vector.vec2.Vec2f

/**
 * Fractal Brownian Motion.
 * Decorates noise to add additional noise iterations (octaves) with different amplitude and frequency. But it is not
 * just noise decorator, because it realises complete noise algorithm.
 */
class FbmNoise2D(
    private val noise2D: Noise2D,
    private val octaves: Int,
    private val lacunarity: Float = 2f,
    private val persistence: Float = 0.5f
) : Noise2D {

    override fun getPoint(point: Vec2f): Float = getPoint(point.x, point.y)

    override fun getPoint(x: Float, y: Float): Float {
        var amplitude = 1f
        var max = 0.0f
        var result = 0.0f
        var fx = x
        var fy = y

        for (octave in 0 ..< octaves) {
            max += amplitude
            result += noise2D.getPoint(fx, fy) * amplitude
            amplitude *= persistence
            fx *= lacunarity
            fy *= lacunarity
        }

        return result / max
    }
}