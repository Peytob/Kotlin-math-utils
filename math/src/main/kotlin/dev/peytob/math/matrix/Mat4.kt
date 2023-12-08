package dev.peytob.math.matrix

interface Mat4 {

    val raw: FloatArray

    operator fun get(row: Int, column: Int): Float
}
