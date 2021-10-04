import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val input = Scanner(System.`in`) // Объявляем Scanner
    println("Enter array length: ")
    val size = input.nextInt() // Читаем с клавиатуры размер массива и записываем в size

    inputFun(size)
    funMutableMap()
}

fun inputFun(size: Int): MutableList<String> {
    val input = Scanner(System.`in`)
    val data: MutableList<String> = ArrayList() // Создаём массив int размером в size
    println("Insert array elements:")
    for (i in 0 until size) {//Пройдёмся по всему массиву, заполняя его
        data.add(input.next()) // Заполняем массив элементами, введёнными с клавиатуры
    }
    print("Inserted array elements:")
    println(data)

    val filterData = data.filter { it.contains("+7") }
    println("""Номера телефонов начинающиеся с "+7" $filterData""")

    val toSetData = data.toSet()
    println("Уникальные элементы массива $toSetData")

    val sumData = data.sumOf { it.length }
    println("Сумма длин всех номеров телефонов $sumData")

    return filterData as MutableList<String>

}


fun funMutableMap() {

    println("Ведите номер телефона и имя абонента")

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

