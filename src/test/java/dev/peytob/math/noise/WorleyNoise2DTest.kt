package dev.peytob.math.noise

import kotlin.random.Random

class WorleyNoise2DTest : Noise2DTest() {
    override fun getNoise2D(): Noise2D = WorleyNoise2D(Random.nextInt())
}