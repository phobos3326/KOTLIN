package cards

class DebitCardCashBack(fl: Float) : DebitCard(fl) {

    override var balance: Float = fl

    var shoping = 0f
    var bonusScore = 0f

    var cashBack = 0f
    private var paySumma = 0f


    override fun balanceUp(cashInFlow: Float) {
        super.balanceUp(cashInFlow)
    }

    override fun pay(paymentAmount: Float): Boolean {
        paySumma += paymentAmount
        shoping = paymentAmount
        shopping()
        cashBack()
        return super.pay(paymentAmount)

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
        if (paySumma > 100 && !pay()){
            cashBack+=(paySumma/100 *5f)
            paySumma= 0F
        }
    }

}