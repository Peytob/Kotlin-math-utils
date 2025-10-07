package dev.peytob.math.matrix.mat33

import dev.peytob.math.matrix.MAT33_SIZE
import dev.peytob.math.matrix.Mat
import dev.peytob.math.vector.vec2.Vec2i

interface Mat33<T : Number> : Mat<T> {

    override val mutable: Boolean
        get() = false

    override val size: Vec2i
        get() = MAT33_SIZE
}

typealias Mat33d = Mat33<Double>
typealias Mat33l = Mat33<Long>
typealias Mat33i = Mat33<Int>
typealias Mat33f = Mat33<Float>
