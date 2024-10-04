package dev.peytob.math.vector.vec2

interface MutVec2<T : Number> : Vec2Accessor<T> {

    override var x: T

    override var y: T

    /**
     * Creates immutable copy of this vector
     */
    fun asImmutable(): Vec2<T>
}
