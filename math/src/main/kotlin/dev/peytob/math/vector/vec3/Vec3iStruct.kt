package dev.peytob.math.vector.vec3

internal data class Vec3iStruct(
    override val x: Int,
    override val y: Int,
    override val z: Int
) : Vec3i {

    override fun asMutable(): MutVec3i = MutVec3iStruct(x, y, z)

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 3

    override fun unaryPlus(): Vec3i = this

    override fun unaryMinus(): Vec3i = Vec3iStruct(x, y, z)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3i = Vec3iStruct((x + rightX).toInt(), (y + rightY).toInt(), (z + rightZ).toInt())

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3i = Vec3iStruct((x + rightX).toInt(), (y + rightY).toInt(), (z + rightZ).toInt())

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3i = Vec3iStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3i = Vec3iStruct((x + rightX).toInt(), (y + rightY).toInt(), (z + rightZ).toInt())

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3i = Vec3iStruct((x - rightX).toInt(), (y - rightY).toInt(), (z - rightZ).toInt())

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3i = Vec3iStruct((x - rightX).toInt(), (y - rightY).toInt(), (z - rightZ).toInt())

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3i = Vec3iStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3i = Vec3iStruct((x - rightX).toInt(), (y - rightY).toInt(), (z - rightZ).toInt())

    override fun times(scalar: Double): Vec3i = Vec3iStruct((x * scalar).toInt(), (y * scalar).toInt(), (z * scalar).toInt())

    override fun times(right: Vec3d): Vec3i = Vec3iStruct((x * right.x).toInt(), (y * right.y).toInt(), (z * right.z).toInt())

    override fun times(scalar: Float): Vec3i = Vec3iStruct((x * scalar).toInt(), (y * scalar).toInt(), (z * scalar).toInt())

    override fun times(right: Vec3f): Vec3i = Vec3iStruct((x * right.x).toInt(), (y * right.y).toInt(), (z * right.z).toInt())

    override fun times(scalar: Int): Vec3i = Vec3iStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3i): Vec3i = Vec3iStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Long): Vec3i = Vec3iStruct((x * scalar).toInt(), (y * scalar).toInt(), (z * scalar).toInt())

    override fun times(right: Vec3l): Vec3i = Vec3iStruct((x * right.x).toInt(), (y * right.y).toInt(), (z * right.z).toInt())

    override fun dot(right: Vec3d): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3f): Float = x * right.x + y * right.y

    override fun dot(right: Vec3<Int>): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3l): Float = (x * right.x + y * right.y).toFloat()
}