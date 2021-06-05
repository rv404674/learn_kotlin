fun sayHello(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

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

    // List
    val places = listOf("Canberra", "Istanbul", "NewDelhi")
    sayHello("Hi", places)

    places.forEach { place ->
        println(place)
    }


    // NOTE:MAP
    val nameMap =  mapOf<Int, String>(1 to "Rahul Verma", 2 to "Sachin Verma", 3 to "Kamla Verma")
    nameMap.forEach { (key, value) ->
        println("$key to $value")
    }


    // NOTE: by default kotlin's collections are immutable. You can't add/subtract values.
    // places.add -> no such method
    val places2 = mutableListOf("Canberra", "germany")
    places2.add("zurich")

    val map = mutableMapOf(1 to 10, 2 to 100)
    map.put(5, 100)







}
