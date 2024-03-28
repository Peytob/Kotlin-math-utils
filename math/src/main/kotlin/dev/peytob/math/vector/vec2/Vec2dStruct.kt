package dev.peytob.math.vector.vec2

internal data class Vec2dStruct(
    override val x: Double,
    override val y: Double
): Vec2d {
    override fun asMutable(): MutVec2<Double> = MutVec2dStruct(x, y)

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * 2
}
