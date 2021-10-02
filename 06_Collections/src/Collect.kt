import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList


/*
fun main() {
    var input = readLine()?.toIntOrNull() ?: return
    var size = input.nextInt()


}
*/

/*
fun main() {
    val input = Scanner(System.`in`) // Объявляем Scanner
    println("Enter array length: ")
    val size = input.nextInt() // Читаем с клавиатуры размер массива и записываем в size
    val SubArray2: MutableList<String> = ArrayList() // Создаём массив int размером в size
    println("Insert array elements:")
    */
/*Пройдёмся по всему массиву, заполняя его*//*
for (i in 0 until size) {
        SubArray2.add(input.next()) // Заполняем массив элементами, введёнными с клавиатуры
    }
    print("Inserted array elements:")
    println(SubArray2)
}
*/


fun main() {


    val input = Scanner(System.`in`) // Объявляем Scanner
    println("Enter array length: ")


    val size = input.nextInt() // Читаем с клавиатуры размер массива и записываем в size
    val subArray2: MutableList<Int> = ArrayList() // Создаём массив int размером в size
    println("Insert array elements:")
    //Пройдёмся по всему массиву, заполняя его
    for (i in 0 until size) {
        subArray2.add(input.nextInt()) // Заполняем массив элементами, введёнными с клавиатуры
    }
    print("Inserted array elements:")
    println(subArray2)
}





fun main1() {
    do {
        println("Ведите размер списка")
        var n = readLine()?.toIntOrNull() ?: return

    } while (n <= 0)


    val reader = BufferedReader(InputStreamReader(System.`in`))
    val map: MutableMap<Any, Any> = HashMap()
    while (true) {
        val id = reader.readLine()
        if (id == "") break
        val name = reader.readLine()
        if (name == "") break
        map[name] = id
    }

    for ((k, v) in map) {
        println("Абонент: $k. Номер телефона: $v")
    }
}


fun inputMap() {


}