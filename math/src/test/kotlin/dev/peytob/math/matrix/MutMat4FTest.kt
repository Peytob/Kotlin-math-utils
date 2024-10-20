package dev.peytob.math.matrix

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MutMat4FTest {

    @Test
    fun arrayConstructorThrowsExceptionIfArrayIsBiggerThan4x4Matrix() {
        val data = FloatArray(50)

        assertThrows(IllegalArgumentException::class.java) { immutableMat4f(data) }
    }

    @Test
    fun arrayConstructorThrowsExceptionIfArrayIsLowerThan4x4Matrix() {
        val data = FloatArray(1)

        assertThrows(IllegalArgumentException::class.java) { immutableMat4f(data) }
    }

    @Test
    fun arrayConstructorDoesNotThrowsExceptionIfArrayIs4x4Matrix() {
        val data = FloatArray(16)

        assertDoesNotThrow { immutableMat4f(data) }
    }

    @Test
    fun returnsCurrentElementsWhileGetting() {
        val matrix = immutableMat4f(
            1f, 2f, 3f, 4f,
            5f, 6f, 7f, 8f,
            9f, 10f, 11f, 12f,
            13f, 14f, 15f, 16f
        )

        val zeroZeroElement: Float = matrix[0, 0]
        val threeTwoElement: Float = matrix[3, 2]
        val twoThreeElement: Float = matrix[2, 3]
        val centerElement: Float = matrix[2, 2]

        assertEquals(1f, zeroZeroElement)
        assertEquals(15f, threeTwoElement)
        assertEquals(12f, twoThreeElement)
        assertEquals(11f, centerElement)
    }

    @Test
    fun equalsComparesRawMatrixData() {
        val firstArray = floatArrayOf(
            1f, 2f, 3f, 4f,
            4f, 3f, 2f, 1f,
            5f, 6f, 7f, 8f,
            8f, 7f, 6f, 5f
        )
        val secondArray = floatArrayOf(
            0f, 0f, 0f, 0f,
            1f, 2f, 3f, 4f,
            1f, 2f, 3f, 4f,
            0f, 0f, 0f, 0f
        )
        val first = immutableMat4f(firstArray)
        val anotherFirst = immutableMat4f(firstArray.copyOf())
        val second = immutableMat4f(secondArray)

        assertEquals(first, anotherFirst)
        assertEquals(anotherFirst, first)
        assertNotEquals(first, second)
        assertNotEquals(second, first)
        assertEquals(first, first)
    }
}