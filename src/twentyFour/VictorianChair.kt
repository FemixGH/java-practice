package twentyFour

// Викторианский стул
internal class VictorianChair(private val age: Int) : Chair {
    override fun sit() {
        println("Sitting on a Victorian chair.")
    }
}