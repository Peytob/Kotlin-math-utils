package dev.peytob.math.vector.vec2

/**
 * Adds vector reading operations.
 * Don't use this type in application-level code!
 */
sealed interface Vec2Accessor<T : Number> {

    val x: T
    val y: T

    val elementsCount: Int
        get() = 2

    val elementSizeBytes: Int

    val vectorSizeBytes: Int

    operator fun component1() = x
    operator fun component2() = y

    operator fun get(index: Int) = when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException()
    }
}
