package twentyFour

// Конкретная реализация абстрактной фабрики
internal class ConcreteChairFactory : ChairFactory() {
    override fun createVictorianChair(age: Int): Chair {
        return VictorianChair(age)
    }

    override fun createMultiFunctionalChair(): Chair {
        return MultiFunctionalChair()
    }

    override fun createMagicChair(): Chair {
        return MagicChair()
    }
}