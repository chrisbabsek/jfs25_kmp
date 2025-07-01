package de.babsek.jfs25kmp.server

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

fun Application.commonServerConfig() {
    install(ContentNegotiation) {
        json()
    }
}
