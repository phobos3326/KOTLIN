class TV(val brand: String, val diagonal: Int, var isOn: Boolean) {


    override fun toString() = """$brand, диагональ $diagonal",  ${chekTurnOn()} """

    private fun chekTurnOn() {
        if (!isOn) {
            print("выкл")
        } else {
            print("вкл")
        }
    }

    fun getVolumeUp(vol: Int): Int {
        //var volUp = 1
        return vol + 1
    }

    fun getVolumeDown(volDown: Int): Int {
        return volDown - 1
    }

    companion object {
        const val VOLUME = 50
    }

    fun turnOn(): Boolean {
        if (!isOn) {
            //isOn = true
            println("выкл")
            isOn = true
        } else {
            //isOn=true
            println("вкл")
        }


        return true
    }


}

