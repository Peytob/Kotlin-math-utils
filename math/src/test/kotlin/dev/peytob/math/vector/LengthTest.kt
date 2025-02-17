package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.length
import dev.peytob.math.vector.vec3.immutableVec3f
import dev.peytob.math.vector.vec3.length
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LengthTest {

    @Test
    fun lengthVector2ComputesCorrectly() {
        val v1 = immutableVec2f(3.1f, -5f)
        val length = v1.length()
        Assertions.assertEquals(5.88f, length, 0.01f)
    }

    @Test
    fun lengthScalar2ComputesCorrectly() {
        val (rx, ry) = floatArrayOf(-5f, -5f)
        val length = length(rx, ry)
        Assertions.assertEquals(7.07f, length, 0.01f)
    }

    @Test
    fun lengthVector3ComputesCorrectly() {
        val v1 = immutableVec3f(1.2f, 5.2f, -7f)
        val length = v1.length()
        Assertions.assertEquals(8.80f, length, 0.01f)
    }

    @Test
    fun lengthScalar3ComputesCorrectly() {
        val (rx, ry, rz) = floatArrayOf(-4f, 2f, 0.5f)
        val length = length(rx, ry, rz)
        Assertions.assertEquals(4.5f, length, 0.01f)
    }
}
