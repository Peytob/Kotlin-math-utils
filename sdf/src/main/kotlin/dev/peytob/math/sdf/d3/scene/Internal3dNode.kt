package dev.peytob.math.sdf.d3.scene

import dev.peytob.math.sdf.d3.Sdf3dOperation

data class Internal3dNode(
    val left: Scene3dNode,
    val right: Scene3dNode,
    val operation: Sdf3dOperation?
) : Scene3dNode
