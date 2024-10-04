package dev.peytob.math.vector.vec3

internal class MutVec3fStruct(
    override var x: Float,
    override var y: Float,
    override var z: Float
) : MutVec3f {

    override val elementSizeBytes: Int
        get() = Float.SIZE_BYTES

    override val vectorSizeBytes: Int
        get() = Float.SIZE_BYTES * 3

    override fun asImmutable(): Vec3f = Vec3fStruct(x, y, z)

    override fun unaryPlus(): MutVec3f {
        return this
    }

    override fun unaryMinus(): MutVec3f {
        x = -x
        y = -y
        z = -z
        return this
    }

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3f {
        x += rightX.toFloat()
        y += rightY.toFloat()
        z += rightZ.toFloat()
        return this
    }

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3f {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3f {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3f {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3f {
        x -= rightX.toFloat()
        y -= rightY.toFloat()
        z -= rightZ.toFloat()
        return this
    }

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3f {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3f {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3f {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun times(right: Vec3f): MutVec3f {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(scalar: Float): MutVec3f {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(scalar: Double): MutVec3f {
        val floatScalar = scalar.toFloat()
        x *= floatScalar
        y *= floatScalar
        z *= floatScalar
        return this
    }

    override fun times(scalar: Int): MutVec3f {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3i): MutVec3f {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(right: Vec3d): MutVec3f {
        x *= right.x.toFloat()
        y *= right.y.toFloat()
        z *= right.z.toFloat()
        return this
    }

    override fun times(scalar: Long): MutVec3f {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3l): MutVec3f {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun dot(right: Vec3f): Float {
        return x * right.x + y * right.y + z * right.z
    }

    override fun dot(right: Vec3i): Float {
        return x * right.x + y * right.y + z * right.z
    }

    override fun dot(right: Vec3l): Float {
        return x * right.x + y * right.y + z * right.z
    }

    override fun dot(right: Vec3d): Float {
        return (x * right.x + y * right.y + z * right.z).toFloat()
    }
}
