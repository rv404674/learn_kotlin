// NOTE: Top level functions
fun getGreeting(): String {
    return "Good Morning"
}

// NOTE: kotlin uses this idea to reduce boiler plate code, to give the same functionnality.
// can be also written
// fun getName() = "Rahul Verma"
fun getName(): String = "Rahul Verma"

/**
 * if you don't want to return anything, don't mention anything as the return type.
 */
fun sayHello(){
    println("Say Hello")
}

// NOTE: if you want to template things
fun sayName(greeting:String, name:String): String{
    val newName = "$greeting $name"
    return newName
}

fun sayName2(name:String) = println("Hello SayName2 $name")

fun main(){
   println(getGreeting())
    sayHello()
    getName()
    println(sayName("Good Morning", "Sachin Verma"))

    sayName2("RAHUL VERMA")
}