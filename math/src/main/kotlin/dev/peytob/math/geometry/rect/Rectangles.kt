package dev.peytob.math.geometry.rect

import dev.peytob.math.vector.vec2.*

fun rectI(topLeft: Vec2i, sizes: Vec2i): RectI =
    RectIStruct(
        topLeft,
        topLeft.plus(sizes.x, 0),
        topLeft.plus(sizes.x, sizes.y),
        topLeft.plus(0, sizes.y),
        sizes
    )

fun rectI(topLeftX: Int, topLeftY: Int, width: Int, height: Int): RectI =
    rectI(immutableVec2i(topLeftX, topLeftY), immutableVec2i(width, height))

fun rectF(topLeft: Vec2f, sizes: Vec2f): RectF =
    RectFStruct(
        topLeft,
        topLeft.plus(sizes.x, 0.0f),
        topLeft.plus(sizes.x, sizes.y),
        topLeft.plus(0.0f, sizes.y),
        sizes
    )

fun rectF(topLeftX: Float, topLeftY: Float, width: Float, height: Float): RectF =
    rectF(immutableVec2f(topLeftX, topLeftY), immutableVec2f(width, height))
