plugins {
    java
    id("org.springframework.boot") version "3.5.5"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "io.github.pavelshe11"
version = "0.0.1-SNAPSHOT"
description = "WebSocketHub"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")

    // для healthCheck
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    // Для аутентификации и авторизации
//    implementation("org.springframework.boot:spring-boot-starter-security")
//    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
//    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
    // Сваггер документация
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.8")

    // управление kafka
    implementation("org.springframework.kafka:spring-kafka")

    // websocket
    implementation("org.springframework.boot:spring-boot-starter-websocket")

    // STOMP
    implementation("org.springframework:spring-messaging")

    // lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
