package dev.peytob.math.noise

import dev.peytob.math.vector.vec2.immutableVec2f
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.Test

abstract class Noise2DTest {

    abstract fun getNoise2D(): Noise2D

    @Test
    fun returnsSomeValueEachCallWithSomeArguments() {
        val noise2D = getNoise2D()

        val someCoordinates = immutableVec2f(43.1f, 33.5f)

        val firstNoiseValue = noise2D.getPoint(someCoordinates)
        val secondNoiseValue = noise2D.getPoint(someCoordinates)

        assertEquals(firstNoiseValue, secondNoiseValue)
    }

    @Test
    fun aroundZeroRectInContractRange() {
        val noise2D = getNoise2D()

        for (x in -500..500) {
            for (y in -500..500) {
                val coordinates = immutableVec2f(x / 10f, y / 10f)
                val value = noise2D.getPoint(coordinates)

                if (value > 1.0f || value < -1.0f) {
                    fail<String>("Bad noise value found. Coordinates: (${coordinates.x}, ${coordinates.y}). Value: $value")
                }
            }
        }
    }
}
