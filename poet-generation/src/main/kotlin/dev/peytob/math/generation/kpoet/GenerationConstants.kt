package dev.peytob.math.generation.kpoet

import java.nio.file.Path
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val DESTINATION_PACKAGE_ROOT = "dev.peytob.math"
const val DESTINATION_PACKAGE_VEC2 = "$DESTINATION_PACKAGE_ROOT.vector.vec2"

val BASE_DESTINATION_FOLDER: Path = Path.of("./math/src/main/kotlin/")

val GENERATED_DATE: String = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now())
