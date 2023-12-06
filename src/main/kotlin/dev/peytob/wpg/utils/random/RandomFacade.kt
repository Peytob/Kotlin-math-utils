package dev.peytob.wpg.utils.random

interface RandomFacade {

    /**
     * Returns random float in range [min; max]
     */
    fun getFloat(min: Float = Float.MIN_VALUE, max: Float = Float.MAX_VALUE): Float

    /**
     * Returns random float in range [0.0; 1.0]
     */
    fun getNormalizedFloat(): Float = getFloat(0.0f, 1.0f)

    /**
     * Returns random float in range [-1.0; 1.0]
     */
    fun getNormalizedSignedFloat(): Float = getFloat(-1.0f, 1.0f)
}