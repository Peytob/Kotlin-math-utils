package dev.peytob.math.noise

import dev.peytob.math.PHI
import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.distance
import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.times
import kotlin.math.floor
import kotlin.math.tan

/**
 * Simple and very fast noise. Can be used as part of other noises
 */
class GoldNoise2D(
    random: Random1D
) : Noise2D {

    private val seed = random.nextFloat()

    override fun getPoint(point: Vec2f): Float {
        val dist = distance(point, point * PHI)
        val tan = tan(dist) * seed * point.x
        return tan - floor(tan)
    }

    override fun getPoint(x: Float, y: Float): Float = getPoint(immutableVec2f(x, y))
}