import java.lang.IllegalArgumentException

var greeting: String = "Good Morning"

// NOTE: by default in kotlin all types are non null. To put a null, you need to put a ?
// var curse_word: String? = null
var firstName: String? = "Rahul"

fun failWithWrongAge(age: Int?): Nothing{
    throw IllegalArgumentException("Wrong: Age $age")
}

fun checkAge(age: Int?){
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats| {$age}")
}

fun main(){
    println("hello kotlin")

    /**
     * val - read only/immutable
     * var - mutable
     */
    val name2: String = "Rahul Verma"
    println(greeting)
    println(name2)
    println(firstName)

    // NOTE: kotlin can infer a variable type as well.
    val shortcutName = "Shortcut Declaration"
    println(shortcutName)

    println("*** NOTHING TYPE***")
    checkAge(null)
    println("CHECKING SOMETHING")

}

