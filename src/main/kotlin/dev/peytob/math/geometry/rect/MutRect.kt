package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2

interface MutRect<T : Number> : Rect<T> {
    override val position: Vec2<T>

    override val size: Vec2<T>

    override val mutable: Boolean
        get() = true
}

typealias MutRectF = MutRect<Float>
typealias MutRectI = MutRect<Int>
