package eleven

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Time{
    fun getCurrentTime(): String? {
        return LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a"))
    }

    fun inputFIO(){
        print("Введите ваше ФИО: ")
        val FIO = readln()
        println(FIO)
    }
    fun printDateAfterOneWeek(): String {
        val formatter = DateTimeFormatter.ofPattern("MMM dd yyyy")

        val currentDate = LocalDate.now()
        val dateAfterOneWeek = currentDate.plusWeeks(1)

        val formattedDate = dateAfterOneWeek.format(formatter)

        return "Ну примерно, когда тебе надо закончить: $formattedDate"
    }


}
fun main(){

    val currentTime = Time()
    currentTime.inputFIO()
    println("Начало выполнения работы: " + currentTime.getCurrentTime())
    println(currentTime.printDateAfterOneWeek())

}