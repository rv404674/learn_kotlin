package coroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking {

    println("Main program starts: ${Thread.currentThread().name}")

    // NOTE: use async when you want to do something with the result.
    val jobDeffered: Deferred<String> = async {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000)
        println("Fake work ended: ${Thread.currentThread().name}")
        "Rahul Verma"
    }

    // await() will wait for the coroutine to finish
    // await and join are suspending function.
    val name: String = jobDeffered.await()
    println(name)
}