plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = com.vini.jetcompose.buildsrc.Versions.kotlinCompilerExtensionVersion
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(com.vini.jetcompose.buildsrc.Dependencies.coreKtx)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.composeDefault)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.composeTooling)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.composeActivity)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.composeFundation)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.composeMaterial)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.appCompat)
    implementation(com.vini.jetcompose.buildsrc.Dependencies.material3)

    testImplementation(com.vini.jetcompose.buildsrc.Dependencies.junit4)
    testImplementation(com.vini.jetcompose.buildsrc.Dependencies.junitExtensionsKtx)
    testImplementation(com.vini.jetcompose.buildsrc.Dependencies.truth)
}