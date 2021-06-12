// NOTE: By default classes, variables of classes in kotlin are final. So they cant be extended/modified.
// You need to make them open.
// inheritance
// FancyInfoProvider extends BasicInfoProvider

// NOTE: kotlin has this ideology of immutable vs mutable class. i.e you need to explicitly define which variables,
//  classes are open i.e they can be modified or extended.
class FancyInfoProvider:BasicInfoProvider() {
    override val sessionIdPrefix: String
        get() = "Fancy Session Id"

    override val providerInfo: String
        get() = "Fancy Info  Provider"

    override fun printInfo(personNew: PersonNew) {
        super.printInfo(personNew)
        println("fancy info")
    }

}