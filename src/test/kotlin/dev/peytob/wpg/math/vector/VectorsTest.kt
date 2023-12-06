package dev.peytob.wpg.math.vector

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VectorsTest {

    @Test
    fun normalizedVectorComputesCorrect() {
        val vec2 = immutableVec2F(3f, 4f)
        val normalized = vec2.normalize()
        val result = immutableVec2F(3f / 5f, 4f / 5f)

        assertEquals(normalized, result)
    }
}
