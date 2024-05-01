package dev.peytob.math.sdf.d2.scene

import dev.peytob.math.sdf.d2.Sdf2dCombination

data class Internal2dNode(
    val left: Scene2dNode,
    val right: Scene2dNode,
    val combination: Sdf2dCombination
)
