package properties

class Student{
    var name: String? = "Rahul Verma"
    var rollNumber: Int? = 50
    // NOTE: you need to initialize a lateinit var before using else, you wil get an error.
    lateinit var address: String
    var doesNameStartWithRahul: Boolean = false
        get() {
            return this.name?.contains("Rahul") == true
        }
        set(value){
            field = value
            println("property initialized")
        }

}

fun main(){
    var student = Student()
    // Accessing the properties here.
    println("${student.name} ${student.rollNumber}")
    println("${student.doesNameStartWithRahul}")
    student.doesNameStartWithRahul = false

}