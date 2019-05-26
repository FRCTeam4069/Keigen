import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
    maven
}

group = "frc.team4069"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile("org.ejml:ejml-all:0.37")
    testCompile("junit:junit:4.12")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
