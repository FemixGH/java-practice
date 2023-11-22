package twentyFour

// Многофункциональный стул
internal class MultiFunctionalChair : Chair {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    override fun sit() {
        println("Sitting on a multi-functional chair.")
    }
}
