package dev.peytob.math.noise

import dev.peytob.math.noise.decorator.ScaledNoiseDecorator

class Noise2DBuilder(
    private var noise2D: Noise2D
) {

    fun withScale(scale: Float, offset: Vec2f): Noise2DBuilder {
        noise2D = ScaledNoiseDecorator(noise2D, scale, offset)
        return this
    }

    fun withOctaves(octaves: Int, lacunarity: Float = 2f, persistence: Float = 0.5f): Noise2DBuilder {
        noise2D = FbmNoise2D(noise2D, octaves, lacunarity, persistence)
        return this
    }

    fun decorate(decoratorSupplier: (Noise2D) -> Noise2D): Noise2DBuilder {
        noise2D = decoratorSupplier(noise2D)
        return this
    }

    fun build(): Noise2D = noise2D
}