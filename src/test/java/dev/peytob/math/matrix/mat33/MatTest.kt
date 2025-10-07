package dev.peytob.math.matrix.mat33

import dev.peytob.math.vector.vec2.immutableVec2i
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MatTest {

    private val mat33 = ArrayMat33f(arrayOf(
        1.0f, 2.0f, 3.0f,
        4.0f, 5.0f, 6.0f,
        7.0f, 8.0f, 9.0f
    ))

    @Test
    fun getIndexedElementTest() {
        val indexedElement = mat33[5]
        val positionalElement = mat33[2, 1]
        val positionalElementViaVec = mat33[immutableVec2i(2, 1)]

        assertEquals(indexedElement, 6.0f)
        assertEquals(positionalElement, indexedElement)
        assertEquals(positionalElementViaVec, indexedElement)
    }
}