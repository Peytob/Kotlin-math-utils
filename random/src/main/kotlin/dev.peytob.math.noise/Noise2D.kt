package dev.peytob.math.noise

import dev.peytob.math.vector.Vec2F

interface Noise2D {

    fun getPoint(vec2F: Vec2F): Float

    fun getPoint(x: Float, y: Float): Float
}
