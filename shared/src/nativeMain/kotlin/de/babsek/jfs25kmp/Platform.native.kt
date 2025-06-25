package de.babsek.jfs25kmp

class NativePlatform : Platform {
    override val name: String = "Native Platform}"
}

actual fun getPlatform(): Platform = NativePlatform()
