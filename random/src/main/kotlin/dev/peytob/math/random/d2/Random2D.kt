package dev.peytob.math.random.d2

import dev.peytob.math.vector.Vec2F
import dev.peytob.math.vector.Vec2I

/**
 * Universal wrapper for 2-dimension random number generators.
 */
interface Random2D {

    fun nextFloats(): Vec2F

    fun nextInts(): Vec2I

    fun nextInts(until: Int): Vec2I

    fun nextInts(from: Int, until: Int): Vec2I
}
