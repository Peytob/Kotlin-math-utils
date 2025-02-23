package dev.peytob.math.demo

import dev.peytob.math.field.Field2D
import dev.peytob.math.geometry.rect.RectI
import dev.peytob.math.vector.vec2.immutableVec2i
import dev.peytob.math.vector.vec2.minus
import dev.peytob.math.vector.vec2.times

class FieldImageBuilder(
    private val field: Field2D
) {

    fun buildImage(noiseRect: RectI): Image {
        val image = Image(noiseRect.size.x, noiseRect.size.y)

        for (x in (noiseRect.topLeft.x..<noiseRect.topRight.x)) {
            for (y in (noiseRect.topLeft.y ..< noiseRect.bottomLeft.y)) {
                val fieldValue = field.getPoint(x.toFloat(), y.toFloat()) * 255
                val imagePosition = immutableVec2i(x, y) - noiseRect.topLeft
                image.setPixel(imagePosition.x, imagePosition.y, fieldValue.x.toInt(), 0, fieldValue.y.toInt())
            }
        }

        return image
    }
}