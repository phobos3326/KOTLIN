package Card

class Cell {
    var cellValue: Any? = null

    override fun toString(): String {
        return "$cellValue".padStart(3).padEnd(3)
    }
}