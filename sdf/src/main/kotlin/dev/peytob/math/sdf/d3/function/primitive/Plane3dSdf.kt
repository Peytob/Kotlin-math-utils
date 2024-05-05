package dev.peytob.math.sdf.d3.function.primitive

import dev.peytob.math.sdf.d3.Sdf3d
import dev.peytob.math.vector.vec3.Vec3f

fun plane3dSdf(point: Vec3f, normal: Vec3f, h: Float): Float {
    return point.dot(normal) + h
}

class Plane3dSdf(
    private val normal: Vec3f,
    private val h: Float
) : Sdf3d {

    override fun invoke(point: Vec3f): Float = plane3dSdf(point, normal, h)
}
