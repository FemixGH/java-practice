package twentyThree

class Add(private val left: Expression, private val right: Expression) : Expression() {
    override fun evaluate(x: Double): Double {
        return left.evaluate(x) + right.evaluate(x)
    }
}
