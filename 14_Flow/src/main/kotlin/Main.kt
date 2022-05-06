import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun main() = coroutineScope {


    val listOfJob = mutableListOf<Gamer>()
    for (i in 1..2) {
        //println("gamer $i")
        //val start = System.currentTimeMillis()
        val gamer = Gamer()
        gamer.gamerCount+=i
        gamer.takeCard(2)
        gamer.info()
        println("__________")

        listOfJob.add(gamer)

    }

    //val a = load()

        listOfJob.forEach {
            launch {
                it.checkCard(load()) }
            }

        println()


}



fun load(): Flow<Int> {
    val ff = flow {
        while (true){
            val rnds = (1 .. 90).random()
            emit(rnds)
        }

    }.flowOn(Dispatchers.Default)
    return ff

}