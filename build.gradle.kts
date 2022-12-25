// Top-level build file where you can add configuration options common to all sub-projects/modules.
extra["packageName"] = "ir.erfansn.composablescreens"
@Suppress(
    "DSL_SCOPE_VIOLATION",
    "MISSING_DEPENDENCY_CLASS",
    "UNRESOLVED_REFERENCE_WRONG_RECEIVER",
    "FUNCTION_CALL_EXPECTED"
)
plugins {
    val agpVersion = libs.versions.agp.get()
    val kotlinVersion = libs.versions.kotlin.get()
    id("com.android.application") version agpVersion apply false
    id("com.android.library") version agpVersion apply false
    kotlin("android") version kotlinVersion apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}