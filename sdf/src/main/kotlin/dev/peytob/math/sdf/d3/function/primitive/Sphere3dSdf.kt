package dev.peytob.math.sdf.d3.function.primitive

import dev.peytob.math.sdf.d3.Sdf3d
import dev.peytob.math.vector.length
import dev.peytob.math.vector.vec3.Vec3f

fun sphere3dSdf(point: Vec3f, size: Float): Float = point.length() - size

class Sphere3dSdf(
    private val size: Float
) : Sdf3d {
    override fun invoke(point: Vec3f): Float = sphere3dSdf(point, size)
}
