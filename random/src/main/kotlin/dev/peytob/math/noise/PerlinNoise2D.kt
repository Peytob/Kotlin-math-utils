package dev.peytob.math.noise

import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.dot
import dev.peytob.math.vector.vec2.immutableVec2f
import kotlin.math.floor

/**
 * Classic Perlin noise.
 * Please note that at grid nodes (i.e. points with integer coordinates) the noise value is always 0.5 due to normalization.
 */
class PerlinNoise2D(
    random: Random1D
) : Noise2D {

    private companion object {
        val GRADIENT_VECTORS = arrayOf(
            immutableVec2f(1.0f, 1.0f),
            immutableVec2f(-1.0f, 1.0f),
            immutableVec2f(-1.0f, -1.0f),
            immutableVec2f(1.0f, -1.0f)
        )

        fun generatePermutationTable(random: Random1D): List<Int> =
            (0 ..< 256)
            .plus(0 ..< 256)
            .shuffled(random.asKotlinRandom())
            .toList()
    }

    private val permutationTable = generatePermutationTable(random)

    override fun getPoint(point: Vec2f): Float = getPoint(point.x, point.y)

    override fun getPoint(x: Float, y: Float): Float {
        val integerX = floor(x).toInt() and 255
        val integerY = floor(y).toInt() and 255

        val fractionalX = x - floor(x)
        val fractionalY = y - floor(y)

        // TODO Garbage collector, forgive me

        val topRight = immutableVec2f(fractionalX - 1.0f, fractionalY - 1.0f)
        val topLeft = immutableVec2f(fractionalX, fractionalY - 1.0f)
        val bottomRight = immutableVec2f(fractionalX - 1.0f, fractionalY)
        val bottomLeft = immutableVec2f(fractionalX, fractionalY)

        val dotTopRight = topRight.dot(getGradientVector(integerX + 1, integerY + 1))
        val dotTopLeft = topLeft.dot(getGradientVector(integerX, integerY + 1))
        val dotBottomRight = bottomRight.dot(getGradientVector(integerX + 1, integerY))
        val dotBottomLeft = bottomLeft.dot(getGradientVector(integerX, integerY))

        val u = fade(fractionalX)
        val v = fade(fractionalY)

        // Result in range [-1, 1] and should be converted to [0, 1]
        val result = interpolate(
            u,
            interpolate(v, dotBottomLeft, dotTopLeft),
            interpolate(v, dotBottomRight, dotTopRight)
        )

        return (result + 1) / 2
    }

    private fun getGradientVector(x: Int, y: Int): Vec2f {
        val h = permutationTable[permutationTable[x] + y] and 3
        return GRADIENT_VECTORS[h]
    }

    // Create separated fade and interpolation interfaces

    private fun fade(t: Float): Float = ((6 * t - 15) * t + 10) * t * t * t

    private fun interpolate(t: Float, a1: Float, a2: Float): Float = a1 + t * (a2 - a1)
}