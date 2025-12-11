package dev.peytob.math.noise

import dev.peytob.math.vec.Vec2f
import dev.peytob.math.vec.length
import dev.peytob.math.vec.vec2f
import dev.peytob.math.vec.vec2i
import kotlin.math.floor
import kotlin.math.min

/**
 * Worley, Voronoi or cellular noise.
 * Outputs a distance value from given coordinate to the closest random-generated point. This realisation based on
 * grid points distribution.
 */
class WorleyNoise2D(
    seed: Int
) : Noise2D {

    private val goldNoise2DX = GoldNoise2D(seed)
    private val goldNoise2DY = GoldNoise2D(seed.inv())

    override fun getPoint(point: Vec2f): Float {
        val integerPoint = vec2i(
            floor(point.x).toInt(),
            floor(point.y).toInt())

        val fractionalPoint = vec2f(point.x - integerPoint.x, point.y - integerPoint.y)

        var minimalDistance = Float.MAX_VALUE
        for (y in -1..1) {
            for (x in -1..1) {
                val neighbour = vec2f(x.toFloat(), y.toFloat())
                val xy = vec2f(neighbour.x + integerPoint.x, neighbour.y + integerPoint.y)
                val neighbourPoint = vec2f(goldNoise2DX.getPoint(xy), goldNoise2DY.getPoint(xy))
                val diff = neighbour + neighbourPoint - fractionalPoint
                val dist = length(diff)
                minimalDistance = min(minimalDistance, dist)
            }
        }

        return min(minimalDistance, 1.0f)
    }

    override fun getPoint(x: Float, y: Float) = getPoint(vec2f(x, y))
}