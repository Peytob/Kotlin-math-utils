package dev.peytob.math.sdf.d3.function.primitive

import dev.peytob.math.sdf.d3.Sdf3d
import dev.peytob.math.vector.immutableVec2f
import dev.peytob.math.vector.length
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec3.Vec3f

fun torus3dSdf(point: Vec3f, radius: Vec2f): Float {
    // TODO Can be optimized
    val q = immutableVec2f(immutableVec2f(point.x, point.z).length() - radius.x, point.y)
    return q.length() - radius.y
}

class Torus3dSdf(
    private val size: Vec2f,
    private val radius: Vec2f
) : Sdf3d {

    override fun invoke(point: Vec3f): Float = torus3dSdf(point, radius)
}
