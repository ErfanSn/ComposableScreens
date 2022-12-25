pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            version("compileSdk", "33")
            version("minSdk", "21")
            version("targetSdk", "33")

            version("kotlin", "1.7.21")
            version("agp", "7.3.1")
            version("compose-compiler", "1.4.0-alpha02")
            version("compose-bom", "2022.12.00")

            library("androidx.compose-bom", "androidx.compose", "compose-bom").versionRef("compose-bom")
            library("androidx-compose-material", "androidx.compose.material", "material").withoutVersion()
            library("androidx-compose-material3", "androidx.compose.material3", "material3").withoutVersion()
            library("androidx-compose-material-iconsExtended", "androidx.compose.material", "material-icons-extended").withoutVersion()
            library("androidx-compose-material3-windowSizeClass", "androidx.compose.material3", "material3-window-size-class").withoutVersion()
            val composeLibraries = listOf(
                "androidx-compose-material-iconsExtended",
                "androidx-compose-material3-windowSizeClass",
            )
            bundle("compose", composeLibraries + "androidx-compose-material")
            bundle("composeM3", composeLibraries + "androidx-compose-material3")

            library("androidx-compose-uiTooling-preview", "androidx.compose.ui", "ui-tooling-preview").withoutVersion()
            library("androidx-compose-uiTooling", "androidx.compose.ui", "ui-tooling").withoutVersion()

            library("androidx-core", "androidx.core:core-ktx:1.9.0")

            library("androidx-activityCompose", "androidx.activity:activity-compose:1.6.1")
            library("androidx-constraintlayoutCompose", "androidx.constraintlayout:constraintlayout-compose:1.0.1")
            library("androidx-navigationCompose", "androidx.navigation:navigation-compose:2.5.3")
        }
    }
}
rootProject.name = "Composable Screens"
include(":app")
include(":travel")
include(":music")
