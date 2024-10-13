package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName
import dev.peytob.math.vector.vec2.Vec2
import dev.peytob.math.vector.vec2.Vec2Accessor
import java.nio.file.Path
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val DESTINATION_PACKAGE_ROOT: String = System.getenv("ROOT_PACKAGE") ?: "dev.peytob.math"

val BASE_DESTINATION_FOLDER: Path = run {
    val path = System.getenv("DESTINATION_FOLDER") ?: "./math/src/main/kotlin/"
    Path.of(path)
}

val GENERATED_DATE: String = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now())

val PRIMITIVE_DESCRIPTORS: Collection<PrimitiveDescriptor> = listOf(
    PrimitiveDescriptor(
        cls = Double::class,
        sizeBytes = Double.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toDouble"),
        literal = ".0"
    ),

    PrimitiveDescriptor(
        cls = Float::class,
        sizeBytes = Float.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toFloat"),
        literal = "f"
    ),

    PrimitiveDescriptor(
        cls = Int::class,
        sizeBytes = Int.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toInt"),
        literal = null
    ),

    PrimitiveDescriptor(
        cls = Long::class,
        sizeBytes = Long.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toLong"),
        literal = "L"
    )
)

val VECTOR_DESCRIPTORS: Collection<VectorDescriptor> = listOf(
    VectorDescriptor(
        components = listOf("x", "y"),
        base = Vec2::class,
        accessor = Vec2Accessor::class,
        destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec2",
        isImmutable = true
    )
)
