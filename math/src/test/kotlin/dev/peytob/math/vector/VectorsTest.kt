package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.mutableVec2f
import dev.peytob.math.vector.vec2.normalize
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VectorsTest {

    @Test
    fun normalizedVectorComputesCorrect() {
        val vec2 = mutableVec2f(3f, 4f)
        val normalized = vec2.normalize()
        val result = mutableVec2f(3f / 5f, 4f / 5f)

        assertEquals(result, normalized)
    }
}
