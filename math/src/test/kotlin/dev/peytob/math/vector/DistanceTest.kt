package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.distance
import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec3.distance
import dev.peytob.math.vector.vec3.immutableVec3f
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistanceTest {

    @Test
    fun distanceVector2ComputesCorrectly() {
        val v1 = immutableVec2f(4.3f, 1.1f)
        val v2 = immutableVec2f(2.4f, 3.5f)
        val distance = distance(v1, v2)
        assertEquals(3.06f, distance, 0.01f)
    }

    @Test
    fun distanceScalar2ComputesCorrectly() {
        val (rx, ry) = floatArrayOf(-5.1f, 3f)
        val (lx, ly) = floatArrayOf(2.5f, -4.1f)
        val distance = distance(rx, ry, lx, ly)
        assertEquals(10.40f, distance, 0.01f)
    }

    @Test
    fun distanceVector3ComputesCorrectly() {
        val v1 = immutableVec3f(3.1f, -2f, 4f)
        val v2 = immutableVec3f(-1.2f, 5.2f, -2.4f)
        val distance = distance(v1, v2)
        assertEquals(10.54f, distance, 0.01f)
    }

    @Test
    fun distanceScalar3ComputesCorrectly() {
        val (rx, ry, rz) = floatArrayOf(2.2f, 0f, 0f)
        val (lx, ly, lz) = floatArrayOf(3.4f, -1f, 2.4f)
        val distance = distance(rx, ry, rz, lx, ly, lz)
        assertEquals(2.86f, distance, 0.01f)
    }
}