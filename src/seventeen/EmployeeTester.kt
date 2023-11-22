package seventeen

import java.util.*

object EmployeeTester {
    @JvmStatic
    fun main(args: Array<String>) {
        // Создаем объекты модели, представления и контроллера
        val model = Employee("Иван", 50000.0)
        val view = EmployeeView()
        val controller = EmployeeController(model, view)

        // Отображаем начальные данные сотрудника
        controller.updateView()

        // Изменяем заработную плату сотрудника и обновляем представление
        val sc = Scanner(System.`in`)
        println("Введите новую заработную плату сотрудника: ")
        controller.employeeSalary = sc.nextDouble()
        controller.updateView()
    }
}
