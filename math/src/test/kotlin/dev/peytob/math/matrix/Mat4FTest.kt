package dev.peytob.math.matrix

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
internal class Mat4FTest {
    @Test
    fun equalsMethodTest() {
        val first: Mat4 = immutableMat4F(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 0f, 1f, 2f,
            3f, 4f, 5f, 6f
        )

        val second: Mat4 = immutableMat4F(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 0f, 1f, 2f,
            3f, 4f, 5f, 6f
        )
        assertEquals(first, second)
    }
}