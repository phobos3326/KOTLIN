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
                // return@async Gamer()
            }
            //delay(2000)
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


   suspend fun info() = runBlocking {

        listOfLottoCard.forEach {
            println("gamer $gamerCount")
            it.viewCard()

        }
       joinAll()
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
                ff.collect { flowValue ->
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

                                    //flow.takeWhile { count == 5 }
                                    //joinAll()


                                } else if (count == 5) {

                                   // joinAll()
                                    cancel()

                                }

                            }
                        }

                        //delay(2)

                    }

                }


                /*  listOfLottoCard.forEach { lottoCard ->
                      lottoCard.listOfRowInCard.forEach { row: Row ->
                          // var count: Int
                          val row = row.listOfCellInRow
                          var count = row.count { cell -> (cell.cellValue == "X") }
                          if (count == 5) {
                              cancel()
                          }
                      }
                  }*/


                /*     for (i in 0 until listOfLottoCard.size){
                         val card = listOfLottoCard[i].listOfRowInCard
                         var count =0
                         count = row.count { cell -> (cell.cellValue == "  ") }
                         if (count==5){

                         }
                     }
                     */

                return@async
            }



            /*launch {


                job.join()
//                job.await()
                info()
            }*/

        }


        println(
            "(on ${Thread.currentThread().name}) " +
                    "after ${(System.currentTimeMillis() - start) / 1000F}s"

        )
        // return coroutineContext.job
    }

    fun destroy() {
        if (count == 5) {


        }
    }


}


