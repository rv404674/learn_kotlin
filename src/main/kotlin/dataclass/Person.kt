package dataclass

// NOTE:
// Main use of data class is to store data. It doesn't have any behavior (methods) associated
// with it
// NOTE: Primary constructors needs atleast one param .
data class Person(val id:Int, val name:String) {
}

fun main(){
    var p1 = Person(1, "Rahul")
    var p2 = Person(1, "Rahul")

    println(p1)
    println(p2)
    println(p1.hashCode())
    // NOTE:
    // p1==p2 will give false, if it was a normal class
    // in case of normal class, p1==p2 will compare the the addresses (where the objects are stored)
    // not the actual data.
    println(p1==p2)

    // NOTE: component n function
    val (id, name) = p1
    println(id)
    println(name)

    try {
        5/0
    } catch(e: Exception){
        println(e.toString())
    } finally {
        // NOTE: Finally will execute in case of both success and failure.
        println("FINALLY WILL ALWAYS EXECUTE")
    }
}