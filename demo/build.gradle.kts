plugins {
    kotlin("jvm") version "1.9.21"
    application
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

application {
    mainClass.set("dev.peytob.math.demo.MainKt")
}

tasks.test {
    useJUnitPlatform()
}
