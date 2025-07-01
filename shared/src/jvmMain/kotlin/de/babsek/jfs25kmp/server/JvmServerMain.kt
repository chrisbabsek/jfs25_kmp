package de.babsek.jfs25kmp.server

import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun jvmServerMain() {
    embeddedServer(Netty, port = 8080) {
        commonServerConfig()
        commonControllerConfiguration()
    }
        .start(wait = true)
}
