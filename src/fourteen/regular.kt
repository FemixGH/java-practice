package fourteen
fun isEmailValid(email: String): Boolean {
    val regex = Regex("""^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$""")
    return regex.matches(email)
}
fun main(){
    val regex = Regex("^abcdefghijklmnopqrstuv18340$")
    val input = "abcdefghijklmnopqrstuv18340"

    if (input.matches(regex)) {
        println("Строка является 'abcdefghijklmnopqrstuv18340'")
    } else {
        println("Строка не является 'abcdefghijklmnopqrstuv18340'")
    }

    val validEmails = arrayOf("user@example.com", "root@localhost")
    val invalidEmails = arrayOf("myhost@@@com.ru", "@my.ru", "Julia String")

    for (email in validEmails) {
        if (isEmailValid(email)) {
            println("$email is a valid email address")
        } else {
            println("$email is not a valid email address")
        }
    }

    for (email in invalidEmails) {
        if (isEmailValid(email)) {
            println("$email is a valid email address")
        } else {
            println("$email is not a valid email address")
        }
    }
}