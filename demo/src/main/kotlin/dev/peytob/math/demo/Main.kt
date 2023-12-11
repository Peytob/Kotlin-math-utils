package dev.peytob.math.demo

import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.geometry.rect.rectI
import dev.peytob.math.noise.Noise2D
import dev.peytob.math.noise.PerlinNoise
import dev.peytob.math.noise.decorator.ScaledNoiseDecorator
import dev.peytob.math.vector.immutableVec2F
import dev.peytob.math.vector.immutableVec2I

fun main() {
    val defaultImageSize = immutableVec2I(512, 512)

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise(), 0.25f, immutableVec2F()),
        rectI(immutableVec2I(), defaultImageSize),
        "perlin_0_25_scale"
    )

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise(), 0.1f, immutableVec2F(100f, 100f)),
        rectI(immutableVec2I(), defaultImageSize),
        "perlin_0_1_scale"
    )
}

fun buildNoiseImage(noise2D: Noise2D, noiseRect: RectI, filename: String) {
    val noiseImageBuilder = NoiseImageBuilder(noise2D)
    val buildImage = noiseImageBuilder.buildImage(noiseRect)
    buildImage.saveAsFile(filename, "png")
}
