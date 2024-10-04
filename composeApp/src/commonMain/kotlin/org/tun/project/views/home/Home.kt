package org.tun.project.views.home

import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import io.ktor.client.HttpClient
import kotlinx.coroutines.launch

@Composable
fun Home(httpClient: HttpClient) {
  // scope für Coroutines -> async
  val scope = rememberCoroutineScope()
  var isLoading = false
  var username by remember {
    mutableStateOf("")
  }

  // tun: why no code highlighting? -> static calls are not highlighted in this theme
  // evtl. theme custom chanes hier? ich mags nicht so, wenn gar nix highlighted ist
  TextField(
    value = username,
    onValueChange = { u: String -> username = u },
  )
  Button(onClick = {
    scope.launch {
      isLoading = true
      // bug: app schließt hier -> return isn arr, vllt deswegen...
      username = HomeService.handleButtonClick(httpClient).username
    }
  }) {
    if (isLoading) {
      CircularProgressIndicator()
    } else {
      Text("Click for username!")
    }
  }
}
