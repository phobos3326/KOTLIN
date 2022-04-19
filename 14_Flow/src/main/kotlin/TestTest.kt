import kotlin.random.Random

fun main() {
    val aa = LotoCard().createCard()
    aa.forEach { println("${it.listOfCellInRow}") }
}

class LotoCard {
    var listOfLotoCard = mutableListOf<Row>()
    val tmpList = mutableListOf<Any>()


    fun createCard(): MutableList<Row> {
        repeat(3) {
            val row = Row()
            while (row.listOfCellInRow.size < 9) {
                val cell = Cell()
                val rnd1 = Random.nextInt(1, 10)
                val rnd2 = Random.nextInt(11, 20)
                val rnd3 = Random.nextInt(21, 30)
                val rnd4 = Random.nextInt(31, 40)
                val rnd5 = Random.nextInt(41, 50)
                val rnd6 = Random.nextInt(51, 60)
                val rnd7 = Random.nextInt(61, 70)
                val rnd8 = Random.nextInt(71, 80)
                val rnd9 = Random.nextInt(81, 90)

                when (row.listOfCellInRow.size) {
                    0 -> while (cell.value==null) {
                        val rnd1 = Random.nextInt(1, 10)
                        if (!tmpList.contains(rnd1)) {
                            tmpList.add(rnd1)
                            cell.value=rnd1
                        }
                    }
                    /*0 -> if (!tmpList.contains(rnd1)) {
                        tmpList.add(rnd1)
                        cell.value = rnd1
                    }*/

                    1 -> while (cell.value==null) {
                        val rnd2 = Random.nextInt(11, 20)
                        if (!tmpList.contains(rnd2)) {
                            tmpList.add(rnd2)
                            cell.value=rnd2
                        }
                    }
                    2 ->while (cell.value==null) {
                        val rnd3 = Random.nextInt(21, 30)
                        if (!tmpList.contains(rnd3)) {
                            tmpList.add(rnd3)
                            cell.value=rnd3
                        }
                    }
                    3 -> while (cell.value==null) {
                        val rnd4 = Random.nextInt(31, 40)
                        if (!tmpList.contains(rnd4)) {
                            tmpList.add(rnd4)
                            cell.value=rnd4
                        }
                    }
                    4 -> while (cell.value==null) {
                        val rnd5 = Random.nextInt(41, 50)
                        if (!tmpList.contains(rnd5)) {
                            tmpList.add(rnd5)
                            cell.value=rnd5
                        }
                    }
                    5 -> while (cell.value==null) {
                        val rnd6 = Random.nextInt(51, 60)
                        if (!tmpList.contains(rnd6)) {
                            tmpList.add(rnd6)
                            cell.value=rnd6
                        }
                    }
                    6 -> while (cell.value==null) {
                        val rnd7 = Random.nextInt(61, 70)
                        if (!tmpList.contains(rnd7)) {
                            tmpList.add(rnd7)
                            cell.value=rnd7
                        }
                    }
                    7 -> while (cell.value==null) {
                        val rnd8 = Random.nextInt(71, 80)
                        if (!tmpList.contains(rnd8)) {
                            tmpList.add(rnd8)
                            cell.value=rnd8
                        }
                    }
                    8 -> while (cell.value==null) {
                        val rnd9 = Random.nextInt(81, 90)
                        if (!tmpList.contains(rnd9)) {
                            tmpList.add(rnd9)
                            cell.value=rnd9
                        }
                    }
                }


                row.listOfCellInRow.add(cell)


            }
            listOfLotoCard.add(row)
            //listOfLotoCard.forEachIndexed { index, row -> row.cell.value}
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
    var value: Int? = null
    var state: Any? = null

    fun createCell(): Cell {
        return Cell()
    }

    override fun toString(): String {
        return "$value"
    }
}
