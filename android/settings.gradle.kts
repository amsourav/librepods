pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        // Fallback mirrors for when Maven Central rate-limits CI
        maven("https://maven.aliyun.com/repository/central")
        maven("https://repo1.maven.org/maven2")
    }
}

rootProject.name = "LibrePods"
include(":app")
