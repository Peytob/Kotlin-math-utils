package dev.peytob.math.vector.vec2

internal data class StructMutVec2f(
    override var x: Float,
    override var y: Float
) : MutVec2f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * size

    override fun toString(): String = "mvec2f(x=$x, y=$y)"
}