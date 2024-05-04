package dev.peytob.math.vector.vec3

internal data class Vec3lStruct(
    override val x: Long,
    override val y: Long,
    override val z: Long
) : Vec3l {

    override fun asMutable(): MutVec3l = MutVec3lStruct(x, y, z)

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * 3

    override fun unaryPlus(): Vec3l = this

    override fun unaryMinus(): Vec3l = Vec3lStruct(x, y, z)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3l = Vec3lStruct((x + rightX).toLong(), (y + rightY).toLong(), (z + rightZ).toLong())

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3l = Vec3lStruct((x + rightX).toLong(), (y + rightY).toLong(), (z + rightZ).toLong())

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3l = Vec3lStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3l = Vec3lStruct(x + rightX, y + rightY, z + rightZ)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3l = Vec3lStruct((x - rightX).toLong(), (y - rightY).toLong(), (z - rightZ).toLong())

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3l = Vec3lStruct((x - rightX).toLong(), (y - rightY).toLong(), (z - rightZ).toLong())

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3l = Vec3lStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3l = Vec3lStruct(x - rightX, y - rightY, z - rightZ)

    override fun times(scalar: Double): Vec3l = Vec3lStruct((x * scalar).toLong(), (y * scalar).toLong(), (z * scalar).toLong())

    override fun times(right: Vec3d): Vec3l = Vec3lStruct((x * right.x).toLong(), (y * right.y).toLong(), (z * right.z).toLong())

    override fun times(scalar: Float): Vec3l = Vec3lStruct((x * scalar).toLong(), (y * scalar).toLong(), (z * scalar).toLong())

    override fun times(right: Vec3f): Vec3l = Vec3lStruct((x * right.x).toLong(), (y * right.y).toLong(), (z * right.z).toLong())

    override fun times(scalar: Int): Vec3l = Vec3lStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3i): Vec3l = Vec3lStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Long): Vec3l = Vec3lStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3l): Vec3l = Vec3lStruct(x * right.x, y * right.y, z * right.z)

    override fun dot(right: Vec3d): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3f): Float = x * right.x + y * right.y

    override fun dot(right: Vec3<Int>): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3l): Float = (x * right.x + y * right.y).toFloat()
}
