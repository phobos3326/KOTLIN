import Card.LottoCard
import Card.Row
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.takeWhile
import kotlin.coroutines.coroutineContext

class Gamer {
    var gamerCount = 0

    //  val mainScope = CoroutineScope(Dispatchers.Default)
    var listOfLottoCard = mutableListOf<LottoCard>()
    var count = 0


    fun takeCard(numberOfCards: Int) {
        val start = System.currentTimeMillis()
        //  coroutineScope {

        //async(Dispatchers.Default) {
        for (i in 1..numberOfCards) {
            val lottoCard = LottoCard()
            lottoCard.createCard()
            listOfLottoCard.add(lottoCard)
        }

        println(
            "(on ${Thread.currentThread().name}) " +
                    "after ${(System.currentTimeMillis() - start) / 1000F}s"
        )
        // return@async Gamer()
        //  }
        //delay(2000)
        // }
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

        listOfLottoCard.forEach {
            println("gamer $gamerCount")
            it.viewCard()

            val start = System.currentTimeMillis()
            println(
                "(on ${Thread.currentThread().name}) " +
                        "after ${(System.currentTimeMillis() - start) / 1000F}s"
            )

        }
        println("_________")

    }

    suspend fun checkCard(flow: Flow<Int>) {

        val tempArray = mutableListOf<Int>()
        val start = System.currentTimeMillis()
        val scope = coroutineScope {
            //mainScope.launch {

            val ff = flow


            val job = async {

                ff.buffer()
                //ff.onEach { currentCoroutineContext().ensureActive() }
                //ff.cancellable().collect { flowValue ->
                ff.takeWhile { count == 5 }.collect { flowValue ->
                    // flow.takeWhile { count == 5 }
                    listOfLottoCard.forEach { lottoCard ->
                        lottoCard.listOfRowInCard.forEach {
                            val row = it.listOfCellInRow
                            count = row.count { cell -> (cell.cellValue == "<>") }
                            it.listOfCellInRow.forEach { cell ->

                                if (cell.cellValue == flowValue && !tempArray.contains(flowValue)) {

                                    tempArray.add(flowValue)
                                    println("flow value $flowValue")
                                    cell.cellValue = "<>"

                                    //  info()
                                    //flow.takeWhile { count == 5 }
                                    //joinAll()


                                } else if (count == 5) {
                                    info()
                                    // joinAll()
                                    cancel()

                                }

                            }
                        }

                        //delay(2)

                    }
                }
            }
            //job.await()

        }


        println(
            "(on ${Thread.currentThread().name}) " +
                    "after ${(System.currentTimeMillis() - start) / 1000F}s"

        )
        // return coroutineContext.job
    }

    fun destroy() {
        if (count == 5) {
            // mainScope

        }
    }


}


