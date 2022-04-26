package Card

import Card.Cell

class Row {
    var listOfCellInRow = mutableListOf<Cell>()

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