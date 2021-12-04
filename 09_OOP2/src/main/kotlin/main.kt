fun main() {

    val wallet = Wallet().myWallet


    /*repeat(2) {
        cardUse(wallet)
        println("_________________")
    }
*/
    val card = CreditCard(50f)

    repeat(2) {
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

fun creditCardUse(card: CreditCard) {
    val a = (1..100).random().toFloat()
    val b = (1..100).random().toFloat()
    card.balanceUp(a)
    //card.getBalance()
    card.getAvailableMoney()
    card.pay(b)
    card.getAvailableMoney()
    //card.getBalance()
    card.upPercent()
    card.getAvailableMoney()
}