rootProject.name = "renovate-versions-catalogs-repro"

enableFeaturePreview("VERSION_CATALOGS")

include(":library")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }

    versionCatalogs {
        create("customLibs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}
