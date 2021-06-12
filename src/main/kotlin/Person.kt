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

// NOTE:
// by default classes, methods, properties everything is public.
// internal - public within the module/package
// private - is only available within the same file.
// protected - in that class or in the subclass.
class PersonNew(val firstName:String = "Sachin", val lastName: String = "Verma"){
    // NOTE:
    /**
     * properties in kotlin will get getters and setters generated for them automatically.
     * for val -> getters
     * for var -> getters + setters.
     */
     var address:String? = null
        set(value) {
            field = value
            println("the new address is $value")
        }
        get() {
            println("returned value is $field")
            return field
        }

    fun printInfo(){
        // val printAddress = if(address!=null) address else "Unknown Address"
        // NOTE: Elvis operator
        // it is basically saying if address is not null, return address, else return "Unknown Address"
        val printAddress = address ?: "Unknown Address"
        println("firstName:$firstName  lastName:$lastName  address:$printAddress")
    }


    // NOTE: init blocks will always be running before the secondary constructor.
    init {
        println("init1")
    }

    // this is how you can use a constructor
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
//    println(person.firstName)
//    println(person.lastName)

    val person2 = PersonNew()
    // person2.firstName = "Ruby"
    // sort of setter
//    person2.address = "london, Uk"
//    person2.address = "dublin, ireland"
//    println(person2.address)

    val person3 = PersonNew()
    person2.printInfo()

    // init1, init2, constructor
    // NOTE: you can set the value
    // i.e you cant do this
    // person2.firstName = "Ruby"
    // as firstName is a val


}