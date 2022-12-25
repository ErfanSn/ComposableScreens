plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "${rootProject.extra["packageName"]}.music"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    implementation(libs.androidx.core)
    implementation(libs.androidx.activityCompose)
    implementation(libs.androidx.constraintlayoutCompose)
    implementation(libs.androidx.navigationCompose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.composeM3)

    implementation(libs.androidx.compose.uiTooling.preview)
    debugImplementation(libs.androidx.compose.uiTooling.asProvider())
}