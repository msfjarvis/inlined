pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
  }
}
rootProject.name = "inlined"
include("inlined")
