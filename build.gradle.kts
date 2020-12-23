buildscript {
  repositories {
    mavenLocal()
    jcenter()
    google()
    gradlePluginPortal()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { setUrl("https://kotlin.bintray.com/kotlinx") }
  }

  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30-M1")
  }
}

allprojects {
  repositories {
    mavenLocal()
    jcenter()
    google()
    gradlePluginPortal()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { setUrl("https://kotlin.bintray.com/kotlinx") }
  }
}
