package dev.peytob.math.vector.vec3

import javax.`annotation`.processing.Generated
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.jvm.JvmName

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3fd")
public operator fun MutVec3<Float>.plus(right: Vec3Accessor<Double>): MutVec3<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  this.z = (this.z + right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.plus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fd")
public operator fun MutVec3<Float>.times(right: Vec3Accessor<Double>): MutVec3<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  this.z = (this.z * right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.times(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fd")
public fun MutVec3<Float>.dot(right: Vec3Accessor<Double>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.dot(
  rx: Double,
  ry: Double,
  rz: Double,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3fd")
public operator fun MutVec3<Float>.minus(right: Vec3Accessor<Double>): MutVec3<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  this.z = (this.z - right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.minus(
  rx: Double,
  ry: Double,
  rz: Double,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3ff")
public operator fun MutVec3<Float>.plus(right: Vec3Accessor<Float>): MutVec3<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  this.z = (this.z + right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.plus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3ff")
public operator fun MutVec3<Float>.times(right: Vec3Accessor<Float>): MutVec3<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  this.z = (this.z * right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.times(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3ff")
public fun MutVec3<Float>.dot(right: Vec3Accessor<Float>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.dot(
  rx: Float,
  ry: Float,
  rz: Float,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3ff")
public operator fun MutVec3<Float>.minus(right: Vec3Accessor<Float>): MutVec3<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  this.z = (this.z - right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.minus(
  rx: Float,
  ry: Float,
  rz: Float,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3fi")
public operator fun MutVec3<Float>.plus(right: Vec3Accessor<Int>): MutVec3<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  this.z = (this.z + right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.plus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fi")
public operator fun MutVec3<Float>.times(right: Vec3Accessor<Int>): MutVec3<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  this.z = (this.z * right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.times(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fi")
public fun MutVec3<Float>.dot(right: Vec3Accessor<Int>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.dot(
  rx: Int,
  ry: Int,
  rz: Int,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3fi")
public operator fun MutVec3<Float>.minus(right: Vec3Accessor<Int>): MutVec3<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  this.z = (this.z - right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.minus(
  rx: Int,
  ry: Int,
  rz: Int,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "plusVecVec3fl")
public operator fun MutVec3<Float>.plus(right: Vec3Accessor<Long>): MutVec3<Float> {
  this.x = (this.x + right.x).toFloat()
  this.y = (this.y + right.y).toFloat()
  this.z = (this.z + right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.plus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x + rx).toFloat()
  this.y = (this.y + ry).toFloat()
  this.z = (this.z + rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "timesVecVec3fl")
public operator fun MutVec3<Float>.times(right: Vec3Accessor<Long>): MutVec3<Float> {
  this.x = (this.x * right.x).toFloat()
  this.y = (this.y * right.y).toFloat()
  this.z = (this.z * right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.times(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x * rx).toFloat()
  this.y = (this.y * ry).toFloat()
  this.z = (this.z * rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "dotVecVec3fl")
public fun MutVec3<Float>.dot(right: Vec3Accessor<Long>): Float {
  val sum = this.x * right.x + this.y * right.y + this.z * right.z
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.dot(
  rx: Long,
  ry: Long,
  rz: Long,
): Float {
  val sum = this.x * rx + this.y * ry + this.z * rz
  return sum.toFloat()
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "minusVecVec3fl")
public operator fun MutVec3<Float>.minus(right: Vec3Accessor<Long>): MutVec3<Float> {
  this.x = (this.x - right.x).toFloat()
  this.y = (this.y - right.y).toFloat()
  this.z = (this.z - right.z).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public fun MutVec3<Float>.minus(
  rx: Long,
  ry: Long,
  rz: Long,
): MutVec3<Float> {
  this.x = (this.x - rx).toFloat()
  this.y = (this.y - ry).toFloat()
  this.z = (this.z - rz).toFloat()
  return this
}

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.plus(scalar: Double): MutVec3<Float> = this.plus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.times(scalar: Double): MutVec3<Float> = this.times(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.minus(scalar: Double): MutVec3<Float> = this.minus(rx = scalar,
    ry = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.plus(scalar: Float): MutVec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.times(scalar: Float): MutVec3<Float> = this.times(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.minus(scalar: Float): MutVec3<Float> = this.minus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.plus(scalar: Int): MutVec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.times(scalar: Int): MutVec3<Float> = this.times(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.minus(scalar: Int): MutVec3<Float> = this.minus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.plus(scalar: Long): MutVec3<Float> = this.plus(rx = scalar, ry =
    scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.times(scalar: Long): MutVec3<Float> = this.times(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
public operator fun MutVec3<Float>.minus(scalar: Long): MutVec3<Float> = this.minus(rx = scalar, ry
    = scalar, rz = scalar)

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryPlusMutVec3f")
public operator fun MutVec3<Float>.unaryPlus(): MutVec3<Float> = this

@Generated(
  value = ["poet", "kmu"],
  date = "2025-03-09",
)
@JvmName(name = "unaryMinusMutVec3f")
public operator fun MutVec3<Float>.unaryMinus(): MutVec3<Float> {
  this.x = -this.x
  this.y = -this.y
  this.z = -this.z
  return this
}
