package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2
import dev.peytob.math.vec.Vec2f
import dev.peytob.math.vec.Vec2i

interface Rect<T : Number> {
    val position: Vec2<T>

    val size: Vec2<T>

    val mutable: Boolean
        get() = false
}

interface RectF : Rect<Float> {
    override val position: Vec2f

    override val size: Vec2f
}

interface RectI : Rect<Int> {
    override val position: Vec2i

    override val size: Vec2i
}