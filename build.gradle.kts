plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-engine:5.0.0")
    implementation("com.codeborne:selenide:7.2.2")
}

tasks.test {
    useJUnitPlatform()
}