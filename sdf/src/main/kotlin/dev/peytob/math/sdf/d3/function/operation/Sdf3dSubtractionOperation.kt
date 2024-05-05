package dev.peytob.math.sdf.d3.function.operation

import dev.peytob.math.sdf.d3.Sdf3dOperation

class Sdf3dSubtractionOperation : Sdf3dOperation {

    override fun invoke(d1: Float, d2: Float): Float = if (-d2 < d1) d1 else -d2
}
