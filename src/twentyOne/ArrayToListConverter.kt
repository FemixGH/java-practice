package twentyOne

import java.util.*

object ArrayToListConverter {
    fun convertStringArrayToList(array: Array<String>): List<String> {
        val list: MutableList<String> = ArrayList()
        list.addAll(Arrays.asList(*array))
        return list
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val stringArray = arrayOf("Apple", "Banana", "Cherry", "Date")
        val stringList = convertStringArrayToList(stringArray)
        println("Array converted to list:")
        for (item in stringList) {
            println(item)
        }
    }
}
