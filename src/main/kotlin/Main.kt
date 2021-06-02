var greeting: String = "GOod Morning"

// NOTE: by default in kotlin all types are non null. To put a null, you need to put a ?
// var curse_word: String? = null
var firstName: String? = "Rahul"

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
}

