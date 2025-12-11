package dev.peytob.math.noise

import kotlin.random.Random

class GoldNoise2DTest : Noise2DTest() {
    override fun getNoise2D(): Noise2D = GoldNoise2D(Random.nextInt())
}