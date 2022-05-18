import kotlinx.coroutines.*

suspend fun main() = coroutineScope {


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

    //val a = load()

    /*listOfJob.forEach {
        launch {

            it.checkCard(Bag.getLottoFlow)
            it.info()
            if (it.count == 5)
                joinAll()
                cancel()

        }
    }
    println()
    listOfJob.forEach { gamer -> gamer.info() }*/

}


