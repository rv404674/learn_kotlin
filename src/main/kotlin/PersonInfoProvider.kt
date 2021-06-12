interface PersonInfoProvider {
    // NOTE: In kotlin, you can provide default behavior to a interface methods.
    //
    val providerInfo: String
    fun printInfo(personNew:PersonNew){
        println(providerInfo)
        personNew.printInfo()
    }
}

// NOTE: BasicInfoProvider implements PersonInfoProvider
class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(personNew: PersonNew) {
        super.printInfo(personNew)
        println("additional print statement")
    }
}

fun main(){
    val basicInfoProvider = BasicInfoProvider()
    basicInfoProvider.printInfo(PersonNew())
}