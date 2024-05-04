package dev.peytob.math.vector.vec3

internal class MutVec3iStruct(
    override var x: Int,
    override var y: Int,
    override var z: Int
) : MutVec3i {

    override val elementSizeBytes: Int
        get() = Int.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Int.SIZE_BYTES * 3

    override fun asImmutable(): Vec3<Int> = Vec3iStruct(x, y, z)

    override fun unaryPlus(): MutVec3<Int> {
        return this
    }

    override fun unaryMinus(): MutVec3<Int> {
        x = -x
        y = -y
        z = -z
        return this
    }

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        z += rightZ.toInt()
        return this
    }

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        z += rightZ.toInt()
        return this
    }

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Int> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Int> {
        x += rightX.toInt()
        y += rightY.toInt()
        z += rightZ.toInt()
        return this
    }

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        z -= rightZ.toInt()
        return this
    }

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        z -= rightZ.toInt()
        return this
    }

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Int> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Int> {
        x -= rightX.toInt()
        y -= rightY.toInt()
        z -= rightZ.toInt()
        return this
    }

    override fun times(right: Vec3f): MutVec3<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        z *= right.z.toInt()
        return this
    }

    override fun times(scalar: Float): MutVec3<Int> {
        val intScalar = scalar.toInt()
        x *= intScalar
        y *= intScalar
        z *= intScalar
        return this
    }

    override fun times(scalar: Double): MutVec3<Int> {
        val intScalar = scalar.toInt()
        x *= intScalar
        y *= intScalar
        z *= intScalar
        return this
    }

    override fun times(scalar: Int): MutVec3<Int> {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3i): MutVec3<Int> {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(right: Vec3d): MutVec3<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        z *= right.z.toInt()
        return this
    }

    override fun times(scalar: Long): MutVec3<Int> {
        val intScalar = scalar.toInt()
        x *= intScalar
        y *= intScalar
        z *= intScalar
        return this
    }

    override fun times(right: Vec3l): MutVec3<Int> {
        x *= right.x.toInt()
        y *= right.y.toInt()
        z *= right.z.toInt()
        return this
    }

    override fun dot(right: Vec3f): Float {
        return (x * right.x + y * right.y + z * right.z).toFloat()
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
