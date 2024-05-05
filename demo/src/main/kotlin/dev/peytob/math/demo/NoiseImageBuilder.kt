package dev.peytob.math.demo

import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.noise.Noise2D
import dev.peytob.math.vector.immutableVec2i

class NoiseImageBuilder(
    private val noise: Noise2D
) {

    fun buildImage(noiseRect: RectI): Image {
        val image = Image(noiseRect.size.x, noiseRect.size.y)

        for (x in noiseRect.topLeft.x..<noiseRect.topRight.x) {
            for (y in noiseRect.topLeft.y ..< noiseRect.bottomLeft.y) {
                val noiseValue = noise.getPoint(x.toFloat(), y.toFloat()) * 255
                val imagePosition = immutableVec2i(x, y).minus(noiseRect.topLeft)
                image.setPixel(imagePosition.x, imagePosition.y, noiseValue.toInt())
            }
        }

        return image
    }
}