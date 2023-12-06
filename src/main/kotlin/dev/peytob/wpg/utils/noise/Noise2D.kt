package dev.peytob.wpg.utils.noise

import dev.peytob.wpg.math.vector.Vec2F

interface Noise2D {

    fun getPoint(vec2F: Vec2F): Float

    fun getPoint(x: Float, y: Float): Float
}
