package thirteen

class processString {
    fun processString0(input: String) {
        // your code here
    }

}
fun processString1(input: String) {
    val lastChar = input.get(input.length - 1)
    println("Последний символ строки: $lastChar")
}

fun processString2(input: String) {
    val endsWithExclamation = input.endsWith("!!!")
    println("Строка заканчивается на !!!: $endsWithExclamation")
}

fun processString3(input: String) {
    val startsWithILike = input.startsWith("I like")
    println("Строка начинается с I like: $startsWithILike")
}
fun processString4(input: String) {
    val containsJava = input.contains("Java")
    println("Строка содержит Java: $containsJava")
}
fun processString5(input: String) {
    val javaPosition = input.indexOf("Java")
    println("Позиция подстроки Java: $javaPosition")
}
fun processString6(input: String) {
    val replacedString = input.replace("а", "о")
    println("Строка с заменой символов: $replacedString")
}
fun processString7(input: String) {
    val uppercaseString = input.toUpperCase()
    println("Строка в верхнем регистре: $uppercaseString")
}
fun processStrin8(input: String) {
    val lowercaseString = input.toLowerCase()
    println("Строка в нижнем регистре: $lowercaseString")
}
fun processString9(input: String) {
    val javaSubstring = input.substring(input.indexOf("Java"), input.indexOf("Java") + "Java".length)
    println("Вырезанная подстрока: $javaSubstring")
}