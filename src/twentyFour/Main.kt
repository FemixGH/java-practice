package twentyFour

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val factory: ChairFactory = ConcreteChairFactory()
        val victorianChair = factory.createVictorianChair(50)
        val multiFunctionalChair = factory.createMultiFunctionalChair()
        val magicChair = factory.createMagicChair()
        val client = Client()
        client.sit(victorianChair)
        client.sit(multiFunctionalChair)
        client.sit(magicChair)

        // Пример использования функциональности многофункционального стула
        if (multiFunctionalChair is MultiFunctionalChair) {
            val result = multiFunctionalChair.sum(3, 5)
            println("Result of sum: $result")
        }

        // Пример использования функциональности магического стула
        if (magicChair is MagicChair) {
            magicChair.doMagic()
        }
    }
}