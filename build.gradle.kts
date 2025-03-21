plugins {
    id 'java'
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter', version: '5.4.2'

}

tasks.test {
    useJUnitPlatform()
}