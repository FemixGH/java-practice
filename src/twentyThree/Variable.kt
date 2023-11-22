package twentyThree

class Variable(private val name: String) : Expression() {
    override fun evaluate(x: Double): Double {
        return x
    }
}
