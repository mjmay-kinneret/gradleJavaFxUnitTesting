plugins {
    id("java")
    kotlin("jvm")
    id("application")
    id("org.openjfx.javafxplugin").version("0.1.0")
}

group = "il.ac.kinneret.mjmay"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("junit:junit:4.13.2")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "il.ac.kinneret.mjmay.HelloApplication"
    }
}
kotlin {
    jvmToolchain(20)
}

javafx {
    sdk = "C:\\Users\\Michael\\Development\\javafx-sdk-19"
    modules("javafx.controls", "javafx.fxml")
}

application{

}