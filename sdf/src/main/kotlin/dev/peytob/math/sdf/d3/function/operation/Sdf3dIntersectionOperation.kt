package dev.peytob.math.sdf.d3.function.operation

import dev.peytob.math.sdf.d3.Sdf3dOperation

class Sdf3dIntersectionOperation : Sdf3dOperation {

    override fun invoke(d1: Float, d2: Float): Float = if (d1 < d2) d2 else d1
}
