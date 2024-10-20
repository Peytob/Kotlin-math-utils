package dev.peytob.math.noise.decorator

import dev.peytob.math.noise.Noise2D
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.immutableVec2f

/**
 * This decorator can scale and offset noise point.
 */
class ScaledNoiseDecorator(
    private val noise2D: Noise2D,
    private val scale: Float,
    private val offset: Vec2f
) : Noise2D {

    // Does not use override Vec2 operators to avoid creating too many new vector objects.
    override fun getPoint(point: Vec2f): Float =
        noise2D.getPoint(immutableVec2f(point.x * scale + offset.x, point.y * scale + offset.y))

    override fun getPoint(x: Float, y: Float): Float =
        noise2D.getPoint(x * scale + offset.x, y * scale + offset.y)
}
