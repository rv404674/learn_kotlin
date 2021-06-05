fun greetUsingVararg(greeting:String, vararg itemsToGreet:String){
    // NOTE: vararg is basically variable number of string arguement
    // Array<String>
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

// Default Argument
fun greetUsingNamedArg(greeting:String = "Hello", name:String = "Rahul") = println("$greeting $name")

fun main() {
    val names = arrayOf("Rahul", "Sachin", "Chotu")
    // in greetUsingVararg function, we will iterate over (ruby, oreo)
    greetUsingVararg("hello", "ruby", "oreo")

    // NOTE: Can we directly pass names, as names is an array, and vararg behaves similary to Array<String>
    // No we can't
    // greet("good morning", names)

    // NOTE: Use spread operator - *
    greetUsingVararg("good morning", *names)
    greetUsingVararg(itemsToGreet = *names, greeting = "Hi")

    // NOTE: Named Argument
    // In code review it becomes difficult to know the order in which arguments are passed. IDE is making it easy
    // for us.
    greetUsingNamedArg("hello", "sachin")
    // Using named argument down, we can even change order in which arguments are passed.
    greetUsingNamedArg(name="sachin", greeting = "hello")

    // NOTE: Default argument
    greetUsingNamedArg(name="sachin")
    greetUsingNamedArg()
}