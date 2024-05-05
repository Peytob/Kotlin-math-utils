package dev.peytob.math.sdf.d2.scene

import dev.peytob.math.sdf.d2.Sdf2d

data class Leaf2dNode<T>(
    val function: Sdf2d,
    val metadata: T
) : Scene2dNode<T>
