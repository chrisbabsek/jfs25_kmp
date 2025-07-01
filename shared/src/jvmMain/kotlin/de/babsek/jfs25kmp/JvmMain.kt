package de.babsek.jfs25kmp

import de.babsek.jfs25kmp.server.jvmServerMain

fun main() {
    jvmServerMain()
    val greeter = Greeting()
    println("Hello from Main")
    println("The platform specific greeting is: ${greeter.greet()}")
}
