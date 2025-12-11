package dev.peytob.math.geometry.rect

import math.vec.vec2f
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

open class RectPointContainsOperationTest {

    @Test
    open fun rectShouldContainsInnerPoint() {
        val rect = rectF(10.0f, 12.5f, 5f, 2f)
        val point = vec2f(11f, 14f)

        assertTrue(point in rect)
    }

    @Test
    open fun rectShouldNotContainsInnerPoint() {
        val rect = rectF(-5f, -5f, 5f, 10f)
        val point = vec2f(2f, -3f)

        assertFalse(point in rect)
    }

    @Test
    open fun borderRectPointsShouldBeCountedInner() {
        val rect = rectF(0f, 0f, 2f, 2f)
        val point = vec2f(0f, 1f)

        assertTrue(point in rect)
    }

    @Test
    open fun onlyTopLeftCornerRectPointsShouldBeCountedInner() {
        val rect = rectF(0f, 0f, 2f, 2f)
        val leftTopCorner = vec2f(0f, 0f)
        val leftBottomCorner = vec2f(0f, 2f)
        val rightTopCorner = vec2f(2f, 0f)
        val rightBottomCorner = vec2f(2f, 2f)

        assertTrue(leftTopCorner in rect)
        assertFalse(leftBottomCorner in rect)
        assertFalse(rightTopCorner in rect)
        assertFalse(rightBottomCorner in rect)
    }
}
