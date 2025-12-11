package dev.peytob.math.vec

import kotlin.Float
import kotlin.math.sqrt

/**
 * Returns length of the vector
 */
public fun length(right: Vec2f): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec2d): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec2i): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns length of the vector
 */
public fun length(right: Vec2l): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2f, right: Vec2f): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2f, right: Vec2d): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2f, right: Vec2i): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2f, right: Vec2l): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2d, right: Vec2f): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2d, right: Vec2d): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2d, right: Vec2i): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2d, right: Vec2l): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2i, right: Vec2f): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2i, right: Vec2d): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2i, right: Vec2i): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2i, right: Vec2l): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2l, right: Vec2f): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2l, right: Vec2d): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2l, right: Vec2i): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())

/**
 * Returns distance between two vector
 */
public fun distance(left: Vec2l, right: Vec2l): Float = sqrt((right.x * right.x + right.y * right.y).toFloat())
