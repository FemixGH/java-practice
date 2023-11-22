package twentyThree

class Const(private val value: Double) : Expression() {
    override fun evaluate(x: Double): Double {
        return value
    }
}
