package cards

class DebitCardCashBack(fl: Float) : DebitCard(fl) {

    override var balance: Float = fl

    var shoping = 0f
    private var bonusScore = 0f

    private var cashBack = 0f
    private var paySumma = 0f


    override fun balanceUp(cashInFlow: Float) {
        super.balanceUp(cashInFlow)
    }


    override fun pay(paymentAmount: Float): Boolean {
        paySumma += paymentAmount
        shoping = paymentAmount
        shopping()
        return if (balance < paymentAmount) {
            println("оплата на сумму $paymentAmount. недостаточно средств")
            false
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
            cashBack()
            true
        }

    }

    override fun getBalance() {
        super.getBalance()
    }

    override fun getAvailableMoney() {
        super.getAvailableMoney()
        println("Бонусные баллы в размере $bonusScore от покупок")
        println("--> $cashBack кэшбэк 5% от покупок при условии трат больше 100.")
    }

    private fun shopping() {
        bonusScore += (shoping / 100 * 1f)
    }

    private fun cashBack() {
        if (paySumma > 100) {
            cashBack += (paySumma / 100 * 5f)
            paySumma = 0F
        }
    }

}