package dev.peytob.math.noise

import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.vec2.*
import kotlin.math.floor
import kotlin.math.min

/**
 * Worley, Voronoi or cellular noise.
 * Outputs a distance value from given coordinate to the closest random-generated point. This realisation based on
 * grid points distribution.
 */
class WorleyNoise2D(
    random1D: Random1D
) : Noise2D {

    private val goldNoise2DX = GoldNoise2D(random1D)
    private val goldNoise2DY = GoldNoise2D(random1D)

    override fun getPoint(point: Vec2f): Float {
        val integerPoint = immutableVec2i(
            floor(point.x).toInt(),
            floor(point.y).toInt())

        val fractionalPoint = immutableVec2f(point.x - integerPoint.x, point.y - integerPoint.y)

        var minimalDistance = Float.MAX_VALUE
        for (y in -1..1) {
            for (x in -1..1) {
                val neighbour = immutableVec2f(x.toFloat(), y.toFloat())
                val xy = immutableVec2f(neighbour.x + integerPoint.x, neighbour.y + integerPoint.y)
                val neighbourPoint = immutableVec2f(goldNoise2DX.getPoint(xy), goldNoise2DY.getPoint(xy))
                val diff = neighbour + neighbourPoint - fractionalPoint
                val dist = diff.length()
                minimalDistance = min(minimalDistance, dist)
            }
        }

        return min(minimalDistance, 1.0f)
    }

    override fun getPoint(x: Float, y: Float) = getPoint(immutableVec2f(x, y))
}
