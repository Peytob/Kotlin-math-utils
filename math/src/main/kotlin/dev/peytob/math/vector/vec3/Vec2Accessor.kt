package dev.peytob.math.vector.vec3

/**
 * Adds vector reading operations.
 * Don't use this type in application-level code!
 */
sealed interface Vec3Accessor<T : Number> {

    val x: T
    val y: T
    val z: T

    val elementsCount: Int
        get() = 3

    val elementSizeBytes: Int

    val vectorSizeBytes: Int

    operator fun component1() = x
    operator fun component2() = y
    operator fun component3() = y

    operator fun get(index: Int) = when (index) {
        0 -> x
        1 -> y
        2 -> z
        else -> throw IndexOutOfBoundsException()
    }
}
