package eleven

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val inputScanner = Scanner(System.`in`)

    // Ввод даты
    println("Введите год:")
    val year = inputScanner.nextInt()

    println("Введите месяц:")
    val month = inputScanner.nextInt()

    println("Введите число:")
    val day = inputScanner.nextInt()

    // Ввод времени
    println("Введите часы:")
    val hours = inputScanner.nextInt()

    println("Введите минуты:")
    val minutes = inputScanner.nextInt()

    // Формирование объекта Date
    val dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm")
    val dateString = "$year/$month/$day $hours:$minutes"
    val date = dateFormat.parse(dateString)

    // Формирование объекта Calendar
    val calendar = Calendar.getInstance()
    calendar.time = date

    // Вывод результатов
    println("Объект Date: $date")
    println("Объект Calendar: $calendar")
}