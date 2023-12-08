package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.Vec2F

data class RectF internal constructor(

    override val topLeft: Vec2F,

    override val topRight: Vec2F,

    override val bottomRight: Vec2F,

    override val bottomLeft: Vec2F,

    override val size: Vec2F

): Rect<Float>
