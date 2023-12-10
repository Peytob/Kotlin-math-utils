package dev.peytob.math.noise.decorator

import dev.peytob.math.noise.Noise2D
import dev.peytob.math.vector.Vec2F
import dev.peytob.math.vector.immutableVec2F

class ScaledNoiseDecorator(
    private val noise2D: Noise2D,
    private val scale: Float,
    private val offset: Vec2F
) : Noise2D {

    // Does not use override Vec2 operators to avoid creating too many new vector objects.
    override fun getPoint(vec2F: Vec2F): Float =
        noise2D.getPoint(immutableVec2F((vec2F.x + offset.x) * scale, (vec2F.y + offset.y) * scale))

    override fun getPoint(x: Float, y: Float): Float =
        noise2D.getPoint((x + offset.x) * scale, (y + offset.y) * scale)
}
