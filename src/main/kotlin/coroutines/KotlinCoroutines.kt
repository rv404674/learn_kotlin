package coroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
    // Executes in Main thread

    runBlocking { // Created a coroutine that blocks the main thread.
        println("Main Program starts: ${Thread.currentThread().name}") //main thread.

        // Fake work starts: DefaultDispatcher-worker-1
        // NOTE: instead of this, you will get
        // Fake work starts: main
        // This is because launch{} launches a coroutine in the parent's scope. As the parent coroutine ->
        // runBlocking{} is running on main thread, i.e child coroutine (launch{}), also runs on the main thread.
        val job: Job = launch { // Thread T1
            println("Fake work starts: ${Thread.currentThread().name}")

            // Coroutine is suspended, but the thread T1 is free.
            delay(2000) // Pretend some fake work, file upload maybe
            println("Fake work ended: ${Thread.currentThread().name}") // Either T1 or some other thread. Happens after
            // delay/suspend functoin
        }

        //delay(4000) //main thread.
        // job.cancel()
        job.join() // will wait for coroutine job to finish.

        println("Main Program ended: ${Thread.currentThread().name}")
    }

}

// you can write your own suspend function as well
suspend fun waitTime(time: Long){
    delay(time)
}