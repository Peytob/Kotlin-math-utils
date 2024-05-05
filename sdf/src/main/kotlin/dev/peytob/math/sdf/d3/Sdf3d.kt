package dev.peytob.math.sdf.d3

import dev.peytob.math.vector.vec3.Vec3f

fun interface Sdf3d {

    operator fun invoke(point: Vec3f): Float
}
