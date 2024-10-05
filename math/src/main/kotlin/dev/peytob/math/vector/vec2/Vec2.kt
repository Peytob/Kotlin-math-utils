package dev.peytob.math.vector.vec2

sealed interface Vec2<T : Number> : Vec2Accessor<T> {

    /**
     * Creates mutable copy of this vector
     */
//    fun asMutable(): MutVec2<T>
}
