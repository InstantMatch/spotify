package com.instantmatch

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.instantmatch.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureSerialization()
        configureMonitoring()
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
