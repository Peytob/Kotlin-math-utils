package dev.peytob.math.sdf.d3.function.primitive

import dev.peytob.math.sdf.d3.Sdf3d
import dev.peytob.math.vector.abs
import dev.peytob.math.vector.length
import dev.peytob.math.vector.max
import dev.peytob.math.vector.vec3.Vec3f
import kotlin.math.max
import kotlin.math.min

fun roundBox3dSdf(point: Vec3f, size: Vec3f, radius: Float): Float {
    val q = abs(point) - size + radius
    return max(q, 0.0f).length() + min(max(q.x, max(q.y, q.z)),0.0f) - radius
}

class RoundBox3dSdf(
    private val size: Vec3f,
    private val radius: Float
) : Sdf3d {

    override fun invoke(point: Vec3f): Float = roundBox3dSdf(point, size, radius)
}

