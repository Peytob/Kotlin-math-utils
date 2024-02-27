package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.Vec2i

data class RectI internal constructor(

    override val topLeft: Vec2i,

    override val topRight: Vec2i,

    override val bottomRight: Vec2i,

    override val bottomLeft: Vec2i,

    override val size: Vec2i

): Rect<Int>
