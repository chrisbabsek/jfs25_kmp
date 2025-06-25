package de.babsek.jfs25kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
