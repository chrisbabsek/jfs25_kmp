package de.babsek.jfs25kmp

class JSPlatform : Platform {
    override val name: String = "JS Platform"
}

actual fun getPlatform(): Platform = JSPlatform()
