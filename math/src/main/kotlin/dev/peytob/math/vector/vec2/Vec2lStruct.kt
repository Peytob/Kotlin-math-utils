package dev.peytob.math.vector.vec2

internal data class Vec2lStruct(
    override val x: Long,
    override val y: Long
) : Vec2l {
    override fun asMutable(): MutVec2<Long> = MutVec2lStruct(x, y)

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * 2
}
