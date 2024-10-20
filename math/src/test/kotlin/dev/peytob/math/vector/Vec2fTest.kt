package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.minus
import dev.peytob.math.vector.vec2.plus
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Vec2fTest {

    @Test
    fun equalsMethodTest() {
        val x = 431.543f
        val y = -223.3425f
        val first = immutableVec2f(x, y)
        val second = immutableVec2f(x, y)
        assertEquals(first, second)
    }

    @Test
    fun additionOperationTest() {
        val left = immutableVec2f(1.0f, 6.2f)
        val right = immutableVec2f(2.3f, 1.1f)
        val result = left.plus(right)
        assertEquals(result.x, left.x + right.x)
        assertEquals(result.y, left.y + right.y)
    }

    @Test
    fun subtractionOperationTest() {
        val left = immutableVec2f(-4.2f, -10.0f)
        val right = immutableVec2f(3.1f, 5.3f)
        val result = left.minus(right)
        assertEquals(result.x, left.x - right.x)
        assertEquals(result.y, left.y - right.y)
    }
}
