package dev.peytob.math.random.d1

import kotlin.random.Random

/**
 * Universal wrapper for 1-dimension random number generators.
 */
interface Random1D {

    fun nextFloat(): Float

    fun nextInt(): Int

    fun nextInt(until: Int): Int

    fun nextInt(from: Int, until: Int): Int

    fun asKotlinRandom(): Random
}
