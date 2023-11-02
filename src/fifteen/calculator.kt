package fifteen

import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class Calculator : ActionListener {
    private val frame: JFrame = JFrame("Калькулятор")
    private val textField: JTextField
    private val buttons: Array<JButton>

    private var firstNumber = 0.0
    private var operator = ""

    init {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 400)
        frame.layout = BorderLayout()

        textField = JTextField()
        frame.add(textField, BorderLayout.NORTH)

        val panel = JPanel()
        panel.layout = GridLayout(4, 4)

        buttons = arrayOf(
            JButton("7"),
            JButton("8"),
            JButton("9"),
            JButton("/"),
            JButton("4"),
            JButton("5"),
            JButton("6"),
            JButton("*"),
            JButton("1"),
            JButton("2"),
            JButton("3"),
            JButton("-"),
            JButton("0"),
            JButton("."),
            JButton("="),
            JButton("+")
        )

        for (button in buttons) {
            panel.add(button)
            button.addActionListener(this)
        }
        val font = Font("Arial", Font.BOLD, 20)
        textField.font = font

        for (button in buttons) {
            button.font = font
        }

        frame.add(panel, BorderLayout.CENTER)
        frame.isVisible = true
    }

    override fun actionPerformed(e: ActionEvent) {
        val button = e.source as JButton
        val buttonText = button.text

        when (buttonText) {
            "+", "-", "*", "/" -> {
                operator = buttonText
                firstNumber = textField.text.toDouble()
                textField.text = ""
            }
            "=" -> {
                val secondNumber = textField.text.toDouble()
                val result = when (operator) {
                    "+" -> firstNumber + secondNumber
                    "-" -> firstNumber - secondNumber
                    "*" -> firstNumber * secondNumber
                    "/" -> firstNumber / secondNumber
                    else -> 0.0
                }
                textField.text = result.toString()
            }
            else -> {
                textField.text = textField.text + buttonText
            }
        }
    }
}

fun main() {
    SwingUtilities.invokeLater { Calculator() }
}