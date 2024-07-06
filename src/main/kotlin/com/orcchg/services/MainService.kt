package com.orcchg.services

import com.orcchg.di.Qualifier
import com.orcchg.di.commonModule
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import org.koin.core.qualifier.named
import org.koin.ktor.ext.get
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureContentNegotiation()
    configureKoin()
    configureRoutes(repository = get(qualifier = named(Qualifier.IN_MEMORY)))
}

internal fun Application.configureContentNegotiation() {
    install(ContentNegotiation) {
        json()
    }
}

internal fun Application.configureKoin() {
    install(Koin) {
        modules(commonModule)
    }
}
