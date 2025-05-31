plugins {
    kotlin("jvm") version "1.9.20"
    id("org.openjfx.javafxplugin") version "0.1.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

javafx {
    version = "17.0.2"
    modules("javafx.controls", "javafx.fxml")
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain(19)
}
