
fun main(){
    val name:String = "Rahul"
    var greeting: String?= null

    if (greeting != null){
        println(greeting)
    }else{
        println("Nothing")
    }

    greeting = "Good Morning"
    // NOTE: when is like switch.
    when(greeting){
        null -> println("No wish")
        else -> println(greeting)
    }

    // NOTE: we can assign if and when to a variable as well
    var greetingToPrint = if(greeting != null) greeting else "hi"
    var greetingToPrintUsingWhen = when(greeting){
        null -> "hi"
        else -> greeting
    }

    println(greetingToPrint)
    println(greetingToPrintUsingWhen)
}