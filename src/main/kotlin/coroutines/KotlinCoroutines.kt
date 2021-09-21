package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    // Executes in Main thread

    runBlocking { // Created a coroutine that blocks the main thread.
        println("Main Program starts: ${Thread.currentThread().name}") //main thread.

        GlobalScope.launch { // Thread T1
            println("Fake work starts: ${Thread.currentThread().name}")

            // Coroutine is suspended, but the thread T1 is free.
            delay(2000) // Pretend some fake work, file upload maybe
            println("Fake work ended: ${Thread.currentThread().name}") // Either T1 or some other thread. Happens after
            // delay/suspend functoin
        }

        delay(4000) //main thread.

        println("Main Program ended: ${Thread.currentThread().name}")
    }

}

// you can write your own suspend function as well
suspend fun waitTime(time: Long){
    delay(time)
}