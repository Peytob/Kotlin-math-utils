package dev.peytob.wpg.utils.noise

class PerlinNoise2DTest : Noise2DTest() {
    override fun getNoise2D(): Noise2D = PerlinNoise()
}