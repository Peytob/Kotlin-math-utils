package dev.peytob.math.noise

import dev.peytob.math.random.d1.JdkRandom1DWrapper
import kotlin.random.Random

class PerlinNoise2DTest : Noise2DTest() {
    override fun getNoise2D(): Noise2D = PerlinNoise2D(JdkRandom1DWrapper(Random.Default))
}