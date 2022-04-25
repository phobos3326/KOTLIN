import kotlin.random.Random

fun main() {
    val aa = LotoCard().createCard()
    aa.forEach { println("${it.listOfCellInRow}") }
    println()

    val bb = LotoCard().createCard()
    bb.forEach { println("${it.listOfCellInRow}") }

}

class LotoCard {
    var listOfLotoCard = mutableListOf<Row>()
    val tmpList = mutableListOf<Any>()


    fun createCard(): MutableList<Row> {
        repeat(3) {
            val row = Row()
            while (row.listOfCellInRow.size < 9) {
                val cell = Cell()
                when (row.listOfCellInRow.size) {
                    0 -> while (cell.value == null) {
                        val rnd = Random.nextInt(1, 10)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    1 -> while (cell.value == null) {
                        val rnd = Random.nextInt(11, 20)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    2 -> while (cell.value == null) {
                        val rnd = Random.nextInt(21, 30)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    3 -> while (cell.value == null) {
                        val rnd = Random.nextInt(31, 40)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    4 -> while (cell.value == null) {
                        val rnd = Random.nextInt(41, 50)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    5 -> while (cell.value == null) {
                        val rnd = Random.nextInt(51, 60)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    6 -> while (cell.value == null) {
                        val rnd = Random.nextInt(61, 70)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    7 -> while (cell.value == null) {
                        val rnd = Random.nextInt(71, 80)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                    8 -> while (cell.value == null) {
                        val rnd = Random.nextInt(81, 90)
                        if (!tmpList.contains(rnd)) {
                            tmpList.add(rnd)
                            cell.value = rnd
                        }
                    }
                }
                row.listOfCellInRow.add(cell)


            }
            listOfLotoCard.add(row)


        }

        for (i in 0 until listOfLotoCard.size) {
            val ss = listOfLotoCard[i].listOfCellInRow
            var count = 0
            while (count < 4) {
                val rnd = Random.nextInt(0, 8)
                listOfLotoCard[i].listOfCellInRow[rnd].value = "  "
                count = ss.count { s -> (s.value == "  ") }
            }

        }
        return listOfLotoCard
    }
}

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

class Cell {
    var value: Any? = null
    var isChecked = false

    fun createCell(): Cell {
        return Cell()
    }

    override fun toString(): String {
        if (isChecked) {
            value = "x"
        }
        return "$value"
    }
}
