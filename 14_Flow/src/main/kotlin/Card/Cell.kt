package Card

class Cell {
    var isChecked = false

    var cellValue: Any? = null



    fun createCell(): Cell {
        return Cell()
    }

    override fun toString(): String {
         if (isChecked) {
             cellValue = "xxx"
         }
        return "$cellValue".padStart(3).padEnd(3)
    }
}