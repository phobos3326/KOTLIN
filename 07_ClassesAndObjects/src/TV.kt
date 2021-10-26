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
        for (i in volume..VOLUME) {
            volume++
            println("$brand, ${chekTurnOn()}, тест громкости ${volume - 1}")
        }
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

    override fun toString() = """$brand, диагональ $diagonal",  ${chekTurnOn()} """

}

