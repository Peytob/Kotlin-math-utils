package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.Vec2i

interface Rect<T : Number> {

    val topLeft: Vec2<T>

    val topRight: Vec2<T>

    val bottomRight: Vec2<T>

    val bottomLeft: Vec2<T>

    val size: Vec2<T>
}

interface RectF : Rect<Float> {
    override val topLeft: Vec2f

    override val topRight: Vec2f

    override val bottomRight: Vec2f

    override val bottomLeft: Vec2f

    override val size: Vec2f
}

interface RectI : Rect<Int> {
    override val topLeft: Vec2i

    override val topRight: Vec2i

    override val bottomRight: Vec2i

    override val bottomLeft: Vec2i

    override val size: Vec2i
}
