package dev.peytob.math.vector.vec2

internal data class StructVec2l(
    override val x: Long,
    override val y: Long
) : Vec2l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * size

    override fun toString(): String = "vec2l(x=$x, y=$y)"
}