package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.Vec2f

data class RectF internal constructor(

    override val topLeft: Vec2f,

    override val topRight: Vec2f,

    override val bottomRight: Vec2f,

    override val bottomLeft: Vec2f,

    override val size: Vec2f

): Rect<Float>
