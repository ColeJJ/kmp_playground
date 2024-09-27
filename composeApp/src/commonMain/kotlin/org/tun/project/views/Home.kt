package org.tun.project.views

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import kotlinmultiplattformplayground.composeapp.generated.resources.Res
import kotlinmultiplattformplayground.composeapp.generated.resources.hello_world
import org.jetbrains.compose.resources.stringResource

@Composable
fun Home() {
  // tun: why no code highlighting? -> static calls are not highlighted in this theme
  // evtl. theme custom chanes hier? ich mags nicht so, wenn gar nix highlighted ist
  Text(stringResource(Res.string.hello_world))
}