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
    fun getSessionId(): String
}

// NOTE: BasicInfoProvider implements PersonInfoProvider
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
    protected open val sessionIdPrefix = "SessionId"

    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(personNew: PersonNew) {
        super.printInfo(personNew)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix

    }
}

fun main(){
    val basicInfoProvider = FancyInfoProvider()

    basicInfoProvider.printInfo(PersonNew())
    basicInfoProvider.getSessionId()

    checkTypes(basicInfoProvider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider is SessionInfoProvider){
        println("is a session info provider")
        // NOTE: here compiler is automatically figuring out that infoProvider is a type of sessionInfoProvider
        // (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    } else{
        println("is not a session info provider")
    }
}