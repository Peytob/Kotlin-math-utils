package dev.peytob.math.geometry.rect

import dev.peytob.math.vec.Vec2f
import dev.peytob.math.vec.Vec2i
import dev.peytob.math.vec.vec2f
import dev.peytob.math.vec.vec2i
import kotlin.math.max
import kotlin.math.min

@JvmName(name = "containsRectF")
operator fun RectF.contains(point: Vec2f): Boolean {
    return contains(point.x, point.y)
}

@JvmName(name = "containsRectF")
fun RectF.contains(px: Float, py: Float): Boolean {
    val minX = min(position.x, position.x + size.x)
    val maxX = max(position.x, position.x + size.x)
    val minY = min(position.y, position.y + size.y)
    val maxY = max(position.y, position.y + size.y)

    return (px >= minX) && (px < maxX) && (py >= minY) && (py < maxY)
}

@JvmName(name = "findIntersectionRectFRectF")
fun findIntersection(left: RectF, right: RectF): RectF? {
    val r1MinX = min(left.position.x, left.position.x + left.size.x)
    val r1MaxX = max(left.position.x, left.position.x + left.size.x)
    val r1MinY = min(left.position.y, left.position.y + left.size.y)
    val r1MaxY = max(left.position.y, left.position.y + left.size.y)

    val r2MinX = min(right.position.x, right.position.x + right.size.x)
    val r2MaxX = max(right.position.x, right.position.x + right.size.x)
    val r2MinY = min(right.position.y, right.position.y + right.size.y)
    val r2MaxY = max(right.position.y, right.position.y + right.size.y)

    val interLeft = max(r1MinX, r2MinX)
    val interTop = max(r1MinY, r2MinY)
    val interRight = min(r1MaxX, r2MaxX)
    val interBottom = min(r1MaxY, r2MaxY)

    // Intersection should be non-zero
    if ((interLeft < interRight) && (interTop < interBottom)) {
        return StructRectF(
            position = vec2f(interLeft, interTop),
            size = vec2f(interRight - interLeft, interBottom - interTop)
        )
    }

    return null
}

@JvmName(name = "containsRectI")
operator fun RectI.contains(point: Vec2i): Boolean {
    return contains(point.x, point.y)
}

@JvmName(name = "containsRectI")
fun RectI.contains(px: Int, py: Int): Boolean {
    val minX = min(position.x, position.x + size.x)
    val maxX = max(position.x, position.x + size.x)
    val minY = min(position.y, position.y + size.y)
    val maxY = max(position.y, position.y + size.y)

    return (px >= minX) && (px < maxX) && (py >= minY) && (py < maxY)
}

@JvmName(name = "findIntersectionRectIRectI")
fun findIntersection(left: RectI, right: RectI): RectI? {
    val r1MinX = min(left.position.x, left.position.x + left.size.x)
    val r1MaxX = max(left.position.x, left.position.x + left.size.x)
    val r1MinY = min(left.position.y, left.position.y + left.size.y)
    val r1MaxY = max(left.position.y, left.position.y + left.size.y)

    val r2MinX = min(right.position.x, right.position.x + right.size.x)
    val r2MaxX = max(right.position.x, right.position.x + right.size.x)
    val r2MinY = min(right.position.y, right.position.y + right.size.y)
    val r2MaxY = max(right.position.y, right.position.y + right.size.y)

    val interLeft = max(r1MinX, r2MinX)
    val interTop = max(r1MinY, r2MinY)
    val interRight = min(r1MaxX, r2MaxX)
    val interBottom = min(r1MaxY, r2MaxY)

    // Intersection should be non-zero
    if ((interLeft < interRight) && (interTop < interBottom)) {
        return StructRectI(
            position = vec2i(interLeft, interTop),
            size = vec2i(interRight - interLeft, interBottom - interTop)
        )
    }

    return null
}
