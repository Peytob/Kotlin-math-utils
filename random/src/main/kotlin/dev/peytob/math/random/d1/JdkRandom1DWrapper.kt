package dev.peytob.math.random.d1

import kotlin.random.Random

class JdkRandom1DWrapper(
    private val random: Random
) : Random1D {

    constructor(seed: Int) : this(Random(seed))

    constructor(seed: Long) : this(Random(seed))

    override fun nextFloat(): Float = random.nextFloat()

    override fun nextInt(): Int = random.nextInt()

    override fun nextInt(until: Int): Int = random.nextInt(until)

    override fun nextInt(from: Int, until: Int): Int = random.nextInt(from, until)

    override fun asKotlinRandom(): Random = random
}