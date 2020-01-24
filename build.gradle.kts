plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core", "jackson-core", "2.9.10")
    implementation("com.fasterxml.jackson.jaxrs", "jackson-jaxrs-json-provider", "2.9.10")

  implementation("com.fasterxml.jackson.core", "jackson-core", "2.9.10")
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
