package dev.peytob.math.vector.vec3

interface MutVec3<T : Number> : Vec3Accessor<T> {

    override var x: T

    override var y: T

    override var z: T

    /**
     * Creates immutable copy of this vector
     */
//    fun asImmutable(): Vec3<T>
}
