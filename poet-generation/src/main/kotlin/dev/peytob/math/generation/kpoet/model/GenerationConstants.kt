package dev.peytob.math.generation.kpoet.model

import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName
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
        cls = Double::class.asClassName(),
        sizeBytes = Double.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toDouble"),
        literal = ".0",
        postfix = "d"
    ),

    PrimitiveDescriptor(
        cls = Float::class.asClassName(),
        sizeBytes = Float.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toFloat"),
        literal = "f",
        postfix = "f"
    ),

    PrimitiveDescriptor(
        cls = Int::class.asClassName(),
        sizeBytes = Int.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toInt"),
        literal = null,
        postfix = "i"
    ),

    PrimitiveDescriptor(
        cls = Long::class.asClassName(),
        sizeBytes = Long.SIZE_BYTES,
        numberCastMethodName = MemberName(Number::class.asClassName(), "toLong"),
        literal = "L",
        postfix = "l"
    )
)

val VECTOR_ORDERS: Collection<VectorOrder> = listOf(
    VectorOrder(
        components = listOf("x", "y"),
        destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec2"
    ),

    VectorOrder(
        components = listOf("x", "y", "z"),
        destinationPackage = "$DESTINATION_PACKAGE_ROOT.vector.vec3"
    )
)
