package sixteen

import javax.swing.*
import java.awt.*

fun main() {
    // Создание окна
    val frame = JFrame("Проверка пароля")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(300, 150)

    // Создание компонентов
    val serviceLabel = JLabel("Service:")
    val usernameLabel = JLabel("Username:")
    val passwordLabel = JLabel("Password:")
    val serviceField = JTextField(15)
    val usernameField = JTextField(15)
    val passwordField = JPasswordField(15)
    val checkButton = JButton("Проверить")

    // Установка встроенных значений для сервиса, имени пользователя и пароля
    serviceField.text = "admin"
    usernameField.text = "admin"
    passwordField.text = "admin"

    // Создание панелей для компоновки
    val panel = JPanel()
    panel.layout = GridLayout(4, 2)
    val buttonPanel = JPanel()
    buttonPanel.layout = FlowLayout()

    // Добавление компонентов на панели
    panel.add(serviceLabel)
    panel.add(serviceField)
    panel.add(usernameLabel)
    panel.add(usernameField)
    panel.add(passwordLabel)
    panel.add(passwordField)
    buttonPanel.add(checkButton)

    // Добавление панелей в окно
    frame.contentPane.add(panel, BorderLayout.CENTER)
    frame.contentPane.add(buttonPanel, BorderLayout.SOUTH)

    // Добавление обработчика события для кнопки
    checkButton.addActionListener {
        val service = serviceField.text
        val username = usernameField.text
        val password = String(passwordField.password)

        // Проверка пароля и вывод сообщения
        if (service == "admin" && username == "admin" && password == "admin") {
            JOptionPane.showMessageDialog(frame, "Пароль верный!")
        } else {
            JOptionPane.showMessageDialog(frame, "Пароль неверный!")
        }
    }

    // Отображение окна
    frame.isVisible = true
}