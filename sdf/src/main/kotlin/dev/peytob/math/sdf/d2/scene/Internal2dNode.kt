package dev.peytob.math.sdf.d2.scene

import dev.peytob.math.sdf.d2.Sdf2dOperation

data class Internal2dNode<T>(
    val left: Scene2dNode<T>,
    val right: Scene2dNode<T>,
    val operation: Sdf2dOperation?
) : Scene2dNode<T>
