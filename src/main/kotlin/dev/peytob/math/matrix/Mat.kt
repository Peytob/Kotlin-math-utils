package dev.peytob.math.matrix

import dev.peytob.math.vector.vec2.Vec2i
import dev.peytob.math.vector.vec2.Vec2l
import dev.peytob.math.vector.vec2.immutableVec2i

internal val MAT22_SIZE = immutableVec2i(2, 2)
internal val MAT33_SIZE = immutableVec2i(3, 3)
internal val MAT44_SIZE = immutableVec2i(4, 4)

interface Mat<T : Number> {

    val elementSizeBytes: Int

    val matrixSizeBytes: Int

    val size: Vec2i

    val height: Int
        get() = size.x

    val width: Int
        get() = size.y

    val mutable: Boolean

    operator fun `get`(index: Int): T

    operator fun get(x: Int, y: Int): T {
        return get(y * width + x)
    }

    operator fun get(pos: Vec2i): T {
        return get(pos.x, pos.y)
    }

    /**
     * Casts matrix to regular array. If matrix is immutable return array will be mutable. Maybe i will fix
     * it later.
     */
    fun asArray(): Array<T>
}