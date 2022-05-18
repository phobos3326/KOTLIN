import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.cancel

suspend fun main() {

    coroutineScope {
        val listOfJob = mutableListOf<Gamer>()
        for (i in 1..2) {
            //println("gamer $i")
            //val start = System.currentTimeMillis()
            val gamer = Gamer()
            gamer.gamerCount += i
            gamer.takeCard(2)
            gamer.info()
            println("__________")

            listOfJob.add(gamer)

        }

        launch {
            Bag.getLottoFlow.collect {
                listOfJob.forEach { gamer ->
                    gamer.checkCard(it)

                    if (gamer.count == 5) {
                        cancel()
                    }
                    gamer.info()
                }

            }

        }

    }


}


