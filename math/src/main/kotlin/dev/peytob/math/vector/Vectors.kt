package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.*
import dev.peytob.math.vector.vec2.Vec2dStruct
import dev.peytob.math.vector.vec2.Vec2fStruct
import dev.peytob.math.vector.vec2.Vec2iStruct

fun immutableVec2d(x: Double, y: Double): Vec2d = Vec2dStruct(x, y)

fun immutableVec2f(x: Float, y: Float): Vec2f = Vec2fStruct(x, y)

fun immutableVec2i(x: Int, y: Int): Vec2i = Vec2iStruct(x, y)

fun immutableVec2l(x: Long, y: Long): Vec2l = Vec2lStruct(x, y)

fun mutableVec2d(x: Double, y: Double): MutVec2d = MutVec2dStruct(x, y)

fun mutableVec2f(x: Float, y: Float): MutVec2f = MutVec2fStruct(x, y)

fun mutableVec2i(x: Int, y: Int): MutVec2i = MutVec2iStruct(x, y)

fun mutableVec2l(x: Long, y: Long): MutVec2l = MutVec2lStruct(x, y)
