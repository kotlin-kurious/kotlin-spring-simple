package decoupled

class HelloWorldMessageProvider : MessageProvider {
    init {
        println(" --> HelloWorldMessageProvider: constructor called")
    }
    override val message: String
        get() = "Hello World!"
}