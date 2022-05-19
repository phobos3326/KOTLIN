package Card

class Row {
    var rowCheck = false
    var countCell = 0
    var listOfCellInRow = mutableListOf<Cell>()

    fun checkRow() {
        countCell = listOfCellInRow.count { cell -> (cell.cellValue == "<>") }
        if (countCell == 5) {
            rowCheck = true
        }
    }

}