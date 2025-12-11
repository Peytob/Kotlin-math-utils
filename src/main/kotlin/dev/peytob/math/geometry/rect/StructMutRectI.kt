package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2

data class StructMutRectI(
    override val position: Vec2<Int>,
    override val size: Vec2<Int>
) : MutRectI
