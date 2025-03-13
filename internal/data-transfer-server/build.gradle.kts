plugins {
    id("java")
}

group = "io.intellij.network.triangle.internal.dt-server"
version = "1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
repositories {
    maven { url = uri("https://maven.aliyun.com/repository/public/") }
}

dependencies {
    implementation(project(":triangle-commons"))
}
