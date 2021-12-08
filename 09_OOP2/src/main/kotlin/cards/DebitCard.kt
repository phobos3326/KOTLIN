package cards

import BankCard

open class DebitCard(fl: Float) : BankCard() {

    override var balance: Float = fl


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

        return if (balance < paymentAmount) {
            println("оплата на сумму $paymentAmount. недостаточно средств")
            false
        } else {
            balance -= paymentAmount
            println("оплата на сумму $paymentAmount")
            true
        }
    }



    override fun getBalance() {
        println("баланс карты $balance")
    }

    override fun getAvailableMoney() {
        println("собственные средства $balance")
    }

    fun upPercent() {
        balance += (balance / 100 * 1.5f)
    }


}