package dev.peytob.math.field

import dev.peytob.math.noise.Noise2D
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.immutableVec2f

class CurlNoise2D(
    private val baseNoise: Noise2D
) : Field2D {

    override fun getPoint(point: Vec2f): Vec2f = getPoint(point.x, point.y)

    override fun getPoint(x: Float, y: Float): Vec2f {
        val eps = 0.0001f
        val divider = 1 / (2 * eps)

        val dxp = baseNoise.getPoint(x + eps, y)
        val dxn = baseNoise.getPoint(x - eps, y)

        val xAverage = (dxp - dxn) * divider

        val dyp = baseNoise.getPoint(x, y + eps)
        val dyn = baseNoise.getPoint(x, y - eps)

        val yAverage = (dyp - dyn) * divider

        return immutableVec2f(yAverage, xAverage)
    }
}