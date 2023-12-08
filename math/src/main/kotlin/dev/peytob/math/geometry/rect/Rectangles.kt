package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.*

fun rectI(topLeft: Vec2I, sizes: Vec2I): RectI =
    RectI(
        topLeft,
        topLeft.plus(sizes.x, 0),
        topLeft.plus(sizes.x, sizes.y),
        topLeft.plus(0, sizes.y),
        sizes
    )

fun rectI(topLeftX: Int, topLeftY: Int, width: Int, height: Int): RectI =
    rectI(immutableVec2I(topLeftX, topLeftY), immutableVec2I(width, height))

fun rectF(topLeft: Vec2F, sizes: Vec2F): RectF =
    RectF(
        topLeft,
        topLeft.plus(sizes.x, 0.0f),
        topLeft.plus(sizes.x, sizes.y),
        topLeft.plus(0.0f, sizes.y),
        sizes
    )

fun rectF(topLeftX: Float, topLeftY: Float, width: Float, height: Float): RectF =
    rectF(immutableVec2F(topLeftX, topLeftY), immutableVec2F(width, height))
