import cards.DebitCard
import cards.DebitCardCashBack

fun main() {

    //val wallet = Wallet().myWallet

    val card = DebitCardCashBack(50f)

    repeat(10) {
        creditCardUse(card)
        println("_________________")
    }
}

fun cardUse(wallet: List<DebitCard>) {
    val a = (1..100).random().toFloat()
    val b = (1..100).random().toFloat()
    wallet.forEach { item ->
        item.getBalance()
        item.balanceUp(a)
        item.getBalance()
        item.upPercent()
        item.pay(b)
        item.getBalance()
    }
}

fun creditCardUse(card: DebitCardCashBack) {
    val a = (1..100).random().toFloat()
    val b = (1..1000).random().toFloat()
    card.balanceUp(a)
    card.getAvailableMoney()
    card.pay(b)
    card.getAvailableMoney()
   // card.upPercent()
    card.getAvailableMoney()

}