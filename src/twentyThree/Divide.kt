package twentyThree

class Divide(private val left: Expression, private val right: Expression) : Expression() {
    override fun evaluate(x: Double): Double {
        val denominator = right.evaluate(x)
        if (denominator == 0.0) {
            throw ArithmeticException("Division by zero")
        }
        return left.evaluate(x) / denominator
    }
}
