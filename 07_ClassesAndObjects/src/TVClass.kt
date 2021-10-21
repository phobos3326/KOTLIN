import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class TVClass(val brand: String, val diagonal: Int, val isOn: Boolean) {

    override fun toString() = """$brand, диагональ $diagonal", $isOn"""


    fun getVolumeUp(vol: Int): Int {
        //var volume = 0

        println("громкость $vol")
        val space = '\u0020'
        space.toInt()

        /*// var scanner = Scanner(System.`in`).nextInt()
        //var readLine = readLine().

        //var str = " "*/

        val reader = BufferedReader(InputStreamReader(System.`in`))

        while (true) {
            val id = reader.readLine()
            if (id == "\u0020") {

            }
        }

        /* if (reader.equals(space)) {
            vol+1
             println("${vol} kvnlkvn")
         }*/
      //  return vol
        println("$vol")
    }

    fun getVolumeDown(): Int {
        var volume = 0
        volume--
        return volume
    }

    companion object {
        const val VOLUME = 50
    }
}

