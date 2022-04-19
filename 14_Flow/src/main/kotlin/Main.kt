import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {


    val gamer1 = Gamer().createGamer()
    gamer1.createGamer()
    val gamer2 = Gamer()
    gamer2.createGamer()

    val a = gamer1.takeCard(2)
    val b = gamer2.takeCard(2)
gamer1.infoList()


    //gamer1.infoList()

    lead().collect { value -> println(value) }


}

fun checkNumber(gamer: MutableList<Array<Int>>): MutableList<Array<Int>> {
    gamer.forEach { it ->
        it.forEach {
            it + 100
        }
    }

    return gamer
}

fun lead(): Flow<Int> = flow {
    for (i in 0..2) {
        delay(100)
        emit(i)
    }
}