import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.cancel

suspend fun main() = coroutineScope {
    val listOfJob = mutableListOf<Gamer>()
    for (i in 1..2) {

        val gamer = Gamer()
        gamer.gamerCount += i
        gamer.takeCard(2)
        gamer.info()
        println("__________")

        listOfJob.add(gamer)

    }

    launch(Dispatchers.Default) {
        Bag.getLottoFlow.collect {
            listOfJob.forEach { gamer ->
                gamer.checkCard(it)
                gamer.checkWin()
                if (gamer.winCard) {
                    cancel()
                }
            }
        }
        delay(100)
    }
    println()
}


