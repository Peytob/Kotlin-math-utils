package dev.peytob.math.demo

import java.awt.image.BufferedImage
import java.awt.image.BufferedImage.TYPE_INT_RGB
import java.io.File
import javax.imageio.ImageIO

class Image(
    height: Int,
    width: Int
) {

    private val raw: BufferedImage = BufferedImage(width, height, TYPE_INT_RGB)

    fun setPixel(x: Int, y: Int, r: Int, g: Int, b: Int) {
        val color =
            (255 and 0xFF) shl 24 or
            (r and 0xFF shl 16) or
            (g and 0xFF shl 8) or
            (b and 0xFF shl 0)

        raw.setRGB(x, y, color)
    }

    fun setPixel(x: Int, y: Int, gray: Int) = setPixel(x, y, gray, gray, gray)

    fun saveAsFile(filename: String, format: String = "png") {
        ImageIO.write(raw, format, File("./$filename.$format"))
    }
}
