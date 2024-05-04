package dev.peytob.math.vector.vec3

internal data class Vec3fStruct(
    override val x: Float,
    override val y: Float,
    override val z: Float
) : Vec3f {

    override fun asMutable(): MutVec3f = MutVec3fStruct(x, y, z)

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * 3

    override fun unaryPlus(): Vec3f = this

    override fun unaryMinus(): Vec3f = Vec3fStruct(x, y, z)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3f = Vec3fStruct((x + rightX).toFloat(), (y + rightY).toFloat(), (z + rightZ).toFloat())

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3f = Vec3fStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3f = Vec3fStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3f = Vec3fStruct(x + rightX, y + rightY, z + rightZ)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3f = Vec3fStruct((x - rightX).toFloat(), (y - rightY).toFloat(), (z - rightZ).toFloat())

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3f = Vec3fStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3f = Vec3fStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3f = Vec3fStruct(x - rightX, y - rightY, z - rightZ)

    override fun times(scalar: Double): Vec3f = Vec3fStruct((x * scalar).toFloat(), (y * scalar).toFloat(), (z * scalar).toFloat())

    override fun times(right: Vec3d): Vec3f = Vec3fStruct((x * right.x).toFloat(), (y * right.y).toFloat(), (z * right.z).toFloat())

    override fun times(scalar: Float): Vec3f = Vec3fStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3f): Vec3f = Vec3fStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Int): Vec3f = Vec3fStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3i): Vec3f = Vec3fStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Long): Vec3f = Vec3fStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3l): Vec3f = Vec3fStruct(x * right.x, y * right.y, z * right.z)

    override fun dot(right: Vec3d): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3f): Float = x * right.x + y * right.y

    override fun dot(right: Vec3<Int>): Float = x * right.x + y * right.y

    override fun dot(right: Vec3l): Float = x * right.x + y * right.y
}