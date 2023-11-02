package thirteen

class Person(private val firstName: String?, private val lastName: String?, private val middleName: String?) {
    fun getFullName(): String {
        val fullNameBuilder = StringBuilder()

        // Добавляем фамилию
        fullNameBuilder.append(lastName ?: "")

        // Добавляем инициалы имени и отчества
        if (firstName != null) {
            fullNameBuilder.append(" ${firstName.firstOrNull()?.toUpperCase()}.")
        }
        if (middleName != null) {
            fullNameBuilder.append(" ${middleName.firstOrNull()?.toUpperCase()}.")
        }

        return fullNameBuilder.toString()
    }
}

fun main() {

    // Создаем объекты Person с разными значениями имени, фамилии и отчества
    val person1 = Person("Иван", "Иванов", "Иванович")
    val person2 = Person(null, "Петров", "Петрович")
    val person3 = Person("Сидор", "Сидоров", null)

    // Выводим результаты тестов
    println(person1.getFullName()) // ожидаемый результат: "Иванов И.И."
    println(person2.getFullName()) // ожидаемый результат: "Петров П.П."
    println(person3.getFullName()) // ожидаемый результат: "Сидоров С."

}
