package dev.peytob.math.matrix

import dev.peytob.math.vector.immutableVec2i

internal const val MAT4_SIZE = 4
internal val MAT4_SIZES = immutableVec2i(MAT4_SIZE, MAT4_SIZE)
internal val MAT4_ELEMENTS_COUNT = MAT4_SIZES.x * MAT4_SIZES.y

internal fun toIndex(row: Int, column: Int, size: Int): Int = row * size + column
