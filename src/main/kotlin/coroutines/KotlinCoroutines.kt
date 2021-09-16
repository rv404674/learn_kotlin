package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    // Executes in Main thread

    println("Main Program starts: ${Thread.currentThread().name}")

    // start a background thread. (worker thread)
    // NOTE: Both of them are running in || and independent of each other.
    // NOTE: The application wont wait for the couroutine to complete.
    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(2000) // Pretend some fake work, file upload maybe
        println("Fake work ended: ${Thread.currentThread().name}")
    }

    // Blocks the current thread and waits for the coroutine to finish.
    Thread.sleep(4000)
    println("Main Program ended: ${Thread.currentThread().name}")

}