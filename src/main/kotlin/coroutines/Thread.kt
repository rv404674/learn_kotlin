package coroutines

import kotlin.concurrent.thread

fun main(){
    // Executes in Main thread

    println("Main Program starts: ${Thread.currentThread().name}")

    // start a background thread. (worker thread)
    // NOTE: Both of them are running in || and independent of each other.
    thread {
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(2000) // Pretend some fake work, file upload maybe
        println("Fake work ended: ${Thread.currentThread().name}")
    }

    println("Main Program ended: ${Thread.currentThread().name}")

    // NOTE: In case of threads, the application waits for all the threads to be completed.
}