class TVClass(val brand: String, val diagonal: Int, val isOn: Boolean) {

    override fun toString() = """$brand, диагональ $diagonal", $isOn"""

    fun getVolumeUp(vol:Int): Int {
        //var volUp = 1
        return vol + 1
    }

    fun getVolumeDown(volDown: Int): Int {
        return volDown - 1
    }

    companion object {
        const val VOLUME = 50
    }
}

