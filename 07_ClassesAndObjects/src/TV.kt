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

    private var volume = 0


    fun changeVolume() {
        turnOn()
        val input = BufferedReader(InputStreamReader(System.`in`))
        println("""измените громкость в пределах от 0 до 50, закончить по команде "exit" """)

        var bufferVolume: String
        while (true) {
            bufferVolume = input.readLine()
            if (bufferVolume == "exit") break
            if (bufferVolume == "") continue
            val b = bufferVolume.toInt()
            if (b in 0..VOLUME) volume = b
            if (b !in 0..VOLUME) println("некорректный ввод")

            println("$brand, ${chekTurnOn()}, тест громкости $volume")
        }

    }


     private fun turnOn() {

        if (!isOn) {
            isOn = true
        }
    }

     fun turnOff() {
        if (isOn) {
            isOn = false
        }
    }

    fun selectChannel(selChannel: List<Channel>) {
        turnOn()
        val input = BufferedReader(InputStreamReader(System.`in`))
        println("""выберите канал, закончить по команде "exit" """)

        var bufferSelect: String
        while (true) {
            bufferSelect = input.readLine()
            if (bufferSelect == "exit") break
            if (bufferSelect == "") continue
            val b = bufferSelect.toInt()

            if (b !in 1..selChannel.size) println("некорректный ввод")
            if (b in 1..selChannel.size)
                println(selChannel[b - 1].name)

        }
    }

    fun getChannels(channels: List<Channel>): List<Channel> {
        val listChannelSize = Channel.Channels.getListChannel().size
        val size = (1 until listChannelSize).random()
        val channelList = mutableListOf<Channel>()
        for (i in 1..size) {
            channelList.add(channels[i - 1])
        }
        return channelList
    }

    companion object {
        const val VOLUME = 50
    }

        override fun toString() = """$brand, диагональ $diagonal",  ${chekTurnOn()} """

}