plugins {
    kotlin("jvm") version "1.9.0" // 使用最新稳定版
    application
    id("org.openjfx.javafxplugin") version "0.0.14"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

javafx {
    version = "17" // JavaFX 版本
    modules("javafx.controls") // 需要的JavaFX模块
}

application {
    mainClass.set("TextTransferAppKt") // Kotlin类名+KT后缀
}

tasks.named<JavaExec>("run") {
    // 配置运行任务
    standardInput = System.`in`
    jvmArgs = listOf("--add-opens", "javafx.graphics/com.sun.javafx.css=ALL-UNNAMED")
}
