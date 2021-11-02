import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val tvSony = TV(brand = "SONY", diagonal = 40, isOn = false)
    val tvSamsung = TV(brand = "Samsung", diagonal = 38, isOn = true)

    val listOfTV = mutableListOf(tvSony, tvSamsung)

    val selectedTV = selectTv(listOfTV)

    selectedTV.changeVolume()
    println("------------")

    val a = Channel.Channels.getListChannel()
    val b = selectedTV.getChannels(a)
    b.forEachIndexed { index, channel ->
        println("${index + 1}: ${channel.name}")
    }

    selectedTV.selectChannel(b)

    selectedTV.turnOff()
    println(selectedTV)
}

fun selectTv(arrayTv: MutableList<TV>): TV {

    arrayTv.forEachIndexed { index, element ->
        println("${index + 1} : $element")
    }

    val input = Scanner(System.`in`)
    println("выберите телевизор из списка")
    val item = input.nextInt()

    val getItem = arrayTv[item - 1]
    println(getItem)
    return getItem

}
