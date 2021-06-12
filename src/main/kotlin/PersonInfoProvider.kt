interface PersonInfoProvider {
    // NOTE: In kotlin, you can provide default behavior to a interface methods.
    //
    val providerInfo: String
    fun printInfo(personNew:PersonNew){
        println(providerInfo)
        personNew.printInfo()
    }
}

interface SessionInfoProvider {
    fun sessionInfo(): String
}

// NOTE: BasicInfoProvider implements PersonInfoProvider
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(personNew: PersonNew) {
        super.printInfo(personNew)
        println("additional print statement")
    }

    override fun sessionInfo(): String {
        return "SessionId - 1234"

    }
}

fun main(){
    val basicInfoProvider = BasicInfoProvider()
    basicInfoProvider.printInfo(PersonNew())
    basicInfoProvider.sessionInfo()
}