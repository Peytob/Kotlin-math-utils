package dev.peytob.math.vector

import dev.peytob.math.vector.vec2.*
import dev.peytob.math.vector.vec2.Vec2dStruct
import dev.peytob.math.vector.vec2.Vec2fStruct
import dev.peytob.math.vector.vec2.Vec2iStruct
import dev.peytob.math.vector.vec3.*
import dev.peytob.math.vector.vec3.Vec3dStruct
import dev.peytob.math.vector.vec3.Vec3fStruct
import dev.peytob.math.vector.vec3.Vec3iStruct
import dev.peytob.math.vector.vec3.Vec3lStruct

private val ZERO_VEC2D = Vec2dStruct(0.0, 0.0)
private val ZERO_VEC2F = Vec2fStruct(0.0f, 0.0f)
private val ZERO_VEC2I = Vec2iStruct(0, 0)
private val ZERO_VEC2L = Vec2lStruct(0, 0)

private val ZERO_VEC3D = Vec3dStruct(0.0, 0.0, 0.0)
private val ZERO_VEC3F = Vec3fStruct(0.0f, 0.0f, 0.0f)
private val ZERO_VEC3I = Vec3iStruct(0, 0, 0)
private val ZERO_VEC3L = Vec3lStruct(0, 0, 0)

// vec2

fun immutableVec2d(): Vec2d = ZERO_VEC2D

fun immutableVec2d(x: Double, y: Double): Vec2d = Vec2dStruct(x, y)

fun immutableVec2f(): Vec2f = ZERO_VEC2F

fun immutableVec2f(x: Float, y: Float): Vec2f = Vec2fStruct(x, y)

fun immutableVec2i(): Vec2i = ZERO_VEC2I

fun immutableVec2i(x: Int, y: Int): Vec2i = Vec2iStruct(x, y)

fun immutableVec2l(): Vec2l = ZERO_VEC2L

fun immutableVec2l(x: Long, y: Long): Vec2l = Vec2lStruct(x, y)

fun mutableVec2d(x: Double = 0.0, y: Double = 0.0): MutVec2d = MutVec2dStruct(x, y)

fun mutableVec2f(x: Float = 0f, y: Float = 0f): MutVec2f = MutVec2fStruct(x, y)

fun mutableVec2i(x: Int = 0, y: Int = 0): MutVec2i = MutVec2iStruct(x, y)

fun mutableVec2l(x: Long = 0, y: Long = 0): MutVec2l = MutVec2lStruct(x, y)

// vec3

fun immutableVec3d(): Vec3d = ZERO_VEC3D

fun immutableVec3d(x: Double, y: Double, z: Double): Vec3d = Vec3dStruct(x, y, z)

fun immutableVec3f(): Vec3f = ZERO_VEC3F

fun immutableVec3f(x: Float, y: Float, z: Float): Vec3f = Vec3fStruct(x, y, z)

fun immutableVec3i(): Vec3i = ZERO_VEC3I

fun immutableVec3i(x: Int, y: Int, z: Int): Vec3i = Vec3iStruct(x, y, z)

fun immutableVec3l(): Vec3l = ZERO_VEC3L

fun immutableVec3l(x: Long, y: Long, z: Long): Vec3l = Vec3lStruct(x, y, z)

fun mutableVec3d(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0): MutVec3d = MutVec3dStruct(x, y, z)

fun mutableVec3f(x: Float = 0f, y: Float = 0f, z: Float = 0f): MutVec3f = MutVec3fStruct(x, y, z)

fun mutableVec3i(x: Int = 0, y: Int = 0, z: Int = 0): MutVec3i = MutVec3iStruct(x, y, z)

fun mutableVec3l(x: Long = 0, y: Long = 0, z: Long = 0): MutVec3l = MutVec3lStruct(x, y, z)
