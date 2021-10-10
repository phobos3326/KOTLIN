import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val input = Scanner(System.`in`) // Объявляем Scanner
    println("Enter array length: ")
    val size = input.nextInt() // Читаем с клавиатуры размер массива и записываем в size



    //var myArray=data

    getPhones(size)
   // funMutableMap()
}




fun getPhones(size:Int): MutableList<String> {
   /* //val input = Scanner(System.`in`)
   // val input = readLine()*/

    val data: MutableList<String> = ArrayList() // Создаём массив int размером в size
    println("Ведите элементы массива:")
    /*for (i in 0 until size) {//Пройдёмся по всему массиву, заполняя его
        data.add(input.next()) // Заполняем массив элементами, введёнными с клавиатуры
    }*/

    repeat(size){
        data.add(readLine().toString())
    }
    print("Введите элементы массива:")
    println(data)

    val filterData = data.filter { it.startsWith("+7") }
    println("""Номера телефонов начинающиеся с "+7" $filterData""")

    val toSetData = data.toSet()
    println("Уникальные элементы массива $toSetData")

    val sumData = data.sumOf { it.length }
    println("Сумма длин всех номеров телефонов $sumData")

   // return filterData as MutableList<String>
    return data

}


fun getNames(listData: MutableList<String>) {



    println("Ведите номер телефона и имя абонента")

    val reader = readLine()
    var map: Map<String?, String?>
    val map: MutableMap<Any, Any> = HashMap()
    while (true) {
        val id = data
        //if (id == "") break
        val name = reader.toString()
        if (name == "") break
        map[name] = id
    }

    for(i in 0 .. listData.size){

         map = listData.associate {listData[i] to reader }
    }

    for ((k, v) in map) {
        println("Абонент: $k. Номер телефона: $v")
    }




    val sortByNumber = map.toList().sortedBy { (_, value)-> value as Comparable<Any> }.toMap()
    println(sortByNumber)

    val sortByName = map.toList().sortedBy { (value, _)-> value as Comparable<Any> }.toMap()
    println(sortByName)
}

