package dev.peytob.math.vector.vec3

internal class MutVec3lStruct(
    override var x: Long,
    override var y: Long,
    override var z: Long
) : MutVec3l {

    override val elementSizeBytes: Int
        get() = Long.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Long.SIZE_BYTES * 3

    override fun asImmutable(): Vec3<Long> = Vec3lStruct(x, y, z)

    override fun unaryPlus(): MutVec3<Long> {
        return this
    }

    override fun unaryMinus(): MutVec3<Long> {
        x = -x
        y = -y
        z = -z
        return this
    }

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Long> {
        x += rightX.toLong()
        y += rightY.toLong()
        z += rightZ.toLong()
        return this
    }

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Long> {
        x += rightX.toLong()
        y += rightY.toLong()
        z += rightZ.toLong()
        return this
    }

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Long> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Long> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Long> {
        x -= rightX.toLong()
        y -= rightY.toLong()
        z -= rightZ.toLong()
        return this
    }

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Long> {
        x -= rightX.toLong()
        y -= rightY.toLong()
        z -= rightZ.toLong()
        return this
    }

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Long> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Long> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun times(right: Vec3f): MutVec3<Long> {
        x *= right.x.toLong()
        y *= right.y.toLong()
        z *= right.z.toLong()
        return this
    }

    override fun times(scalar: Float): MutVec3<Long> {
        x *= scalar.toLong()
        y *= scalar.toLong()
        z *= scalar.toLong()
        return this
    }

    override fun times(scalar: Double): MutVec3<Long> {
        val longScalar = scalar.toLong()
        x *= longScalar
        y *= longScalar
        z *= longScalar
        return this
    }

    override fun times(scalar: Int): MutVec3<Long> {
        val longScalar = scalar.toLong()
        x *= longScalar
        y *= longScalar
        z *= longScalar
        return this
    }

    override fun times(right: Vec3i): MutVec3<Long> {
        x *= right.x.toLong()
        y *= right.y.toLong()
        z *= right.z.toLong()
        return this
    }

    override fun times(right: Vec3d): MutVec3<Long> {
        x *= right.x.toLong()
        y *= right.y.toLong()
        z *= right.z.toLong()
        return this
    }

    override fun times(scalar: Long): MutVec3<Long> {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3l): MutVec3<Long> {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun dot(right: Vec3f): Float {
        return x * right.x + y * right.y + z * right.z
    }

    override fun dot(right: Vec3i): Float {
        return (x * right.x + y * right.y + z * right.z).toFloat()
    }

    override fun dot(right: Vec3l): Float {
        return (x * right.x + y * right.y + z * right.z).toFloat()
    }

    override fun dot(right: Vec3d): Float {
        return (x * right.x + y * right.y + z * right.z).toFloat()
    }
}
