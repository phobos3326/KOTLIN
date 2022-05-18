import Card.LottoCard
import Card.Row
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.takeWhile
import kotlin.coroutines.coroutineContext

class Gamer {

    var gamerCount = 0
    val mainScope = CoroutineScope(Dispatchers.Default)
    var listOfLottoCard = mutableListOf<LottoCard>()
    var count = 0


    suspend fun takeCard(numberOfCards: Int) {
        val start = System.currentTimeMillis()
        // coroutineScope {

        //  async(Dispatchers.Default) {
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
    }
    //delay(2000)
    //     }





    fun info() {
        // coroutineScope {
        // launch {
        listOfLottoCard.forEach {
            println("gamer $gamerCount")
            it.viewCard()

            //}

        }

        // }

        // joinAll()
    }

    suspend fun checkCard(flow: Flow<Int>) {

        val tempArray = mutableListOf<Int>()
        val start = System.currentTimeMillis()
        coroutineScope {
            launch {

                val ff = flow


                //  val job = async {

                ff.buffer()
                //ff.onEach { currentCoroutineContext().ensureActive() }
                ff.collect { flowValue ->
                    // flow.takeWhile { count == 5 }
                    listOfLottoCard.forEach { lottoCard ->
                        lottoCard.listOfRowInCard.forEach {
                            val row = it.listOfCellInRow
                            count = row.count { cell -> (cell.cellValue == "<>") }
                            it.listOfCellInRow.forEach { cell ->


                                if (cell.cellValue == flowValue) {

                                    // tempArray.add(flowValue)
                                    println("flow value $flowValue")
                                    cell.cellValue = "<>"

                                    //flow.takeWhile { count == 5 }
                                    //joinAll()

                                    info()
                                } else if (count == 5) {

                                     joinAll()
                                    cancel()

                                }

                            }
                        }

                        //delay(2)

                    }

                }


            }

            // if (count == 5) job.cancel()

            /*launch {


                job.join()
//                job.await()
                info()
            }*/
            //return@launch
        }

        /*  info()
          println(
              "(on ${Thread.currentThread().name}) " +
                      "after ${(System.currentTimeMillis() - start) / 1000F}s"*/

        //  )
        // return coroutineContext.job
        info()
    }

    fun destroy() {
        if (count == 5) {


        }
    }


}


