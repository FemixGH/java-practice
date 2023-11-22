package twentyFour

// Клиент, использующий интерфейс стул
internal class Client {
    fun sit(chair: Chair?) {
        chair!!.sit()
    }
}