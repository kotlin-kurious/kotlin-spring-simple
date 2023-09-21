package decoupled

interface MessageRenderer {
    fun render()
    var messageProvider: MessageProvider?
}