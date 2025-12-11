package dev.peytob.math.noise

import dev.peytob.math.PHI
import dev.peytob.math.vec.Vec2f
import dev.peytob.math.vec.distance
import dev.peytob.math.vec.vec2f
import kotlin.math.floor
import kotlin.math.tan

class GoldNoise2D(
    private val seed: Int
) : Noise2D {

    override fun getPoint(point: Vec2f): Float {
        return fract(tan(distance(point*PHI, point)*seed)*point.x)
    }

    override fun getPoint(x: Float, y: Float): Float {
        return getPoint(vec2f(x, y))
    }

    private fun fract(x: Float): Float {
        return x - floor(x)
    }
}
