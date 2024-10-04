package org.tun.project

import androidx.compose.ui.window.ComposeUIViewController
import io.ktor.client.engine.darwin.Darwin
import org.tun.project.util.createHttpClient

fun MainViewController() = ComposeUIViewController {
  App(httpClient = createHttpClient(Darwin.create()))
}