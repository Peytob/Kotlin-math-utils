package dev.peytob.math.random.d2

import dev.peytob.math.random.d1.Random1D
import dev.peytob.math.vector.immutableVec2f
import dev.peytob.math.vector.immutableVec2i
import dev.peytob.math.vector.vec2.Vec2f
import dev.peytob.math.vector.vec2.Vec2i

class Random1Dto2DAdapter(
    private val random: Random1D
) : Random2D {

    override fun nextFloats(): Vec2f = immutableVec2f(random.nextFloat(), random.nextFloat())

    override fun nextInts(): Vec2i = immutableVec2i(random.nextInt(), random.nextInt())

    override fun nextInts(until: Int): Vec2i = immutableVec2i(random.nextInt(until), random.nextInt(until))

    override fun nextInts(from: Int, until: Int): Vec2i =
        immutableVec2i(random.nextInt(from, until), random.nextInt(from, until))
}