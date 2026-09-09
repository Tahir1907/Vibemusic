@file:Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

rootProject.name = "Vibemusic"
include(":app")
include(":innertube")
include(":kugou")
include(":lrclib")
include(":material-color-utilities")
include(":taglib")

if (file("ffMetadataEx").exists()) {
    include(":ffMetadataEx")
}
