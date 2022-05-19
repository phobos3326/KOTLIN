import Card.LottoCard
import kotlinx.coroutines.*


class Gamer {
    var winCard = false
    var gamerCount = 0
    var listOfLottoCard = mutableListOf<LottoCard>()


    fun takeCard(numberOfCards: Int) {
        val start = System.currentTimeMillis()

        for (i in 1..numberOfCards) {
            val lottoCard = LottoCard()
            lottoCard.createCard()
            listOfLottoCard.add(lottoCard)
        }

        println(
            "(on ${Thread.currentThread().name}) " +
                    "after ${(System.currentTimeMillis() - start) / 1000F}s"
        )
    }


    fun info() {
        listOfLottoCard.forEach {
            println("gamer $gamerCount")
            it.viewCard()
        }
    }


    suspend fun checkCard(flow: Int) {
        println("flow value $flow")
        println("________________")
        coroutineScope {
            launch {
                listOfLottoCard.forEach { lottoCard ->
                    lottoCard.listOfRowInCard.forEach {


                        it.listOfCellInRow.forEach { cell ->
                            if (cell.cellValue == flow) {
                                cell.cellValue = "<>"
                            }
                        }
                    }
                }
            }
        }
    }

    suspend fun checkWin() {
        coroutineScope {
            launch {
                listOfLottoCard.forEach {
                    it.listOfRowInCard.forEach { row ->
                        row.checkRow()
                        if (row.rowCheck) {
                            winCard = true
                            println("карта выиграла")
                            delay(100)
                            info()
                        }
                    }
                }
            }
        }
    }
}

