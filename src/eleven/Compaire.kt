package eleven

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Compaire{


    fun inputDate(): LocalDate? {
        print("Введите дату в формате (yyyy-MM-dd): ")
        val input = readLine()
        return try {
            LocalDate.parse(input)
        } catch (e: Exception) {
            null
        }
    }

    fun compareDateWithCurrentTime(userDate: LocalDate) {
        val currentDate = LocalDate.now()

        if (userDate.isEqual(currentDate)) {
            println("Введенная дата совпадает с текущей датой.")
        } else if (userDate.isBefore(currentDate)) {
            println("Введенная дата раньше текущей даты.")
        } else {
            println("Введенная дата позже текущей даты.")
        }
    }
}

fun main() {
    val currentTime = Compaire()
    val userDate = currentTime.inputDate()



    userDate?.let {
        currentTime.compareDateWithCurrentTime(userDate)
    } ?: println("Введена некорректная дата.")

}