package dev.peytob.math.vector.vec2

internal data class Vec2fStruct(
    override val x: Float,
    override val y: Float
) : Vec2f {
    override fun asMutable(): MutVec2<Float> = MutVec2fStruct(x, y)

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * 2
}
