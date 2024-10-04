package org.tun.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.ktor.client.engine.okhttp.OkHttp
import org.tun.project.util.createHttpClient

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinMultiplattformPlayground",
    ) {
        App(httpClient = createHttpClient(OkHttp.create()))
    }
}