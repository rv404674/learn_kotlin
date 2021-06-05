fun main(){
    val interestingThings = arrayOf("Rahul", "Verma", "Sachin", "Verma");
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    // Iterate over the array
    for(interestingThing in interestingThings){
        println(interestingThing)
    }

    // Lambda syntax
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    // we are getting both index and value here.
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at $index")
    }

     

}
