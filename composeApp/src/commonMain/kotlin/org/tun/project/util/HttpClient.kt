package org.tun.project.util

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json

fun createHttpClient(engine: HttpClientEngine): HttpClient {
  return HttpClient(engine) {
    install(Logging) {
      level = LogLevel.ALL
    }
    install(ContentNegotiation) {
      json()
    }
    // tun: install(auth)
  }
}