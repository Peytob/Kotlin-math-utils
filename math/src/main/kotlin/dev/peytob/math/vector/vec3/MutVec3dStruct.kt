package dev.peytob.math.vector.vec3

internal class MutVec3dStruct(
    override var x: Double,
    override var y: Double,
    override var z: Double
) : MutVec3d {

    override val elementSizeBytes: Int
        get() = Double.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Double.SIZE_BYTES * 3

    override fun asImmutable(): Vec3d = Vec3dStruct(x, y, z)

    override fun unaryPlus(): MutVec3d {
        return this
    }

    override fun unaryMinus(): MutVec3d {
        x = -x
        y = -y
        z = -z
        return this
    }

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3d {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3d {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3d {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3d {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3d {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3d {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3d {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3d {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun times(right: Vec3f): MutVec3d {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(scalar: Float): MutVec3d {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(scalar: Double): MutVec3d {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(scalar: Int): MutVec3d {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3i): MutVec3d {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(right: Vec3d): MutVec3d {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(scalar: Long): MutVec3d {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3l): MutVec3d {
        x *= right.x
        y *= right.y
        z *= right.z
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
