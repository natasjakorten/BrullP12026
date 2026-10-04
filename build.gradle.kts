plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "brull"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.12")
    implementation("io.ktor:ktor-server-netty:2.3.12")
    testImplementation("io.ktor:ktor-server-test-host:2.3.12")
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}

application {
    mainClass.set("brull.ApplicationKt")
}

tasks.test {
    useJUnitPlatform()
}
