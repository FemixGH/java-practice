package twenty

import java.util.function.BinaryOperator

class Matrix<T>(val rows: Int, val cols: Int) {
    private val data: Array<Array<T>>

    init {
        data = Array(rows) { arrayOfNulls<Any>(cols) } as Array<Array<T>>
    }

    operator fun get(row: Int, col: Int): T {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw IndexOutOfBoundsException("Invalid row or column index")
        }
        return data[row][col]
    }

    operator fun set(row: Int, col: Int, value: T) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw IndexOutOfBoundsException("Invalid row or column index")
        }
        data[row][col] = value
    }

    fun operate(other: Matrix<T>, operator: BinaryOperator<T>): Matrix<T> {
        require(!(rows != other.rows || cols != other.cols)) { "Matrix dimensions must match for operation" }
        val result = Matrix<T>(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i, j] = operator.apply(this[i, j], other[i, j])
            }
        }
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            sb.append(data[i].contentToString())
            sb.append("\n")
        }
        return sb.toString()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val matrix1 = Matrix<Int>(2, 3)
            val matrix2 = Matrix<Int>(2, 3)

            // Fill the matrices with values
            for (i in 0..1) {
                for (j in 0..2) {
                    matrix1[i, j] = i * 3 + j
                    matrix2[i, j] = i * 2 + j
                }
            }
            println("Matrix 1:")
            println(matrix1)
            println("Matrix 2:")
            println(matrix2)
            val sum = matrix1.operate(matrix2) { a: Int, b: Int -> Integer.sum(a, b) }
            println("Sum of matrices:")
            println(sum)
            val difference = matrix1.operate(matrix2) { a: Int, b: Int -> a - b }
            println("Difference of matrices:")
            println(difference)
        }
    }
}