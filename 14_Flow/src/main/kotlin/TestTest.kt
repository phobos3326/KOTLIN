import kotlin.random.Random

fun main() {
    val aa = LotoCard().createCard()
    aa.forEach { println("${it.listOfCellInRow}") }
}

/*fun info(){

    for (i in 0 until row) {
        println("_________")
        for (j in 0 until column) {
            print(a[i][j])
            print("|".padStart(3).padEnd(2))
        }
        println()
    }
    println("____________________________________________")
}*/


fun takeCard(): MutableList<CardObject> {
    var listOfLotoCard = mutableListOf<CardObject>()

    for (i in 1..2) {
        var a = CardObject().createCard()
        listOfLotoCard.add(a)
    }
    return listOfLotoCard
}

class CardObject {
    val row = 3
    val column = 9
    var a = Array(row) { IntArray(column) }

    fun createCard(): CardObject {
        for (i in 0 until row) {
            for (j in 0 until column) {
                val data = Random.nextInt(1, 90)
                a[i][j] = data

                for (j in 0 until column - 5) {
                    val data2 = Random.nextInt(1, 9)
                    a[i][j] = 0
                }
            }
            //a.shuffle()
            //a += array

        }
        for (i in 0 until row) {
            println("_________")
            for (j in 0 until column) {
                print(a[i][j])
                print("|".padStart(3).padEnd(2))
            }
            println()
        }
        println("____________________________________________")
        return CardObject()
    }

    /*init {
        createCard()
    }*/

}

class LotoCard {
    var listOfLotoCard = mutableListOf<Row>()
    val tmpList = hashSetOf<Int>()


    fun createCard(): MutableList<Row> {
        repeat(3) {
            val row = Row()
            while (row.listOfCellInRow.size < 9) {
                val cell = Cell()
                val rnd = Random.nextInt(1, 90)
                if (!tmpList.contains(rnd)) {
                    tmpList.add(rnd)
                    cell.value = rnd
                    row.listOfCellInRow.add(cell)
                    row.listOfCellInRow.sortBy { cell -> cell.value }
                }
            }
            listOfLotoCard.add(row)
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
