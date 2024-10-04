package org.tun.project.views.home

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType
import org.tun.project.model.User

object HomeService {
  suspend fun handleButtonClick(httpClient: HttpClient): User {
    val response = httpClient.get(urlString = "http://0.0.0.0:8080/user") {
      contentType(ContentType.Application.Json)
    }

    return response.body<User>()
  }
}