package dev.peytob.math.noise

import dev.peytob.math.vector.Vec2F
import dev.peytob.math.vector.immutableVec2F
import kotlin.math.floor
import kotlin.random.Random

class PerlinNoise(
    random: Random = Random.Default
) : Noise2D {

    private companion object {
        const val RANDOM_TABLE_SIZE = 512 // Should be any positive degree of 2
        const val CELL_LIMIT = RANDOM_TABLE_SIZE / 2
        val GRADIENT_VECTORS = arrayOf(
            immutableVec2F(1.0f, 1.0f),
            immutableVec2F(-1.0f, 1.0f),
            immutableVec2F(-1.0f, -1.0f),
            immutableVec2F(1.0f, -1.0f)
        )

        fun generatePermutationTable(random: Random): List<Int> =
            (0 ..< CELL_LIMIT)
            .plus(0 ..< CELL_LIMIT)
            .shuffled()
            .toList()
    }

    private val permutationTable = generatePermutationTable(random)

    override fun getPoint(vec2F: Vec2F): Float = getPoint(vec2F.x, vec2F.y)

    override fun getPoint(x: Float, y: Float): Float {
        val integerX = floor(x).toInt() and (CELL_LIMIT - 1)
        val integerY = floor(y).toInt() and (CELL_LIMIT - 1)

        val fractionalX = x - integerX
        val fractionalY = y - integerY

        // TODO Garbage collector, forgive me

        val topRight = immutableVec2F(fractionalX - 1.0f, fractionalY - 1.0f)
        val topLeft = immutableVec2F(fractionalX, fractionalY - 1.0f)
        val bottomRight = immutableVec2F(fractionalX - 1.0f, fractionalY)
        val bottomLeft = immutableVec2F(fractionalX, fractionalY)

        val dotTopRight = topRight.dot(getGradientVector(integerX + 1, integerY + 1))
        val dotTopLeft = topLeft.dot(getGradientVector(integerX, integerY + 1))
        val dotBottomRight = bottomRight.dot(getGradientVector(integerX + 1, integerY))
        val dotBottomLeft = bottomLeft.dot(getGradientVector(integerX, integerY))

        val u = fade(fractionalX)
        val v = fade(fractionalY)

        return interpolate(
            u,
            interpolate(v, dotBottomLeft, dotTopLeft),
            interpolate(v, dotBottomRight, dotTopRight)
        )
    }

    private fun getGradientVector(x: Int, y: Int): Vec2F {
        val h = permutationTable[permutationTable[x] + y] and 3
        return GRADIENT_VECTORS[h]
    }

    // Create separated fade and interpolation interfaces

    private fun fade(t: Float): Float = ((6 * t - 15) * t + 10) * t * t * t

    private fun interpolate(t: Float, a1: Float, a2: Float): Float = a1 + t * (a2 - a1)
}