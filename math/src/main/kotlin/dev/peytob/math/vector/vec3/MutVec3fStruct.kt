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

    override fun asImmutable(): Vec3<Float> = Vec3fStruct(x, y, z)

    override fun unaryPlus(): MutVec3<Float> {
        return this
    }

    override fun unaryMinus(): MutVec3<Float> {
        x = -x
        y = -y
        z = -z
        return this
    }

    override fun plus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Float> {
        x += rightX.toFloat()
        y += rightY.toFloat()
        z += rightZ.toFloat()
        return this
    }

    override fun plus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Float> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Float> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun plus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Float> {
        x += rightX
        y += rightY
        z += rightZ
        return this
    }

    override fun minus(rightX: Double, rightY: Double, rightZ: Double): MutVec3<Float> {
        x -= rightX.toFloat()
        y -= rightY.toFloat()
        z -= rightZ.toFloat()
        return this
    }

    override fun minus(rightX: Float, rightY: Float, rightZ: Float): MutVec3<Float> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Int, rightY: Int, rightZ: Int): MutVec3<Float> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun minus(rightX: Long, rightY: Long, rightZ: Long): MutVec3<Float> {
        x -= rightX
        y -= rightY
        z -= rightZ
        return this
    }

    override fun times(right: Vec3f): MutVec3<Float> {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(scalar: Float): MutVec3<Float> {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(scalar: Double): MutVec3<Float> {
        val floatScalar = scalar.toFloat()
        x *= floatScalar
        y *= floatScalar
        z *= floatScalar
        return this
    }

    override fun times(scalar: Int): MutVec3<Float> {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3i): MutVec3<Float> {
        x *= right.x
        y *= right.y
        z *= right.z
        return this
    }

    override fun times(right: Vec3d): MutVec3<Float> {
        x *= right.x.toFloat()
        y *= right.y.toFloat()
        z *= right.z.toFloat()
        return this
    }

    override fun times(scalar: Long): MutVec3<Float> {
        x *= scalar
        y *= scalar
        z *= scalar
        return this
    }

    override fun times(right: Vec3l): MutVec3<Float> {
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
