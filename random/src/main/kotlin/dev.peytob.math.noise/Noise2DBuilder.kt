package dev.peytob.math.noise

import dev.peytob.math.noise.decorator.ScaledNoiseDecorator
import dev.peytob.math.vector.Vec2F

class Noise2DBuilder(
    private var noise2D: Noise2D
) {

    fun withScale(scale: Float, offset: Vec2F): Noise2DBuilder {
        noise2D = ScaledNoiseDecorator(noise2D, scale, offset)
        return this
    }

    fun decorate(decoratorSupplier: (Noise2D) -> Noise2D) = decoratorSupplier(noise2D)

    fun build(): Noise2D = noise2D
}