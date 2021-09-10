package properties

// Proper use of getter and setter in kotlin
class Person(name: String, age:Int) {
    var name:String = name
    get(){
        return field.uppercase()
    }

    var age:Int = age
    set(value){
        if (value>0){
            field = value
        }else{
            println("Age is less than 0")
        }
    }

    // NOTE: By default kotlin creates a getter and setter for every variable.
    var email: String = ""
    get() = field
    set(value) {
        field = value
    }
}

fun main(){
    var p1:Person = Person("rahul verma", 21)
    println(p1.name)
    p1.age = -100
    p1.age = 200


}