package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) = EngineMain.main(args)

fun Application.module() {
    configureDI(environment)
    configureContentNegotiation()
    configureRouting()
}
