package de.babsek.jfs25.jfs25_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform