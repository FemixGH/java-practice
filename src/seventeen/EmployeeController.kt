package seventeen

class EmployeeController(private val model: Employee, private val view: EmployeeView) {
    val employeeName: String
        get() = model.name
    var employeeSalary: Double
        get() = model.salary
        set(salary) {
            model.salary = salary
        }

    fun updateView() {
        view.printEmployeeDetails(model.name, model.salary)
    }
}
