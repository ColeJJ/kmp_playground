package org.tun.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.ktor.client.engine.okhttp.OkHttp
import org.tun.project.util.createHttpClient

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(httpClient = createHttpClient(OkHttp.create()))
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(httpClient = createHttpClient(OkHttp.create()))
}