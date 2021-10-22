class TVClass(val brand: String, val diagonal: Int, val isOn: Boolean) {

    override fun toString() = """$brand, диагональ $diagonal", $isOn"""

    fun getVolumeUp(vol: Int): Int {
        return vol + 1

    }


    /*fun getVolumeUp(vol: Int): Int {

        println("громкость $vol")
        val space = '\u0020'
        space.toInt()


        val reader = BufferedReader(InputStreamReader(System.`in`))
        val id = reader.readLine()
        while (id == "\u0020") {
            vol+1

        }

       return vol
        println("$vol")
    }*/

    fun getVolumeDown(vol:Int): Int {
        var volume = 0
        volume--
        return volume
    }

    companion object {
        const val VOLUME = 50
    }
}

