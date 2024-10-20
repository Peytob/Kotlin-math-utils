package dev.peytob.math.noise

import dev.peytob.math.PHI
import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.*
import kotlin.math.*

/**
 * Worley, Voronoi or cellular noise.
 * Outputs a distance value from given coordinate to the closest random-generated point. This realisation based on
 * grid points distribution.
 */
class WorleyNoise2D(
    random1D: Random1D
) : Noise2D {

    private val seed = random1D.nextFloat()

    override fun getPoint(point: Vec2f): Float {
        val integerPoint = immutableVec2i(
            floor(point.x).toInt(),
            floor(point.y).toInt())

        val fractionalPoint = immutableVec2f(point.x - integerPoint.x, point.y - integerPoint.y)

        var minimalDistance = Float.MAX_VALUE
        for (y in -1..1) {
            for (x in -1..1) {
                val neighbour = immutableVec2f(x.toFloat(), y.toFloat())
                val neighbourPoint = getStaticRandomPoint(neighbour.x + integerPoint.x, neighbour.y + integerPoint.y)
                val diff = neighbour + neighbourPoint - fractionalPoint
                val dist = diff.length()
                minimalDistance = min(minimalDistance, dist)
            }
        }

        return min(minimalDistance, 1.0f)
    }

    override fun getPoint(x: Float, y: Float) = getPoint(immutableVec2f(x, y))

    private fun getStaticRandomPoint(x: Float, y: Float): Vec2f {
        val xy = immutableVec2f(x, y)
        return immutableVec2f(goldNoise(xy, 0.124f), goldNoise(xy, seed * 0.775f))
    }

    private fun goldNoise(point: Vec2f, seed: Float): Float {
        val dist = distance(point, point * PHI)
        val tan = tan(dist) * seed * point.x
        return tan - floor(tan)
    }
}
