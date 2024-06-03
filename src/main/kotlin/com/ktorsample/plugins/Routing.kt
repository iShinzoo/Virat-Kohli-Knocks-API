package com.ktorsample.plugins

import com.ktorsample.route.randomImage
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomImage()
        // Static plugin. Try to access `/static/index.html`
        static{
            resources("static")
        }
    }
}
