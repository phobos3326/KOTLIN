import kotlin.random.Random

abstract class Card {

   open fun createCard(): Array<Array<Int>> {
        var card = arrayOf<Array<Int>>()
        for (i in 0..2) {
            var array = arrayOf<Int>()
            for (j in 0..8) {
                array += Random.nextInt(1, 90)
            }
            for (k in 0..array.size - 6) {
                array[k] = 0
            }
            array.shuffle()
            card += array
        }
        for (array in card) {
            println("____________________________________________")
            for (value in array) {
                print("$value |".padStart(4).padEnd(5))
            }
            println()
        }
        println("____________________________________________")

        return card
    }

}