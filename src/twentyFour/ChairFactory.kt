package twentyFour

// Абстрактная фабрика для стульев
internal abstract class ChairFactory {
    abstract fun createVictorianChair(age: Int): Chair
    abstract fun createMultiFunctionalChair(): Chair
    abstract fun createMagicChair(): Chair
}