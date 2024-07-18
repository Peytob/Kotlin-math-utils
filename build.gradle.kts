import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.21"
    id("maven-publish")
    `java-library`
}

group = "dev.peytob.math"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

publishing {

    repositories {
        mavenLocal()
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = "kotlin-math-utils"
            version = project.version.toString()

            from(components["java"])
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}
