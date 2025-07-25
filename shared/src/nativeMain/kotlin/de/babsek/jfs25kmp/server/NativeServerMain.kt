package de.babsek.jfs25kmp.server

import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun nativeServerMain() {
    embeddedServer(CIO, port = 8080) {
        commonServerConfig()
        commonControllerConfiguration()
    }
        .start(wait = true)
}
