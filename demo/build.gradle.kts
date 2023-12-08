plugins {
    kotlin("jvm") version "1.9.21"
    `java-library`
}

group = "dev.peytob.math"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":math"))
    implementation(project(":random"))

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
