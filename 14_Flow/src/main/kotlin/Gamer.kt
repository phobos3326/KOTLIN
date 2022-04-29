import Card.LottoCard
import Card.Row
import kotlinx.coroutines.*
import java.util.concurrent.Flow
import kotlin.coroutines.coroutineContext

class Gamer {


    var listOfLottoCard = mutableListOf<LottoCard>()


    suspend fun takeCard(numberOfCards: Int) {
        val start = System.currentTimeMillis()
        coroutineScope {

            async(Dispatchers.Default) {
                for (i in 1..numberOfCards) {
                    val lottoCard = LottoCard()
                    lottoCard.createCard()
                    listOfLottoCard.add(lottoCard)
                }

                println(
                    "(on ${Thread.currentThread().name}) " +
                            "after ${(System.currentTimeMillis() - start) / 1000F}s"
                )
                return@async Gamer()
            }
            delay(2000)
        }
    }

 /*   suspend fun createGamer(): Gamer {
        return coroutineScope {
            val start = System.currentTimeMillis()
            println(
                "(on ${Thread.currentThread().name}) " +
                        "after ${(System.currentTimeMillis() - start) / 1000F}s"
            )
            return@coroutineScope Gamer()
        }

    }*/


    fun info() {
        listOfLottoCard.forEach { it.viewCard() }
    }

    fun checkCard(flow: Flow) {
        listOfLottoCard.forEach { lottoCard ->
            lottoCard.listOfRowInCard.forEach {
                it.listOfCellInRow.forEach {
                    if (it.value == 53) {
                        it.value = "X"
                    }

                }
            }
        }
    }

}


