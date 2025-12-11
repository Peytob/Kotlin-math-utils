package dev.peytob.math.geometry.rect

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

open class RectIntersectionOperationTest {

    @Test
    open fun rectsIntersectionShouldBeFound() {
        val rect1 = rectF(-5f, -5f, 10f, 10f)
        val rect2 = rectF(-7f, 2f, 4f, 4f)

        val intersection = findIntersection(rect1, rect2)

        val expectedIntersection = rectF(-5f, 2f, 2f, 3f)
        assertEquals(expectedIntersection, intersection)
    }

    @Test
    open fun notExistsRectsIntersectionShouldReturnNull() {
        val rect1 = rectF(0f, 0f, 5f, 5f)
        val rect2 = rectF(10f, 10f, 2f, 4f)

        val intersection = findIntersection(rect1, rect2)

        assertNull(intersection)
    }
}
