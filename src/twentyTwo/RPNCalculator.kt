package twentyTwo

import java.util.*

object RPNCalculator {
    fun calculateRPN(expression: String): Double {
        val tokens = expression.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray() //разделение операндов и операций и помещение их в массив
        val stack = Stack<Double>()
        for (token in tokens) {
            if (isNumber(token)) {
                stack.push(token.toDouble())
            } else if (isOperator(token)) {
                require(stack.size >= 2) { "Недопустимое выражение: недостаточно операндов для операции $token" }
                val operand2 = stack.pop()
                val operand1 = stack.pop()
                val result = performOperation(operand1, operand2, token)
                stack.push(result)
            } else {
                throw IllegalArgumentException("Недопустимое выражение: неизвестный токен $token")
            }
        }
        require(stack.size == 1) { "Недопустимое выражение: слишком много операндов" }
        return stack.pop()
    }

    private fun isNumber(token: String): Boolean {
        return try {
            token.toDouble()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

    private fun isOperator(token: String): Boolean {
        return token.matches("[+\\-*/]".toRegex())
    }

    private fun performOperation(operand1: Double, operand2: Double, operator: String): Double {
        return when (operator) {
            "+" -> operand1 + operand2
            "-" -> operand1 - operand2
            "*" -> operand1 * operand2
            "/" -> {
                if (operand2 == 0.0) {
                    throw ArithmeticException("Делить на 0 нельзя.")
                }
                operand1 / operand2
            }

            else -> throw IllegalArgumentException("Недопустимый оператор: $operator")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("Введите выражение в обратной Польской записи (каждое значение необходимо записывать через пробел): ")
        val rpnExpression = sc.nextLine()
        val result = calculateRPN(rpnExpression)
        println("RPN Expression: $rpnExpression")
        println("Result: $result")
    }
}
