package com.orcchg.services

import com.orcchg.di.commonModule
import io.ktor.server.application.*
import io.ktor.server.netty.*
import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureKoin()
}

internal fun Application.configureKoin() {
    install(Koin) {
        modules(commonModule)
    }
}
