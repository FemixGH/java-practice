package twentyThree

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size != 1) {
            println("Usage: Main <x>")
            return
        }
        val x = args[0].toDouble()
        val expression: Expression = Substract(
            Substract(
                Multiply(Variable("x"), Variable("x")),
                Multiply(Const(2.0), Variable("x"))
            ),
            Const(1.0)
        )
        val result = expression.evaluate(x)
        println("Result: $result")
    }
}
