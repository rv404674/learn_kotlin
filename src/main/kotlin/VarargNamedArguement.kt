fun greetUsingVararg(greeting:String, vararg itemsToGreet:String){
    // NOTE: vararg is basically variable number of string arguement
    // Array<String>
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

fun main() {
    val names = arrayOf("Rahul", "Sachin", "Chotu")
    // in greetUsingVararg function, we will iterate over (ruby, oreo)
    greetUsingVararg("hello", "ruby", "oreo")

    // NOTE: Can we directly pass names, as names is an array, and vararg behaves similary to Array<String>
    // No we can't
    // greet("good morning", names)

    // NOTE: Use spread operator - *
    greetUsingVararg("good morning", *names)
}