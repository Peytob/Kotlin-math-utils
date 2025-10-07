package dev.peytob.math.vector.vec2

internal data class StructMutVec2l(
    override var x: Long,
    override var y: Long
) : MutVec2l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * size

    override fun toString(): String = "mvec2l(x=$x, y=$y)"
}