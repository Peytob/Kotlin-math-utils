package dev.peytob.math.vector.vec2

internal data class StructVec2i(
    override val x: Int,
    override val y: Int
) : Vec2i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * size

    override fun toString(): String = "vec2i(x=$x, y=$y)"
}