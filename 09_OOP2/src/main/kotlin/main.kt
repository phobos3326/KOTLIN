fun main() {

    val wallet = Wallet().myWallet



    repeat(2) {
        cardUse(wallet)
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