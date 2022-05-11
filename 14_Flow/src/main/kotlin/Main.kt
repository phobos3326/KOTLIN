import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun main() = coroutineScope {
    //  val gamer: Gamer? = null

    val listOfGamers = mutableListOf<Gamer>()
    for (i in 1..2) {
        //println("gamer $i")
        //val start = System.currentTimeMillis()
        var gamer = Gamer()
        gamer.gamerCount += i
        gamer.takeCard(2)
        gamer.info()
        println("__________")

        listOfGamers.add(gamer)



        listOfGamers.forEach {

            val job = launch {
                it.checkCard(load())
                if (gamer.count == 5) {
                    //awaitAll()
                    // gamer.mainScope.cancel()

                    coroutineContext.job.cancel()
                    cancel()

                }
                gamer.info()
            }
            job.join()
            gamer.info()
        }

    }

    //val a = load()


    println()


}


fun load(): Flow<Int> {
    val ff = flow {
        while (true) {
            val rnds = (1..90).random()
            emit(rnds)
        }

    }.flowOn(Dispatchers.Default)
    return ff

}