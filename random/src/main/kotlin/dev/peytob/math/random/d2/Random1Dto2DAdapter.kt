package dev.peytob.math.random.d2

import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.immutableVec2F
import dev.peytob.math.vector.immutableVec2I

class Random1Dto2DAdapter(
    private val random: Random1D
) : Random2D {

    override fun nextFloats(): Vec2f = immutableVec2F(random.nextFloat(), random.nextFloat())

    override fun nextInts(): Vec2i = immutableVec2I(random.nextInt(), random.nextInt())

    override fun nextInts(until: Int): Vec2i = immutableVec2I(random.nextInt(until), random.nextInt(until))

    override fun nextInts(from: Int, until: Int): Vec2i =
        immutableVec2I(random.nextInt(from, until), random.nextInt(from, until))
}