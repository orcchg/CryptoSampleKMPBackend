package com.orcchg.services

import com.orcchg.domain.CryptoRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

internal fun Application.configureRoutes(repository: CryptoRepository) {
    routing {
        get("/coins") {
            runCatching {
                val params = call.request.queryParameters
                repository.coins(
                    limit = params["limit"]?.toInt() ?: 0,
                    offset = params["offset"]?.toInt() ?: 0,
                )
            }
                .onSuccess {
                    call.respond(HttpStatusCode.OK, it)
                }
                .onFailure {
                    call.respond(
                        status = HttpStatusCode.BadRequest,
                        message = "${it.message}"
                    )
                }
        }
    }
}
