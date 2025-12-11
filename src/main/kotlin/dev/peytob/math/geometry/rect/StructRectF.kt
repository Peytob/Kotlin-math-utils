package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2f

data class StructRectF(
    override val position: Vec2f,
    override val size: Vec2f
) : RectF
