package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    // Executes in Main thread

    println("Main Program starts: ${Thread.currentThread().name}")

    // NOTE: by default The application wont wait for the couroutine to complete.
    // start coroutines on background thread. (worker thread)
    GlobalScope.launch { // Thread T1
        println("Fake work starts: ${Thread.currentThread().name}")

        // Coroutine is suspended, but the thread T1 is free.
        delay(2000) // Pretend some fake work, file upload maybe
        println("Fake work ended: ${Thread.currentThread().name}") // Either T1 or some other thread. Happens after
    // delay/suspend functoin
    }

    // Creates a coroutine that block current main thread.
    // Same as thread.sleep()
    // Not the right way to wait for other coroutines.
    runBlocking {
        delay(4000)
    }
    println("Main Program ended: ${Thread.currentThread().name}")

}