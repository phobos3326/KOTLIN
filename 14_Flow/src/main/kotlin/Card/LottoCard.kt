package Card

import kotlin.random.Random

class LottoCard {
    var listOfRowInCard = mutableListOf<Row>()
    private val tmpList = mutableListOf<Any>()


    fun createCard(): MutableList<Row> {
        repeat(3) {
            val row = Row()
            while (row.listOfCellInRow.size < 9) {
                val cell = Cell()
                when (row.listOfCellInRow.size) {
                    0 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(1, 10)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    1 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(11, 20)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    2 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(21, 30)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    3 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(31, 40)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    4 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(41, 50)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    5 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(51, 60)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    6 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(61, 70)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    7 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(71, 80)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                    8 -> while (cell.cellValue == null) {
                        val rnd = Random.nextInt(81, 90)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.cellValue = rnd
                        }
                    }
                }
                row.listOfCellInRow.add(cell)
            }
            listOfRowInCard.add(row)
        }

        for (i in 0 until listOfRowInCard.size) {
            val row = listOfRowInCard[i].listOfCellInRow
            var count = 0
            while (count < 4) {
                val rnd = Random.nextInt(0, 8)
                listOfRowInCard[i].listOfCellInRow[rnd].cellValue = "  "
                count = row.count { cell -> (cell.cellValue == "  ") }
            }
        }
        return listOfRowInCard
    }

    fun viewCard() {
        listOfRowInCard.forEach { println(it.listOfCellInRow.joinToString(separator = " |")) }
        println()
    }

    fun info() {
        listOfRowInCard.forEach { println("${it.listOfCellInRow}") }
    }

}