package dev.peytob.math.sdf.d3.function.primitive

import dev.peytob.math.sdf.d3.Sdf3d
import dev.peytob.math.vector.abs
import dev.peytob.math.vector.length
import dev.peytob.math.vector.max
import dev.peytob.math.vector.vec3.Vec3f
import kotlin.math.max
import kotlin.math.min

fun box3dSdf(point: Vec3f, size: Vec3f): Float {
    val q = abs(point) - size
    return max(q, 0.0f).length() + min(max(q.x, max(q.y, q.z)),0.0f)
}

class Box3dSdf(
    private val size: Vec3f
) : Sdf3d {

    override fun invoke(point: Vec3f): Float = box3dSdf(point, size)
}
