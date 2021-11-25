fun main() {

    /* val debitCard = DebitCard(5)

     println("$debitCard")
     debitCard.info()
     debitCard.balanceUp()
     debitCard.info()*/

    val wallet = Wallet().myWallet

    cardUse(wallet)

}

fun cardUse(wallet: List<DebitCard>) {

    wallet.forEach { item ->
        item.getBalance()
        item.balanceUp()
        item.getBalance()
        item.upPercent()
        item.pay()
        item.getBalance()


    }

}