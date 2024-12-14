plugins {
    id("java")
}

group = "ptah"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

//Versions
val commonsLang3Version = "3.15.0"
val lombokVersion = "1.18.34"
val testNgVersion = "7.10.2"
val seleniumVersion = "4.27.0"

dependencies {
    testImplementation("org.testng:testng:$testNgVersion")
    testImplementation("org.apache.commons:commons-lang3:$commonsLang3Version")
    testImplementation("org.projectlombok:lombok:$lombokVersion")
    testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
    testImplementation("org.seleniumhq.selenium:selenium-java:$seleniumVersion")
}

tasks.test {
    useTestNG()
}
