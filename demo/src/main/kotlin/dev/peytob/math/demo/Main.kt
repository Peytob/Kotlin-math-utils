package dev.peytob.math.demo

import dev.peytob.math.geometry.rect.rectI
import dev.peytob.math.noise.PerlinNoise
import dev.peytob.math.noise.decorator.ScaledNoiseDecorator
import dev.peytob.math.vector.immutableVec2F


fun main(args: Array<String>) {
    val noiseImageBuilder = NoiseImageBuilder(ScaledNoiseDecorator(PerlinNoise(), 0.17f, immutableVec2F()))
    val buildImage = noiseImageBuilder.buildImage(rectI(0, 0, 500, 500))
    buildImage.saveAsFile("penis", "png")
}
