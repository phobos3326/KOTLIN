class DebitCard : BankCard() {

    override var balance: Float
        get() = super.balance
        set(value) {}

    /*  override var balance: Float
          get() = TODO("Not yet implemented")
          set(value) {}
  */

    /*
        override fun toString(): String {
            return balance.toString()
        }*/


    override fun balanceUp(cashInFlow: Float) {
        balance += cashInFlow
        println("карта пополнена на $cashInFlow")

    }

    override fun pay(paymentAmount: Float): Boolean {
        if (balance < paymentAmount) {
            println("недостаточно средств")
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
        }
        return true
    }

    override fun getBalance() {
        println("баланс карты $balance")
    }

    override fun getAvailableMoney() {
        TODO("Not yet implemented")
    }

    fun upPercent() {

        balance += (balance / 100 * 1.5f)
    }


}