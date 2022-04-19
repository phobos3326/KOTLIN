import kotlin.random.Random

class Gamer {
    // private val card = Card()
    private var listOfLotoCard = mutableListOf<LotoCard>()

    /*val lotoCard = object : Card() {
        override fun createCard(): Array<Array<Int>> {
            return super.createCard()
        }
    }*/
    /*fun takeCard(numberOfCards: Int): MutableList<Array<Int>> {
        for (i in 1..numberOfCards) {
            val a = card.createCard()
            listOfCards += a

        }
        // card.createCard()


        return listOfCards
    }*/


    fun takeCard(numberOfCards: Int) {
        //val listOfLotoCard = mutableListOf<LotoCard>()

        for (i in 1..numberOfCards) {
            val a = LotoCard
            listOfLotoCard.add(a)
        }

        //return listOfLotoCard
    }

    fun createGamer(): Gamer {
        println("игрок создан")
        return Gamer()
    }

    fun info() {
        for (i in 0 until listOfLotoCard.size) {
            println("____________________________________________")
            for (j in listOfLotoCard) {
                print("$j |".padStart(4).padEnd(5))
            }
            println()

        }
        println("____________________________________________")
    }

    fun infoList() {
        listOfLotoCard.forEach {
            info()
            println()
        }
    }


    /* object LotoCard:Card() {
         override fun createCard(): Array<Array<Int>> {
             return super.createCard()
         }
     }*/
 object LotoCard {
        var card = arrayOf<Array<Int>>()
        fun createCard(): LotoCard {


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

            /*for (array in card) {
                println("____________________________________________")
                for (value in array) {
                    print("$value |".padStart(4).padEnd(5))
                }
                println()
            }
            println("____________________________________________")
*/
            return LotoCard
        }
}



}


