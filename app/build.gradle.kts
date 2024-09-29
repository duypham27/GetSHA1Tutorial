plugins {
    alias(libs.plugins.android.application)
}

android {
    signingConfigs {
        create("my_config") {
            storeFile = file("C:\\Users\\phamb\\AndroidStudioProjects\\test_keystore.jks")
            storePassword = "1234567"
            keyAlias = "duypham666"
            keyPassword = "1234567"
        }
    }
    namespace = "com.example.getsha1tutorial"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.getsha1tutorial"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("my_config")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}