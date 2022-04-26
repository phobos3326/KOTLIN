import Card.LottoCard
import Card.Row

class Gamer {

     var listOfLottoCard = mutableListOf<LottoCard>()


    fun takeCard(numberOfCards: Int) {
        for (i in 1..numberOfCards) {
            val lottoCard = LottoCard()
            lottoCard.createCard()
            listOfLottoCard.add(lottoCard)
        }

    }

    fun createGamer(): Gamer {
        println("игрок создан")
        return Gamer()
    }

    fun info() {
        listOfLottoCard.forEach { it.viewCard() }
    }

    fun checkCard(){
        listOfLottoCard.forEach { lottoCard ->
            lottoCard.listOfRowInCard.forEach {
                it.listOfCellInRow.forEach {
                    it.value="x"
                }
            }
    }
    }

}


