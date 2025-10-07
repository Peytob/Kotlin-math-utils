package dev.peytob.math.matrix.mat33

import dev.peytob.math.matrix.MAT33_SIZE
import dev.peytob.math.matrix.Mat
import dev.peytob.math.vector.vec2.Vec2i

interface MutMat33<T : Number> : Mat<T> {

    override val mutable: Boolean
        get() = true

    override val size: Vec2i
        get() = MAT33_SIZE

    operator fun `set`(index: Int, value: T)

    operator fun `set`(x: Int, y: Int, value: T) {
        set(y * width + x, value)
    }

    operator fun `set`(pos: Vec2i, value: T) {
        set(pos.x, pos.y, value)
    }
}

typealias MutMat33d = MutMat33<Double>
typealias MutMat33l = MutMat33<Long>
typealias MutMat33i = MutMat33<Int>
typealias MutMat33f = MutMat33<Float>
