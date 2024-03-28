package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.Vec2f

internal data class RectFStruct(

    override val topLeft: Vec2f,

    override val topRight: Vec2f,

    override val bottomRight: Vec2f,

    override val bottomLeft: Vec2f,

    override val size: Vec2f

): Rect<Float>
