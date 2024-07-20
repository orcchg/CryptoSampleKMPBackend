package com.orcchg.services

import com.orcchg.domain.CryptoRepository
import com.orcchg.util.logger.Logger
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

internal fun Application.configureRoutes(repository: CryptoRepository) {
    routing {
        get("/coins") {
            runCatching {
                val params = call.request.queryParameters
                Logger.d(message = "--> request [/coins]: $params")
                repository.coins(
                    limit = params["limit"]?.toInt() ?: 0,
                    offset = params["offset"]?.toInt() ?: 0,
                )
            }
                .onSuccess {
                    Logger.d(message = "<-- 200 response success [/coins]: $it")
                    call.respond(HttpStatusCode.OK, it)
                }
                .onFailure {
                    Logger.d(message = "<-- 400 response error [/coins]: $it")
                    call.respond(
                        status = HttpStatusCode.BadRequest,
                        message = "${it.message}"
                    )
                }
        }
    }
}
