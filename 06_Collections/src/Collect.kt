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

fun main() {
    val input = Scanner(System.`in`) // Объявляем Scanner
    println("Enter array length: ")
    val size = input.nextInt() // Читаем с клавиатуры размер массива и записываем в size
    val data: MutableList<String> = ArrayList() // Создаём массив int размером в size
    println("Insert array elements:")
    for (i in 0 until size) {//Пройдёмся по всему массиву, заполняя его
        data.add(input.next()) // Заполняем массив элементами, введёнными с клавиатуры
    }
    print("Inserted array elements:")
    println(data)
}




fun main88() {
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

