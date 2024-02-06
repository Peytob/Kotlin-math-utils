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

    override fun getPoint(point: Vec2F): Float {
        val integerPoint = immutableVec2I(
            floor(point.x).toInt(),
            floor(point.y).toInt())

        val fractionalPoint = immutableVec2F(point.x - integerPoint.x, point.y - integerPoint.y)

        var minimalDistance = Float.MAX_VALUE
        for (y in -1..1) {
            for (x in -1..1) {
                val neighbour = immutableVec2F(x.toFloat(), y.toFloat())
                val neighbourPoint = getStaticRandomPoint(neighbour.x + integerPoint.x, neighbour.y + integerPoint.y)
                val diff = neighbour + neighbourPoint - fractionalPoint
                val dist = diff.length()
                minimalDistance = min(minimalDistance, dist)
            }
        }

        return minimalDistance
    }

    override fun getPoint(x: Float, y: Float) = getPoint(immutableVec2F(x, y))

    private fun getStaticRandomPoint(x: Float, y: Float): Vec2F {
        val xy = immutableVec2F(x, y)
        return immutableVec2F(goldNoise(xy, 0.124f), goldNoise(xy, seed * 0.775f))
    }

    private fun goldNoise(point: Vec2F, seed: Float): Float {
        val dist = distance(point * PHI, point)
        val tan = tan(dist) * seed * point.x
        return tan - floor(tan)
    }
}
