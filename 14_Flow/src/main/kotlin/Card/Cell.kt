package Card

class Cell {
    var isChecked = false

    var value: Any? = null



    fun createCell(): Cell {
        return Cell()
    }

    override fun toString(): String {
        /* if (isChecked) {
             value = "x"
         }*/
        return "$value".padStart(3).padEnd(3)
    }
}