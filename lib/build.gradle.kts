import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.jetbrains.kotlin.jvm") version "1.4.30-M1"
  `java-library`
}

repositories {
  jcenter()
  maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
  maven { setUrl("https://kotlin.bintray.com/kotlinx") }
}

dependencies {
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.jetbrains.kotlin:kotlin-test")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
  jvmTarget = JavaVersion.VERSION_1_8.toString()
  freeCompilerArgs = freeCompilerArgs + listOf("-Xinline-classes")
}
