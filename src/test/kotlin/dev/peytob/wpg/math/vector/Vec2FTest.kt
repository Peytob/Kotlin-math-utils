package dev.peytob.wpg.math.vector

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Vec2FTest {

    @Test
    fun equalsMethodTest() {
        val x = 431.543f
        val y = -223.3425f
        val first = immutableVec2F(x, y)
        val second = immutableVec2F(x, y)
        assertEquals(first, second)
    }

    @Test
    fun additionOperationTest() {
        val left = immutableVec2F(1.0f, 6.2f)
        val right = immutableVec2F(2.3f, 1.1f)
        val result = left.plus(right)
        assertEquals(result.x, left.x + right.x)
        assertEquals(result.y, left.y + right.y)
    }

    @Test
    fun subtractionOperationTest() {
        val left = immutableVec2F(-4.2f, -10.0f)
        val right = immutableVec2F(3.1f, 5.3f)
        val result = left.minus(right)
        assertEquals(result.x, left.x - right.x)
        assertEquals(result.y, left.y - right.y)
    }
}
