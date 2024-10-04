package org.tun.project

import androidx.compose.runtime.*
import io.ktor.client.HttpClient
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.tun.project.views.home.Home

@Composable
@Preview
fun App(httpClient: HttpClient) {
    Home(httpClient)
}
