package dev.peytob.math.vector.vec2

sealed interface Vec2<T : Number> : Vec2Accessor<T> {

    /**
     * Creates mutable copy of this vector
     */
    fun asMutable(): MutVec2<T>
}

// Usable realisations

interface Vec2d : Vec2<Double>
interface Vec2i : Vec2<Int>
interface Vec2f : Vec2<Float>
interface Vec2l : Vec2<Long>
