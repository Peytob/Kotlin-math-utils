package dev.peytob.math.demo

import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.noise.Noise2D
import dev.peytob.math.vec.vec2i

class NoiseImageBuilder(
    private val noise: Noise2D
) {

    fun buildImage(noiseRect: RectI): Image {
        val image = Image(noiseRect.size.x, noiseRect.size.y)

        // FIXME Iterator over int rect
        val topLeft = noiseRect.position
        val topRight = topLeft.copyMutable().plus(noiseRect.size.x, 0)
        val bottomLeft = topLeft.copyMutable().plus(noiseRect.size)

        for (x in (topLeft.x..<topRight.x)) {
            for (y in (topLeft.y ..< bottomLeft.y)) {
                val noiseValue = noise.getPoint(x.toFloat(), y.toFloat()) * 255
                val imagePosition = vec2i(x, y) - topLeft
                image.setPixel(imagePosition.x, imagePosition.y, noiseValue.toInt())
            }
        }

        return image
    }
}
