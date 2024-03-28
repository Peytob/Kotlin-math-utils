package dev.peytob.math.vector.vec2

internal data class Vec2iStruct(
    override val x: Int,
    override val y: Int
) : Vec2i {
    override fun asMutable(): MutVec2<Int> = MutVec2iStruct(x, y)

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 2
}
