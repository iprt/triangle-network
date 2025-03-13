dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public/") }
    }
}

buildCache {
    local {
        isEnabled = true
        directory = file("${rootDir}/.gradle/build-cache")
        removeUnusedEntriesAfterDays = 30
    }
}

rootProject.name = "triangle-network"

include("triangle-commons")

include("internal:event-accessor", "internal:data-transfer-server")

include("external-core")