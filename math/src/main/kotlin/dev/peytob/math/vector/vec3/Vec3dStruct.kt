package dev.peytob.math.vector.vec3

internal data class Vec3dStruct(
    override val x: Double,
    override val y: Double,
    override val z: Double
): Vec3d {

    override fun asMutable(): MutVec3d = MutVec3dStruct(x, y, z)

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * 3

    override fun unaryPlus(): Vec3d = this

    override fun unaryMinus(): Vec3d = Vec3dStruct(x, y, z)

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): Vec3d = Vec3dStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): Vec3d = Vec3dStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): Vec3d =  Vec3dStruct(x + rightX, y + rightY, z + rightZ)

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): Vec3d = Vec3dStruct(x + rightX, y + rightY, z + rightZ)

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): Vec3d = Vec3dStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): Vec3d = Vec3dStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): Vec3d = Vec3dStruct(x - rightX, y - rightY, z - rightZ)

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): Vec3d = Vec3dStruct(x - rightX, y - rightY, z - rightZ)

    override fun times(scalar: Double): Vec3d = Vec3dStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3d): Vec3d = Vec3dStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Float): Vec3d = Vec3dStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3f): Vec3d = Vec3dStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Int): Vec3d = Vec3dStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3i): Vec3d = Vec3dStruct(x * right.x, y * right.y, z * right.z)

    override fun times(scalar: Long): Vec3d = Vec3dStruct(x * scalar, y * scalar, z * scalar)

    override fun times(right: Vec3l): Vec3d = Vec3dStruct(x * right.x, y * right.y, z * right.z)
    override fun dot(right: Vec3d): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3f): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3<Int>): Float = (x * right.x + y * right.y).toFloat()

    override fun dot(right: Vec3l): Float = (x * right.x + y * right.y).toFloat()
}
