package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2

data class StructMutRectF(
    override val position: Vec2<Float>,
    override val size: Vec2<Float>
) : MutRectF
