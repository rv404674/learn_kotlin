class Person(_firstName: String, _lastName: String){
    val firstName:String = _firstName
    val lastName:String = _lastName

    // Method2 of declaration
//    init {
//
//    }
    init {
        println("init1 called")
    }

    constructor(): this("Rahul", "Verma"){
        println("constructor 2 called")
    }

    init {
        println("init2 called")
    }

}

class PersonNew(val firstName:String = "Sachin", val lastName: String = "Verma"){

    // NOTE: init blocks will always be running before the secondary constructor.
    init {
        println("init1")
    }

    // thiis is how you can use a constrguctor
//    constructor(): this("Sachin", "Verma"){
//        println("constructor of PersonNew called")
//    }

    init{
        println("init2")
    }

}

fun main(){
    // Class code ie being called from here
    // NOTE: We dont need to use new in Kotlin
    val person = Person(_firstName = "Rahul", _lastName = "Verma")
    // property reference syntax
    println(person.firstName)
    println(person.lastName)

    val person2 = PersonNew("Rahul", "Verma")
    val person3 = PersonNew()

    // init1, init2, constructor
}