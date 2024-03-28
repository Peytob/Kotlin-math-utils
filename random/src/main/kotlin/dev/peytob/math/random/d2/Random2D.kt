package dev.peytob.math.random.d2

/**
 * Universal wrapper for 2-dimension random number generators.
 */
interface Random2D {

    fun nextFloats(): Vec2f

    fun nextInts(): Vec2i

    fun nextInts(until: Int): Vec2i

    fun nextInts(from: Int, until: Int): Vec2i
}
