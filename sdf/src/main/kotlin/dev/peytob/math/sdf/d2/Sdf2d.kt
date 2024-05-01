package dev.peytob.math.sdf.d2

import dev.peytob.math.vector.vec2.Vec2f

fun interface Sdf2d {

    operator fun invoke(point: Vec2f): Float?
}
