package dev.peytob.math.generation.kpoet

import java.nio.file.Path
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


val DESTINATION_PACKAGE_ROOT: String = System.getenv("ROOT_PACKAGE") ?: "dev.peytob.math"

val BASE_DESTINATION_FOLDER: Path = run {
    val path = System.getenv("DESTINATION_FOLDER") ?: "./math/src/main/kotlin/"
    Path.of(path)
}

val GENERATED_DATE: String = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now())
