package dev.peytob.math.vec

import kotlin.Float
import kotlin.math.sqrt

/**
 * Returns length of the vector
 */
public fun length(right: Vec3f): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec3d): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec3i): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec3l): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3f, right: Vec3f): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3f, right: Vec3d): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3f, right: Vec3i): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3f, right: Vec3l): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3d, right: Vec3f): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3d, right: Vec3d): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3d, right: Vec3i): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3d, right: Vec3l): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3i, right: Vec3f): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3i, right: Vec3d): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3i, right: Vec3i): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3i, right: Vec3l): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3l, right: Vec3f): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3l, right: Vec3d): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3l, right: Vec3i): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec3l, right: Vec3l): Float = sqrt((right.x * right.x + right.y * right.y + right.z * right.z).toFloat())
