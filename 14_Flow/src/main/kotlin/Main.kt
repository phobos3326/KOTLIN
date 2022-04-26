import Card.LottoCard
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {


    val gamer1 = Gamer().createGamer()
    gamer1.takeCard(2)
    gamer1.info()

    gamer1.checkCard()

    gamer1.info()

    lead().collect { value -> println(value) }


}

/*fun checkNumber(gamer: Gamer): Gamer {
    gamer.listOfLottoCard.forEach {
        it.listOfRowInCard.forEach {
            it.cell.isChecked
        }
    }

    return gamer
}*/

fun lead(): Flow<Int> = flow {
    for (i in 0..2) {
        delay(100)
        emit(i)
    }
}