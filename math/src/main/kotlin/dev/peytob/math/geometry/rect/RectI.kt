package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.Vec2I

data class RectI internal constructor(

    override val topLeft: Vec2I,

    override val topRight: Vec2I,

    override val bottomRight: Vec2I,

    override val bottomLeft: Vec2I,

    override val size: Vec2I

): Rect<Int>
