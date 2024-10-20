package dev.peytob.math.demo

import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.geometry.rect.rectI
import dev.peytob.math.noise.FbmNoise2D
import dev.peytob.math.noise.Noise2D
import dev.peytob.math.noise.PerlinNoise2D
import dev.peytob.math.noise.WorleyNoise2D
import dev.peytob.math.noise.decorator.ScaledNoiseDecorator
import dev.peytob.math.random.d1.JdkRandom1DWrapper
import dev.peytob.math.vector.vec2.immutableVec2f
import dev.peytob.math.vector.vec2.immutableVec2i
import kotlin.random.Random

fun main() {
    val defaultImageSize = immutableVec2i(512, 512)
    val random1 = JdkRandom1DWrapper(Random.Default)

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise2D(random1), 1f / 64f, immutableVec2f()),
        rectI(immutableVec2i(), defaultImageSize),
        "perlin_1_div_64_scale"
    )

    buildNoiseImage(
        ScaledNoiseDecorator(PerlinNoise2D(random1), 0.1f, immutableVec2f(100f, 100f)),
        rectI(immutableVec2i(), defaultImageSize),
        "perlin_0_1_scale"
    )

    buildNoiseImage(
        FbmNoise2D(ScaledNoiseDecorator(PerlinNoise2D(random1), 1f / 64f, immutableVec2f()), 3),
        rectI(immutableVec2i(), defaultImageSize),
        "fbm_perlin"
    )

    buildNoiseImage(
        ScaledNoiseDecorator(WorleyNoise2D(random1), 1f / 128f, immutableVec2f(10f, 10f)),
        rectI(immutableVec2i(), defaultImageSize),
        "worley_noise"
    )
}

fun buildNoiseImage(noise2D: Noise2D, noiseRect: RectI, filename: String) {
    val noiseImageBuilder = NoiseImageBuilder(noise2D)
    val buildImage = noiseImageBuilder.buildImage(noiseRect)
    buildImage.saveAsFile(filename, "png")
}
