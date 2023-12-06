package dev.peytob.wpg.utils.noise

import dev.peytob.wpg.math.vector.immutableVec2F
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

abstract class Noise2DTest {

    abstract fun getNoise2D(): Noise2D

    @Test
    fun returnsSomeValueEachCallWithSomeArguments() {
        val noise2D = getNoise2D()

        val someCoordinates = immutableVec2F(43.1f, 33.5f)

        val firstNoiseValue = noise2D.getPoint(someCoordinates)
        val secondNoiseValue = noise2D.getPoint(someCoordinates)

        assertEquals(firstNoiseValue, secondNoiseValue)
    }
}
