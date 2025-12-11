package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2f
import dev.peytob.math.vec.Vec2i
import dev.peytob.math.vec.vec2f
import dev.peytob.math.vec.vec2i

fun rectF(position: Vec2f, size: Vec2f): RectF {
    return StructRectF(
        position = vec2f(position),
        size = vec2f(size)
    )
}

fun rectF(positionX: Float, positionY: Float, sizeX: Float, sizeY: Float): RectF {
    return StructRectF(
        position = vec2f(positionX, positionY),
        size = vec2f(sizeX, sizeY)
    )
}

fun rectI(position: Vec2i, size: Vec2i): RectI {
    return StructRectI(
        position = vec2i(position),
        size = vec2i(size)
    )
}

fun rectI(positionX: Int, positionY: Int, sizeX: Int, sizeY: Int): RectI {
    return StructRectI(
        position = vec2i(positionX, positionY),
        size = vec2i(sizeX, sizeY)
    )
}
