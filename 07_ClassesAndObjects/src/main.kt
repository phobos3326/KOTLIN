import java.util.*

fun main() {
    val tvSony = TVClass(brand = "SONY", diagonal = 40, isOn = false)
    val tvSamsung = TVClass(brand = "Samsung", diagonal = 38, isOn = true)

    val map = mutableListOf(tvSony, tvSamsung)
    println(map.toString())
    map.forEachIndexed { index, element ->
        println("${index + 1} : $element")
    }

    val a =selectTv(map).getVolumeUp(5)


   // val a = tvSony.getVolumeUp(5)
    println("громкость $a ")
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