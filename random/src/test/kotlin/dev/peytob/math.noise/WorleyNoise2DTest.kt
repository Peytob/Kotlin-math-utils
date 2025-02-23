package dev.peytob.math.noise

import dev.peytob.math.random.d1.JdkRandom1DWrapper
import kotlin.random.Random

class WorleyNoise2DTest : Noise2DTest() {

    override fun getNoise2D(): Noise2D = WorleyNoise2D(JdkRandom1DWrapper(Random.Default))
}