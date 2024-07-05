plugins {
    application
    jacoco
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.serialization") version "1.9.24"
    id("io.ktor.plugin") version "2.3.11"
    id("app.cash.sqldelight") version "2.0.2"
}

group = "com.orcchg"
version = "1.0.0"

application {
    mainClass.set("com.orcchg.services.MainServiceKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    maven("https://developer.huawei.com/repo/")
}

sqldelight {
    databases {
        create("CryptoSampleKMPBackendDatabase") {
            packageName = "com.orcchg.database"
            dialect(libs.sqldelight.postgresql.dialect)
            schemaOutputDirectory = file("src/main/sqldelight/databases")
            verifyMigrations = true
        }
    }
}

dependencies {
    implementation(libs.google.api)
    implementation(libs.google.integrity)
    implementation(libs.gson)
    implementation(libs.jose4j)
    implementation(libs.json)
    implementation(platform(libs.koin.bom))
    implementation(libs.koin.core)
    implementation(libs.koin.ktor)
    implementation(libs.ktor.client.auth)
    implementation(libs.ktor.client.contentNegotiation)
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.server.auth)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.jvm)
    implementation(libs.ktor.server.netty.core)
    implementation(libs.ktor.server.netty.jvm)
    implementation(libs.ktor.server.contentNegotiation)
    implementation(libs.ktor.server.serialization)
    implementation(libs.logback)
    implementation(libs.postgresql.jdbc.driver)
    implementation(libs.sqldelight.coroutines)
    implementation(libs.sqldelight.driver.core)
    implementation(libs.sqldelight.driver.jdbc)
    implementation(libs.sqldelight.primitive.adapters)

    testImplementation(platform(libs.koin.bom))
    testImplementation(libs.hamcrest)
    testImplementation(libs.junit)
    testImplementation(libs.koin.test)
    testImplementation(libs.kt.coroutines.test)
    testImplementation(libs.kt.junit)
    testImplementation(libs.ktor.server.test.host)
    testImplementation(libs.ktor.server.test.jvm)
    testImplementation(libs.mockk)
    implementation(kotlin("stdlib-jdk8"))
}

tasks.register("stage").configure {
    dependsOn("installDist")
}
tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(18)
}
