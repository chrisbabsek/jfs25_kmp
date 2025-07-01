package de.babsek.jfs25kmp.server

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.commonControllerConfiguration() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("numbers/{count}") {
            val count = call.parameters["count"]?.toInt() ?: 0
            val numbers = (1..count).toList()
            call.respond(numbers)
        }
    }
}
