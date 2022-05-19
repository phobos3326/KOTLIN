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


    val cell = Cell().createCell()
    fun createRow(): MutableList<Cell> {
        val tmpList = hashSetOf<Int>()
        /*for (i in 1..9) {

            //val rnd = Random.nextInt(1, 90)
            *//* if (!tmpList.contains(rnd)) {
                 tmpList.add(rnd)
                 a.value = rnd*//*
            listOfCellInRow.add(cell)

        }*/
        return listOfCellInRow
    }
}