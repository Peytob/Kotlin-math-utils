package dev.peytob.math.noise

import kotlin.random.Random

class PerlinNoise2DTest : Noise2DTest() {
    override fun getNoise2D(): Noise2D = PerlinNoise2D(Random.nextInt())
}