package dev.peytob.math.vector.vec2

import dev.peytob.math.vector.immutableVec2d
import dev.peytob.math.vector.immutableVec2f
import dev.peytob.math.vector.immutableVec2i
import dev.peytob.math.vector.immutableVec2l

operator fun Vec2d.plus(right: Vec2d): Vec2d = plus(right.x, right.y)

operator fun Vec2f.plus(right: Vec2f): Vec2f = plus(right.x, right.y)

operator fun Vec2i.plus(right: Vec2i): Vec2i = plus(right.x, right.y)

operator fun Vec2l.plus(right: Vec2l): Vec2l = plus(right.x, right.y)

fun Vec2d.plus(rightX: Double, rightY: Double): Vec2d = immutableVec2d(this.x + rightX, this.y + rightY)

fun Vec2f.plus(rightX: Float, rightY: Float): Vec2f = immutableVec2f(this.x + rightX, this.y + rightY)

fun Vec2i.plus(rightX: Int, rightY: Int): Vec2i = immutableVec2i(this.x + rightX, this.y + rightY)

fun Vec2l.plus(rightX: Long, rightY: Long): Vec2l = immutableVec2l(this.x + rightX, this.y + rightY)

operator fun Vec2d.minus(right: Vec2d): Vec2d = minus(right.x, right.y)

operator fun Vec2f.minus(right: Vec2f): Vec2f = minus(right.x, right.y)

operator fun Vec2i.minus(right: Vec2i): Vec2i = minus(right.x, right.y)

operator fun Vec2l.minus(right: Vec2l): Vec2l = minus(right.x, right.y)

fun Vec2d.minus(rightX: Double, rightY: Double): Vec2d = immutableVec2d(this.x - rightX, this.y - rightY)

fun Vec2f.minus(rightX: Float, rightY: Float): Vec2f = immutableVec2f(this.x - rightX, this.y - rightY)

fun Vec2i.minus(rightX: Int, rightY: Int): Vec2i = immutableVec2i(this.x - rightX, this.y - rightY)

fun Vec2l.minus(rightX: Long, rightY: Long): Vec2l = immutableVec2l(this.x - rightX, this.y - rightY)
