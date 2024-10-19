package dev.peytob.math.vector.vec3

sealed interface Vec3<T : Number> : Vec3Accessor<T> {

    /**
     * Creates mutable copy of this vector
     */
//    fun asMutable(): MutVec3<T>
}
