import kotlin.random.Random

class Gamer {
    // private val card = Card()
    private var listOfCards = mutableListOf<Array<Int>>()

    val lotoCard = object : Card() {
        override fun createCard(): Array<Array<Int>> {
            return super.createCard()
        }
    }

    /*fun takeCard(numberOfCards: Int): MutableList<Array<Int>> {
        for (i in 1..numberOfCards) {
            val a = card.createCard()
            listOfCards += a

        }
        // card.createCard()


        return listOfCards
    }*/


    fun takeCard(numberOfCards: Int): MutableList<Card> {
        val listOfLotoCard = mutableListOf<Card>()

        for (i in 1..numberOfCards) {
            val a = lotoCard
            listOfLotoCard.add(a)
        }

        return listOfLotoCard
    }

    fun createGamer(): Gamer {
        println("игрок создан")
        return Gamer()
    }

    fun info() {
        for (array in listOfCards) {
            println("____________________________________________")
            for (value in array) {
                print("$value |".padStart(4).padEnd(5))
            }
            println()

        }
        println("____________________________________________")
    }

    fun infoList() {
        listOfCards.forEach {
            info()
            println()
        }
    }


    /* object LotoCard:Card() {
         override fun createCard(): Array<Array<Int>> {
             return super.createCard()
         }
     }*/




}


