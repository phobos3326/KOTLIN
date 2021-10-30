import java.io.BufferedReader
import java.io.InputStreamReader

class TV(val brand: String, val diagonal: Int, var isOn: Boolean) {

    private fun chekTurnOn(): String {
        val a: String = if (!isOn) {
            "выключен"
        } else {
            "включен"
        }
        return a
    }

    var volume = 0

    fun getVolumeUp() {
        turnOn()

        //val input = Scanner(System.`in`)
        val input = BufferedReader(InputStreamReader(System.`in`))
        println("измените громкость в пределах от 0 до 50")


        while (volume in 0..VOLUME) {
            volume = input.readLine().toInt()
            if (volume < 0) volume = 0
            if (volume == 100) break
            if (volume > VOLUME) volume = 50

            println("$brand, ${chekTurnOn()}, тест громкости $volume")

        }

        /*while (true) {
            volume = input.readLine().toInt()
            if (volume !in 0..VOLUME)  volume = 0
            if (volume in 0..VOLUME) continue
            if (volume.toString()=="") break
            println("$brand, ${chekTurnOn()}, тест громкости $volume")
        }*/
        /* do {
             volume = input.nextInt()
             println("$brand, ${chekTurnOn()}, тест громкости $volume")
         } while (volume in 0..VOLUME)
 */
        /*for (i in volume..VOLUME) {
            volume++
            println("$brand, ${chekTurnOn()}, тест громкости ${volume - 1}")
        }*/
    }

    fun getChannels(channels: MutableList<String>): MutableList<String> {

        val size = (0..4).random()
        val array: MutableList<String> = ArrayList()
        for (i in 0 until size-1) {
            array.add(channels.toString())
        }
       // array.addAll(channels)
        return array
        println(array)
    }

    fun getVolumeDown() {
        for (i in volume downTo 1) {
            volume--
            println("$brand, ${chekTurnOn()}, тест громкости $volume")
        }
    }

    private fun turnOn() {
        if (!isOn) {
            isOn = true
        }
    }

    companion object {
        const val VOLUME = 50
    }


    object Channels {
        private val listOfChannel = listOf("channel 1", "channel 2", "channel 3", "channel 4", "channel 5")

        fun channelSetting(): MutableList<String> {
            //shuffledChannels.forEachIndexed { index, s -> println("${index + 1}: $s") }

            return listOfChannel.shuffled().toMutableList()
        }
    }

    override fun toString() = """$brand, диагональ $diagonal",  ${chekTurnOn()} """

}

