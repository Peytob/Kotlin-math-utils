package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2i

data class StructRectI(
    override val position: Vec2i,
    override val size: Vec2i
) : RectI
