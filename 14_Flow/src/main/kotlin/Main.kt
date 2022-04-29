import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun main() = coroutineScope {


    /*  val gamer1 = Gamer().createGamer()
      gamer1.takeCard(2)
      gamer1.info()

      gamer1.checkCard()

      gamer1.info()
  */
   // val listOfJob = mutableListOf<Gamer>()
    for (i in 1..2) {
        println("gamer $i")
        //val start = System.currentTimeMillis()
        val gamer = Gamer()
        gamer.takeCard(2)
        gamer.info()
        println("__________")

      //  listOfJob.add(gamer)

    }

    //  var a =   load()
    load().collect { value -> println(value) }


    //listOfJob.forEach { it.checkCard(a) }

}

/*fun checkNumber(gamer: Gamer): Gamer {
    gamer.listOfLottoCard.forEach {
        it.listOfRowInCard.forEach {
            it.cell.isChecked
        }
    }

    return gamer
}*/

fun load(): Flow<Int> = flow {
    for (i in 0..2) {
        delay(100)
        emit(i)
    }
}