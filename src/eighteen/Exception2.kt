package eighteen

import java.util.*

class Exception2 {
    fun exceptionDemo() {
        val myScanner = Scanner(System.`in`)
        print("Enter an integer ")
        val intString = myScanner.next()
        try {
            val i = intString.toInt()
            println(2 / i)
        } catch (e: NumberFormatException) {
            println("NumberFormatException: " + e.message)
        } catch (e: ArithmeticException) {
            println("ArithmeticException: " + e.message)
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val demo = Exception2()
            demo.exceptionDemo()
        }
    }
}
