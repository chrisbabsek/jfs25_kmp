package de.babsek.jfs25kmp.jfs25_kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "jfs25_kmp",
    ) {
        App()
    }
}
