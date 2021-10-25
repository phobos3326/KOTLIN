import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.random.Random

fun main() {
    val tvSony = TVClass(brand = "SONY", diagonal = 40, isOn = false)
    val tvSamsung = TVClass(brand = "Samsung", diagonal = 38, isOn = true)

    val map = mutableListOf(tvSony, tvSamsung)
    println(map.toString())
    map.forEachIndexed { index, element ->
        println("${index + 1} : $element")
    }
    val a = selectTv(map)

    var volValue = TVClass.VOLUME

    var randomVolume = (0..volValue).random()
    println(randomVolume)

    
    for (i in 0..randomVolume) {
        println(" $a громкость ++ ${a.getVolumeUp(i - 1)} ")
    }

    println("------------")

    for (i in randomVolume downTo 0) {
        println(" $a громкость -- ${a.getVolumeDown(i + 1)} ")
    }


    /*val reader = BufferedReader(InputStreamReader(System.`in`))
    val id = reader.readLine()*/


}

fun info(tv: TVClass) {
    println("${tv.brand}, ${tv.diagonal}, ${TVClass.VOLUME}, ${tv.isOn}")
}

fun selectTv(arrayTv: MutableList<TVClass>): TVClass {
    val input = Scanner(System.`in`)
    println("выберите телевизор из списка")
    val item = input.nextInt()

    val getItem = arrayTv[item - 1]
    println(getItem)
    return getItem

}